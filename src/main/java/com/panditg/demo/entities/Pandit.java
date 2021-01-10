package com.panditg.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pandit {
	  
	@Id
	@GeneratedValue
	private long id;
	
	private String domainId;
	private String firstName;	
	private String lastName;
	private String contactNumber;	
	private String city;	
	private String emailId;	
	private String password;
	public Pandit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pandit(long id, String domainId, String firstName, String lastName, String contactNumber,
			String city, String emailId, String password) {
		super();
		
		this.id = id;
		this.domainId = domainId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.city = city;
		this.emailId = emailId;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDomainId() {
		return domainId;
	}
	public void setDomainId(String domainId) {
		this.domainId = domainId;
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
	@Override
	public String toString() {
		return "Pandit [id=" + id + ", DomainId=" + domainId + ", FirstName=" + firstName + ", LastName="
				+ lastName + ", ContactNumber=" + contactNumber + ", City=" + city + ", EmailId=" + emailId
				+ ", Password=" + password + ", getId()=" + getId() + ", getDomainId()=" + getDomainId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getContactNumber()="
				+ getContactNumber() + ", getCity()=" + getCity() + ", getEmailId()=" + getEmailId()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
