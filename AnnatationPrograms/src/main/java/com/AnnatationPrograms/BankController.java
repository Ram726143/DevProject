package com.AnnatationPrograms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class BankController {
	@Qualifier("cd")
	@Autowired
	Bank b;
	@GetMapping(value="/getBranch")
	public String getbranch() {
		return b.getbranch();
	}
}

