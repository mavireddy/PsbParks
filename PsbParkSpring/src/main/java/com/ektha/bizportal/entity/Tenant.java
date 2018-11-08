package com.ektha.bizportal.entity;

public class Tenant {

	private String name;
	private Address address;
	private Contact contact;
	

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

/*	@Override
	public String toString() {
		return "<br>"+"Tenant Details"+"<br>"+"-----------------" +"<br>"+"Tenant : " + name +"<br>"+ "Address : " + address +"<br>"+ "Contact : " + contact+"<br>";
				
	}*/
	


	}
	



