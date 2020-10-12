package com.example.os.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootProject11Oct2ndprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject11Oct2ndprojectApplication.class, args);
	}
	
	@GetMapping("/method1")
	public String method1() {
		
		return "method1 result in spring boot project";
	}
	
	
	@GetMapping("/method4")
	public String method2() {
		
		return "method2 result in spring boot project";
	}
	
	@GetMapping("/method5")
	public String method5() {
		
		return "method2 result in spring boot project";
	}
	
	
	

}
