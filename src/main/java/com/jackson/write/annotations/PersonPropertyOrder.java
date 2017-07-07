package com.jackson.write.annotations;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "name", "id" })
public class PersonPropertyOrder {

	public long id = 0;
	public String name = null;

}
