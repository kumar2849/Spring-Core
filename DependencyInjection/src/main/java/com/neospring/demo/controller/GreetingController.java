package com.neospring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.neospring.demo.service.HelloWorldService;

@Controller
public class GreetingController {
	HelloWorldService helloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void greeting(){
		System.out.println(helloWorldService.greeting());
	}

}
