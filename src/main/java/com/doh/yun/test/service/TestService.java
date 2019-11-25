package com.doh.yun.test.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface TestService {
	
	List<Map<String, Object>> testConnection(Map<String, Object> paramMap);

}
