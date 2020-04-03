package com.yu.annotationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class AnnotationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationDemoApplication.class, args);
	}

}
