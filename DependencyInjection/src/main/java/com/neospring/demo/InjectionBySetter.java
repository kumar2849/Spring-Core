package com.neospring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionBySetter {
	
	HelloWorld helloWorld;

	public void getMessage(){
		helloWorld.sayHello();
	}
	
	@Autowired
	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	

}
