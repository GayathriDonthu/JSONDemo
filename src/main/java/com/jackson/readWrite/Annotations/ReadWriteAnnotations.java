package com.jackson.readWrite.Annotations;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadWriteAnnotations {

	public static void main(String[] args) {

		jsonIgnore();
		jsonIgnoreProperties();
		jsonIgnoreType();
		jsonAutoDetect();
		PersonAutoDetect p = new PersonAutoDetect();
		System.out.println(p.personId);

	}

	/**
	 * ignore a certain property (field) of a Java object.
	 */
	private static void jsonIgnore() {

		System.out.println("\nJson Ignore........");
		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"personId\" : 34, \"name\" : \"Kiran\"}";

		try {
			Person person = objectMapper.readValue(personJson, Person.class);

			System.out.println("person.personId = " + person.personId);
			System.out.println("person.name = " + person.name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * list of properties of a class to ignore.
	 */
	private static void jsonIgnoreProperties() {

		System.out.println("\njsonIgnoreProperties...........");

		ObjectMapper objectMapper = new ObjectMapper();

		String empJson = "{ \"id\" : 23, \"firstName\" :\"Manish\", \"lastName\" : \"kapil\"}";

		try {
			Employee employee = objectMapper.readValue(empJson, Employee.class);

			System.out.println("employee.id = " + employee.id);
			System.out.println("employee.firstName = " + employee.firstName);
			System.out.println("employee.lastName = " + employee.lastName);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * mark a whole type (class) to be ignored everywhere that type is used
	 */
	private static void jsonIgnoreType() {

		System.out.println("\njsonIgnoreType...........");

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"personId\" : 345, \"name\" : \"kiran\", \"address\" : { \"streetName\" : \"GayathriNagar\", \"city\" : \"Hyderabad\"}}";

		try {

			PersonIgnoreType person = objectMapper.readValue(personJson, PersonIgnoreType.class);

			System.out.println("person.personId = " + person.personId);
			System.out.println("person.name = " + person.name);
			System.out.println("person.address = " + person.address);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * include properties which are not public, both when reading and writing
	 * objects
	 */
	private static void jsonAutoDetect() {

		System.out.println("\njsonAutoDetect.........");

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"personId\" : 34, \"name\" : \"Hari\" }";

		try {
			// objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
			// false);
			PersonAutoDetect person = objectMapper.readValue(personJson, PersonAutoDetect.class);

			System.out.println("person.personId = " + person.personId);
			System.out.println("person.name = " + person.name);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
