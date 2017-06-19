package com.readWrite.Annotations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadWriteAnnotations {

	public static void main(String[] args) {

		jsonIgnore();
		jsonIgnoreProperties();
		jsonIgnoreType();

	}

	/**
	 * ignore a certain property (field) of a Java object.
	 */
	private static void jsonIgnore() {
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

	private static void jsonIgnoreType() {

		ObjectMapper objectMapper = new ObjectMapper();

		String personJson = "{ \"personId\" : 345, \"name\" : \"kiran\", \"address\" : { \"streetName\" : }}";

		try {

			PersonIgnoreType person = objectMapper.readValue(personJson, PersonIgnoreType.class);

			System.out.println("person.personId = " + person.personId);
			System.out.println("person.name = " + person.name);
			System.out.println("person = " + person);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
