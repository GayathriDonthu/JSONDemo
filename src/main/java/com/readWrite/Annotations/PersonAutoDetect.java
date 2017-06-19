package com.readWrite.Annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PUBLIC_ONLY)
public class PersonAutoDetect {
	
	public long personId = 0;
	String name = null;
	
}
