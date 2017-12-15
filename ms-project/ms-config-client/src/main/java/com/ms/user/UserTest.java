package com.ms.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserTest {
	
	@Value("dev-test2")
	String config;
	
	@RequestMapping("/config")
	public String getConfigInfo() {
		return config;
	}

}
