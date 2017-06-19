package com.readWrite.Annotations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "firstName", "lastName" })
public class Employee {

	public long id = 0;

	public String firstName = null;
	public String lastName = null;

}
