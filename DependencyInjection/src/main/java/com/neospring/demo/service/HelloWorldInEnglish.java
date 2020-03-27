package com.neospring.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldInEnglish implements HelloWorldService{

	@Override
	public String greeting() {
		return "Hello World";
	}

}
