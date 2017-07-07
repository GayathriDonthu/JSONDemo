package com.jackson.read.annotations;

import com.fasterxml.jackson.annotation.JacksonInject;

public class PersonInject {

	public long id = 0;
	public String name = null;

	@JacksonInject
	public String source = null;

}
