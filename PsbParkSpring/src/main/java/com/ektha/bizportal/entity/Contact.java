package com.ektha.bizportal.entity;

public class Contact {

	private String email_id;
	private String phone_number;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/*@Override
	public String toString() {
		return "<br>"+ "email_id : " + email_id +"<br>"+ " phone_number : " + phone_number + "<br>";
	}*/

}

