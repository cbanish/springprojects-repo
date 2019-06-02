package com.spring.cloud.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String returnHello() {
		String url="http://hello-server/rest/hello/server";
		return restTemplate.getForObject(url, String.class);
		
	}

}
