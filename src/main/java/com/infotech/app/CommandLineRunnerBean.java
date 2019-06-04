package com.infotech.app;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandLineRunnerBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception 	//this args argument is same as passed in SpringBootCommandLineRunnerDemoApplication main method
	{
		String collectStr = Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println("Mohit:"  + collectStr);
	}

}
