package com.ninos.firstcontext.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEndpoint {

	@GetMapping
	public String helloWorld() {
		return "hello world";
	}
}
