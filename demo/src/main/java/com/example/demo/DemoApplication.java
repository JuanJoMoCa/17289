package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("HOLA");
	}

	@RequestMapping("/hola") 
	public String hola(){
		System.out.println("hola");
		return "DEJEN DE MODIFICARME";
	}

	@RequestMapping("/html") 
	public String html(){
		String html = "hola";
		return html;
	}

	

}
