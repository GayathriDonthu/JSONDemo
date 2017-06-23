package com.write.annotations;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class PersonRawValue {

	public long id = 0;

	// @JsonRawValue
	// public String address = "#$%";

	@JsonRawValue
	public String address = "{ \"street\" : \"Cafe Streer\", \"number\" : 23}";

}
