package com.doh.yun.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doh.yun.test.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		Map<String, Object> paramMap = new LinkedHashMap<>();
		List<Map<String, Object>> resultList = testService.testConnection(paramMap); 
		
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("databaseConnectionResult", resultList.get(0).get("test") );
		return "test";
	}
	
}
