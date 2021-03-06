package com.learning.springmvcthroughxml.demo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.learning.springmvcthroughxml.demo.validation.CourseCode;

public class Customer {

	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	@NotNull(message="is required")
	@Min(value = 0,message = " must be greater than zero")
	@Max(value = 10, message = "must be less than or equal to Ten")
	private Integer freepasses;
	@Pattern(regexp = "^[0-9]{6}",message = " only 6 charaters is allowed ")
	private String postalCode;
	@CourseCode()
	private String courseCode;
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

	public Integer getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
