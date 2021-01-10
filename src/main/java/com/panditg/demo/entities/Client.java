package com.panditg.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Client {
		
	public Client(long clientId, String firstName, String lastName, String contactNumber, String city, String emailId,
			String password) {
		super();
		this.clientId = clientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.city = city;
		this.emailId = emailId;
		this.password = password;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue 
	private long clientId;

	private String firstName;	
	private String lastName;	
	private String contactNumber;	
	private String city;	
	private String emailId;	
	private String password;
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
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
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [ClientId=" + clientId + ", FirstName=" + firstName + ", LastName=" + lastName
				+ ", ContactNumber=" + contactNumber + ", City=" + city + ", EmailId=" + emailId + ", Password="
				+ password + ", getClientId()=" + getClientId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getContactNumber()=" + getContactNumber() + ", getCity()="
				+ getCity() + ", getEmailId()=" + getEmailId() + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
