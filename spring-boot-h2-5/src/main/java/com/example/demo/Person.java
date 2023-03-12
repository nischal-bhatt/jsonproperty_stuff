package com.example.demo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person implements Serializable{
	
	@JsonProperty("nama-saya")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
