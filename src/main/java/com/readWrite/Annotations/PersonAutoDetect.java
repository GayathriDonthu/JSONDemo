package com.readWrite.Annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT)
public class PersonAutoDetect {

	public long personId = 0;
	public String name = null;

}
