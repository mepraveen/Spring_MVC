package com.praveen.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint( validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsVAlidHobby {
	
	
	//default value can be achieve using default and remove the parameter from @isvalid annotaion
	String listOfValidHobbies();
//	default "Music|Dance|Cricket|BaseBall";
	
	String message() default "Please enter Valid Hobby, Hobby accepted are  Music, Dance, Cricket and BaseBall (choose any)";
	 Class<?> [] groups() default{};
	 Class<? extends Payload> [] payload()  default{};
	 
}
