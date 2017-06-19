package com.readWrite.Annotations;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class PersonIgnoreType {
	
	@JsonIgnoreType
	public static class Address {
		public String streetName = null;
		public String city = null;
	}
	
	public int personId = 0;
	public String name = null;
	public Address address = null;

}

