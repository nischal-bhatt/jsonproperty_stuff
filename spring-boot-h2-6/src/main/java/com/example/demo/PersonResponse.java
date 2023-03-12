package com.example.demo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonResponse implements Serializable{

	@JsonProperty("this_is_a_test")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
