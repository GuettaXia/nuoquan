package com.nuoquan.controller;

import org.apache.yetus.audience.InterfaceAudience.Public;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String Hello() {
		return "hello!";
	}
	
}