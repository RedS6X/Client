package com.client.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${some.value}")
	private int myValue;
	
	
	@GetMapping("/myValue")
	public int myValue() {
		return this.myValue;
	}
	

	
}
