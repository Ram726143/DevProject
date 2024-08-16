package com.AnnatationPrograms;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cd")
//@Primary
public class SbiBank implements Bank {
	public String getbranch() {
		return "Hero";
	}

}
