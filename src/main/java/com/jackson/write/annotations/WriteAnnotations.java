package com.jackson.write.annotations;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteAnnotations {

	public static void main(String[] args) {

		jsonInclude();
		jsonGetter();
		jsonAnyGetter();
		jsonPropertyOrder();
		jsonRawValue();
		jsonValue();
		jsonSerialize();

	}

	/**
	 * tells Jackson only to include properties if they are non-null, non-empty,
	 * or have non-default values. .
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

	/**
	 * enables you to use a Map as container for properties that you want to
	 * serialize to JSON.
	 */
	private static void jsonAnyGetter() {

		System.out.println("jsonAnyGetetr...");

		ObjectMapper objectMapper = new ObjectMapper();

		PersonAnyGetter person = new PersonAnyGetter();

		person.set("id", 45);

		try {
			String personJson = objectMapper.writeValueAsString(person);

			System.out.println("person.id = " + person.properties());

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * used to specify in what order the fields of your Java object should be
	 * serialized into JSON.
	 */
	private static void jsonPropertyOrder() {

		System.out.println("jsonPropertyOrder...");

		PersonPropertyOrder person = new PersonPropertyOrder();

		person.id = 34;
		person.name = "Kevin";

		try {
			String personJson = new ObjectMapper().writeValueAsString(person);

			System.out.println("personJson = " + personJson);

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * tells Jackson that this property value should written directly as it is
	 * to the JSON output.
	 */
	private static void jsonRawValue() {

		System.out.println("jsonRawValue....");

		PersonRawValue person = new PersonRawValue();

		try {
			String personJson = new ObjectMapper().writeValueAsString(person);

			System.out.println("personJson = " + personJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

	/**
	 * tells Jackson that Jackson should not attempt to serialize the object
	 * itself, but rather call a method on the object which serializes the
	 * object to a JSON string.
	 */
	private static void jsonValue() {

		System.out.println("jsonValue.....");

		PersonValue person = new PersonValue();

		try {
			String personJson = new ObjectMapper().writeValueAsString(person);
			System.out.println("personJson = " + person.toJson());

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

	/**
	 * used to specify a custom serializer for a field in a Java object.
	 */
	private static void jsonSerialize() {

		System.out.println("jsonSerialize.......");

		PersonSerializer person = new PersonSerializer();

		try {
			String personJson = new ObjectMapper().writeValueAsString(person);
			System.out.println("personJson = " + personJson);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
