package com.test;

import javax.validation.ValidatorFactory;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;


public class ValidationExample {
	public static void main(String[] args) {
	ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
	Validator validator=validatorFactory.getValidator();
	System.out.println("Checking for invalid user data..");
	System.out.println("-------------------------------------");
	User invalidUser=new User("12","Kandasamy", "kandasamy@gmail.com");
	Set<ConstraintViolation<User>> violations = validator.validate(invalidUser);
	if(violations.isEmpty()) {
		System.out.println("Valid user data provided");
	}else {
		System.out.println("Invalid user data found");
		for(ConstraintViolation<User> violation:violations) {
			System.out.print(violation.getMessage());
		}
	}
	
	
	
	System.out.println("Checking for valid user data..");
	System.out.println("-------------------------------------");
	User validUser=new User("11","Ramasamy","ramasamy@gmail.com");
	       violations = validator.validate(validUser);
	if(violations.isEmpty()) {
		System.out.println("Valid user data provided");
	}else {
		System.out.println("Invalid user data found");
		for(ConstraintViolation<User> violation:violations) {
			System.out.print(violation.getMessage());
		}
	}
	System.out.println("---------------------------------");
	
}
	private static ValidatorFactory buildDefaultValidatorFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Date getPastOrFutureDate(int days) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
	}