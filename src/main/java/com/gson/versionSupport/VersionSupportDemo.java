package com.gson.versionSupport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VersionSupportDemo {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();
		builder.setVersion(2.0);

		Gson gson = builder.create();

		writingJson(gson);
		readingJson(gson);

	}

	private static void writingJson(Gson gson) {
		Person person = new Person();
		person.firstName = "Mike";
		person.lastName = "Robert";
		person.middleName = "Blocks";
		person.email = "mikerobert@dm.com";

		String personJson = gson.toJson(person);

		System.out.println("personJson = " + personJson);
	}

	private static void readingJson(Gson gson) {

		String personJson = "{ \"firstName\" : \"Mark\", \"lastName\" : \"Robert\", \"middleName\" : \"Blocks\", \"email\" : \"markrobert@ymail.com\" }";

		Person person = gson.fromJson(personJson, Person.class);

		System.out.println("person.firstName = " + person.firstName + "person.lastName = " + person.lastName
				+ "person.middleName = " + person.middleName + "person.email = " + person.email);

	}
}
