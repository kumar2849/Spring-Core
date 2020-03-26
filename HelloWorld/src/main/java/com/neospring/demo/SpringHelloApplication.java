package com.neospring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.neospring.demo.service.HelloWorld;

@SpringBootApplication
public class SpringHelloApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringHelloApplication.class, args);
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
		helloWorld.sayHello();
	}

}
