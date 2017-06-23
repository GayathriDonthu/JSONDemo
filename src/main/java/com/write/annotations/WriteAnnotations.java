package com.write.annotations;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.readWrite.Annotations.Person;

public class WriteAnnotations {
	
	public static void main(String[] args) {
		
		jsonInclude();
		jsonGetter();
		
	}

	
	/**
	 * tells Jackson only to include properties if they are non-null, non-empty, or have non-default values. .
	 */
	private static void jsonInclude() {
		
		System.out.println("jsonInclude.........");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		PersonInclude person = new PersonInclude();
		
		person.id = 23;
		person.name = "";
		
		try {
			String personJson = objectMapper.writeValueAsString(person);
			
			System.out.println("personJson = " + personJson);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void jsonGetter() {
		
		System.out.println("jsonGetter.........");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		PersonGetter person = new PersonGetter();
		
		person.personId = 56;
		
		try {
			String personJson = objectMapper.writeValueAsString(person);
			
			System.out.println("personJson = " + personJson);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}

	
}
