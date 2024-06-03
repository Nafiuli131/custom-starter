package com.example.demo;

import com.example.addition_custom_starter.DoAddition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.addition_custom_starter")
public class DemoApplication {
	
	public final DoAddition doAddition;

	public DemoApplication(DoAddition doAddition) {
		this.doAddition = doAddition;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DemoApplication demoApplication = context.getBean(DemoApplication.class);
		demoApplication.setDoAddition();
	}

	public void setDoAddition(){
		int result = doAddition.addition(100,100);
		System.out.println("Result is -> "+result);
	}

}
