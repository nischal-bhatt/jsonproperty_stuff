package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PersonController {
	
	
	@GetMapping("/test")
	public PersonResponse sendPerson()
	{
		PersonDto personDto = new PersonDto();
		personDto.setName("this is my name!!!!! with 5 exclamation marks");
		
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.postForObject("http://localhost:8083/sendPerson", personDto, PersonResponse.class);
	}
	

}
