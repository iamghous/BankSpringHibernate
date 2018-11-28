package com.noman.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PSCodeConstraintValidator 
implements ConstraintValidator<PSCode,String>{

	public String codePrefix;
	
	public void initialize(PSCode code) {
		// TODO Auto-generated method stub
		codePrefix = code.value();
	}
	
	
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
	
		boolean result;
		if(code!=null) {
			result = code.startsWith(codePrefix);
		}
		else {
			result = true;
		}
		return result;
		
	}

}
