package com.ektha.bizportal.entity;

public class Location {


	private String location;
	private Address address;
	private Contact contact;
	private int noOfTenants;
	public int getNoOfTenants() {
		return noOfTenants;
	}
	public void setNoOfTenants(int noOfTenants) {
		this.noOfTenants = noOfTenants;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
/*	@Override
	public String toString() {
		return "Location : " + location +"<br>" + "<br>"+ "Address : " + address + "Contact : " + contact +"<br>";
	}
	*/
	

}

