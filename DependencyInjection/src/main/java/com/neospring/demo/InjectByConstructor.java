package com.neospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectByConstructor {
	HelloWorld helloWorld;
	@Autowired
	public InjectByConstructor(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	public void getMessage(){
		helloWorld.sayHello();
	}
	
}
