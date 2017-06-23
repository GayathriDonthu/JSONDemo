package com.write.annotations;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PersonInclude {
	
	public long id = 0;
	public String name = null;
	
}
