package com.ms.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.config.UserConfig;

@RestController
@RequestMapping("/user")
public class UserTest {

	@Autowired
	UserConfig userConfig;

	@RequestMapping("/config")
	public String getConfigInfo() {
		return "user-1 " + userConfig.getName() + " " + userConfig.getAge() + " " + userConfig.getSex();
	}

}
