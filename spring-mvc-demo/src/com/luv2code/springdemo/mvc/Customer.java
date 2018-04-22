package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	//added this comment to test the gitpush
	
	//added another line
	
	// another one!
	
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to ten")
	private Integer freePasses;
	
	@NotNull
	@Pattern(regexp="^[a-zA-z0-9]{5}", message="only 5 char/digits")
	private String zipCode;
	
	@CourseCode (value = "TOPS",message = "must start with TOPS")
	private String courseCode;
	
	public Customer() {
		
		this.freePasses = 10;
		
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	

	
}
