package com.shivaraj.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloworldApplication.class, args);
		
		BinarySearchImpl bsiObject = context.getBean(BinarySearchImpl.class);
		int[] initialNumbers = {10,4,56,6};
		bsiObject.binarySearch(initialNumbers,4);
	}

}
