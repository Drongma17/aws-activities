package com.thonglam.awsbeanstalkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstalkDemoApplication {

	@GetMapping
	String home(){
		return "this is the test purpose only !!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkDemoApplication.class, args);
	}

}
