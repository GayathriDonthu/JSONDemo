package com.read.annotations;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadAnnotations {

	public static void main(String[] args) {

		jsonSetter();
		jsonAnySetter();
		jsonCreator();

	}

	/**
	 * tells Jackson that it should match the name of this setter method to a
	 * property name in the JSON data
	 */

	private static void jsonSetter() {

		System.out.println("jsonSetter...........");

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"id\" : 345, \"name\" : \"Hari\"}";

		try {

			PersonSetter person = objectMapper.readValue(personJson, PersonSetter.class);
			System.out.println("person.id = " + person.getPersonId());
			System.out.println("person.name = " + person.getName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void jsonAnySetter() {

		System.out.println("jsonAnySetter.............");

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"id\" : 23, \"name\" : \"Jack\"}";

		try {
			BagAnySetter bag = objectMapper.readValue(personJson, BagAnySetter.class);

			System.out.println("bag.id = " + bag.get("id"));
			System.out.println("bag.name = " + bag.get("name"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void jsonCreator() {

		System.out.println("jsonCreator..........");

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"id\" : 45, \"name\" : \"Gurmeet\"}";

		try {
			PersonCreator person = objectMapper.readValue(personJson, PersonCreator.class);
			System.out.println("person.id = " + person.getId());
			System.out.println("person.name = " + person.getName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
