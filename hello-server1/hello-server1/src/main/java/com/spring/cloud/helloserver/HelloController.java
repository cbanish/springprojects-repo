package com.spring.cloud.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloController {
	
	@GetMapping
	public String returnHello() {
		return "Hello from Hello_server";
		
	}

}
