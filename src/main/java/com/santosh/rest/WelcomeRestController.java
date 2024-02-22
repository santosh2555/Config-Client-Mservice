package com.santosh.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeRestController {
	
	@Value("${welcome.msg}")
	private String msg;

	@GetMapping("/")
	public String getWelcomeMsg() {
		return msg;
	}
}
