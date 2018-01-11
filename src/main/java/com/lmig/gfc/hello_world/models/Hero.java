package com.lmig.gfc.hello_world.models;

public class Hero {
	
	private String firstName;
	private String lastName;
	private String secretIdentity;
	
	public Hero() {
		
	}
	
	public Hero(String firstName, String lastName, String secretIdentity) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.secretIdentity = secretIdentity;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSecretIdentity() {
		return secretIdentity;
	}
	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}

}
