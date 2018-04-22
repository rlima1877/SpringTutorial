package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;
	
	// this method is called with an array coming from the @CourseCode annotation such as : value = {"TOPS", "TEST"}
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	
	}
	
	// business logic for course code...could call a DB...API..etc..
	// loop through course prefixes that we've received from the annotation and see if anything matches what the user entered in the form
	// if at least one match is found, this method will return true, considering it a pass, otherwise, a false is returned, considering it a failed.
	// Parameter 1: String theCode - this is the string which the user entered from the form, it will call setters on that object field, then go through validation.

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		
		if (theCode != null) {
			
			for(String tempPrefix : coursePrefixes) {
				
				result = theCode.toLowerCase().startsWith(tempPrefix.toLowerCase());
				
				//if we found a match then break out of the loop
				if(result) {
					break;
				}
			}
		}else {
			result = true;
		}
		
		return result;
	}

}
