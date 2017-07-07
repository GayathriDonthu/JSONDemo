package com.jackson.readWrite.Annotations;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {

	@JsonIgnore
	public long personId = 0;

	public String name = null;

}
