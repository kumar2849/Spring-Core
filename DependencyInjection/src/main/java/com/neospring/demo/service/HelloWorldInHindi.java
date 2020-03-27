package com.neospring.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class HelloWorldInHindi implements HelloWorldService{

	@Override
	public String greeting() {
		return "Namaste Duniya";
	}

}
