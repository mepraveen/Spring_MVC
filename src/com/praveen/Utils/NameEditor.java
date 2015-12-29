package com.praveen.Utils;

import java.beans.PropertyEditorSupport;



public class NameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException{
		
		if(name.contains("Mr. ") || name.contains("Ms.")){
		setValue(name);
		}
		else{
			setValue("Ms."+name);
		}
				
			
		
	}
}
