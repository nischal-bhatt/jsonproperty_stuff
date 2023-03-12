package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@PostMapping("/sendPerson")
	public PersonResponse getPerson(@RequestBody PersonDto personDto)
	{
		System.out.println(personDto.getName() + " nish ");
		PersonResponse personResponse = new PersonResponse();
		personResponse.setMessage("hhello world");
		return personResponse;
	}
}
