package com.read.annotations;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadAnnotations {

	public static void main(String[] args) {

		jsonSetter();
		jsonAnySetter();
		jsonCreator();
		jacksonInject();
		jsonDeserialize();

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

	/**
	 * instructs Jackson to call the same setter method for all unrecognized
	 * fields in the JSON object
	 */

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

	/**
	 * used to tell Jackson that the Java object has a constructor (a "creator")
	 * which can match the fields of a JSON object to the fields of the Java
	 * object.
	 * 
	 */

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

	/**
	 * used to inject values into the parsed objects, instead of reading those
	 * values from the JSON
	 * 
	 * In person object, only id and name are present, but we injected source
	 * name also, and in output the inject value is printed.
	 */

	private static void jacksonInject() {

		System.out.println("jsoninject.......");

		InjectableValues inject = new InjectableValues.Std().addValue(String.class, "jsonDemo.com");

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			PersonInject person = objectMapper.reader(inject).forType(PersonInject.class)
					.readValue(new File("src/main/resources/file/person.json"));

			System.out.println("person.id = " + person.id);
			System.out.println("person.name = " + person.name);
			System.out.println("person.source = " + person.source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * used to specify a custom de-serializer class for a given field in a Java object.
	 */

	private static void jsonDeserialize() {
		
		System.out.println("jsonDeserialize........");

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			PersonDeserialize person = objectMapper.reader(PersonDeserialize.class)
					.readValue(new File("src/main/resources/file/person-optimized-boolean.json"));
			
			System.out.println("person.id = " + person.id);
			System.out.println("person.name = " + person.name);
			System.out.println("person.enabled = " + person.enabled);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
