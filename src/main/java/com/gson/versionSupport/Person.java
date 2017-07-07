package com.gson.versionSupport;

import com.google.gson.annotations.Since;

public class Person {

	@Since(1.0)
	public String firstName = null;

	@Since(1.0)
	public String lastName = null;

	@Since(2.0)
	public String middleName = null;

	@Since(3.0)
	public String email = null;

}
