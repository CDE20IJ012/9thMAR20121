package com.demo.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

	
	@GetMapping("/")
	public String greet()
	{
		return "hello";
	}
}
