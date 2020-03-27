package com.neospring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.neospring.demo.controller.GreetingController;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;

@SpringBootApplication
public class SpringHelloApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringHelloApplication.class, args);
		//DI with constructor
		InjectByConstructor injectByConstructor = (InjectByConstructor) ctx.getBean("injectByConstructor");
		injectByConstructor.getMessage();
		
		
		//DI with Setter
		InjectionBySetter injectionBySetter = (InjectionBySetter)ctx.getBean("injectionBySetter");
		injectionBySetter.getMessage();
		
		// DI with interface and profiles
		GreetingController bean = (GreetingController) ctx.getBean("greetingController");
		bean.greeting();
	}

}
