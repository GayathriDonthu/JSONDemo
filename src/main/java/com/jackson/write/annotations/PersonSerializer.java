package com.jackson.write.annotations;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PersonSerializer {

	public long personId = 0;
	public String name = "Hari";

	@JsonSerialize(using = OptimizedBooleanSerializer.class)
	public boolean enabled = false;

}
