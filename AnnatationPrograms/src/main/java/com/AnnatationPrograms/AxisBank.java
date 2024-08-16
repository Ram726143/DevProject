	package com.AnnatationPrograms;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component("ab")
public class AxisBank implements Bank{
	public String getbranch() {
		return "Honda";

	}
	

}
