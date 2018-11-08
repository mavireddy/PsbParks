package com.ektha.bizportal.entity;

public class Address {

	private String addr_line1;
	private String addr_line2;
	private String city;
	private String state;
	private String zipcode;

	public String getAddr_line1() {
		return addr_line1;
	}

	public void setAddr_line1(String addr_line1) {
		this.addr_line1 = addr_line1;
	}

	public String getAddr_line2() {
		return addr_line2;
	}

	public void setAddr_line2(String addr_line2) {
		this.addr_line2 = addr_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	/*@Override
	public String toString() {
		return "<br>"+"Address Line1 : " + addr_line1 +"<br>"+"Address Line2 : "
				+ addr_line2 + "<br>"+"City : " + city + "<br>"+"State : " + state + "<br>"+"Zipcode : " + zipcode +"<br>";
	}*/


}


