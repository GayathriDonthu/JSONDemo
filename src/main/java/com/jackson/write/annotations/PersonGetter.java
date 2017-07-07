package com.jackson.write.annotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PersonGetter {

	public long personId = 0;

	@JsonGetter("id")
	public long personId() {
		return this.personId;
	}

	@JsonSetter("id")
	public void personId(long personId) {
		this.personId = personId;
	}

}
