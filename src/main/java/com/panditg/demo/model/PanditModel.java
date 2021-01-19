package com.panditg.demo.model;

public class PanditModel {
	private long id;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String city;
	private String emailId;
	private String password;
	
	private long vidhiPanditId;
	private double dakshina;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getDakshina() {
		return dakshina;
	}
	public void setDakshina(double dakshina) {
		this.dakshina = dakshina;
	}
	public long getVidhiPanditId() {
		return vidhiPanditId;
	}
	public void setVidhiPanditId(long vidhiPanditId) {
		this.vidhiPanditId = vidhiPanditId;
	}
	
	
}
