package com.praveen.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	
	//this annotation is use for form validation this can also be done putting error msg in mesage property file
//	@Size(min=2,max=30, message="Please Enter HobbyField not less than {min} Alphabeta and no more than {max}")
	@Size(min=5,max=40)
	private String hobby;
	private Long mobile;
	
	@Past
	private Date dob;
	private Address address;
	private ArrayList<String> skills;
	
	
	public Student(){
		
	}
	public Student(String name, String hobby, Long mobile, Date dob, Address address,
			ArrayList<String> skills) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.mobile = mobile;
		this.dob = dob;
		this.address=address;
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	

}
