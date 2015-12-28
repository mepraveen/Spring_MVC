package com.praveen.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsVAlidHobby, String>

{
	
	private String listOfValidHobbies;

	@Override
	public void initialize(IsVAlidHobby isVAlidHobby) {
		// TODO Auto-generated method stub
		this.listOfValidHobbies=isVAlidHobby.listOfValidHobbies();
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		
		if(hobby==null){
			return false;
		}
		if(hobby.matches(listOfValidHobbies)){
			return true;
			
		}
		else{
		return false;
		}
	}

}
