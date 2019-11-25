package com.doh.yun.test.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doh.yun.test.mapper.TestMapper;
import com.doh.yun.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

	@Autowired
	TestMapper testMapper;

	@Override
	public List<Map<String, Object>> testConnection(Map<String, Object> paramMap) {
		logger.info("TestServiceImpl testConnection");
		return testMapper.testConnection(paramMap);
	}
	
	
}
