package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//@Configuration indicates this class contains Bean method
@Configuration
public class Config {
	
	//@Bean states this method returns a Bean (an Object)
	//to be managed in the ApplcationContext
	//Beans are singleton by default, only one instance is ever created

	@Bean
	public String init() {
		return "Success";
	}
	
	@Bean
	@Scope("prototype") // a new object is created everytime this is called
	public String anotherBean() {
		return "Another Bean";
	}
}
