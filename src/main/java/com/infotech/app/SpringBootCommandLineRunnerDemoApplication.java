package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.app.service.MessageServiceProvider;

@SpringBootApplication
public class SpringBootCommandLineRunnerDemoApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootCommandLineRunnerDemoApplication.class, args);
		MessageServiceProvider messageServiceProvider = configurableApplicationContext.getBean(MessageServiceProvider.class);
		
		String message = messageServiceProvider.message();
		System.out.println(message);
	}

}
