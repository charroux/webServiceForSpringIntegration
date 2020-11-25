package com.example.webServiceForSpringIntegration;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {
	
	@PutMapping("/")
	public String service(@RequestBody String s) {
		System.out.println(s + " received");
		return s + " received";
	}

}
