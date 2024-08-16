package com.Transcation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;


@RestController
public class TransactionController {
	@Autowired
	SenderRepository sr;
	@Autowired
	ReceiverRepository rr;
	@Transactional																
	@PostMapping(value="/postTransaction")
	public String post(@RequestBody Transaction t) {
		sr.save(t.getSender());
		int a=10/0;
		rr.save(t.getReceiver());
		return "Transaction Successfully";
	}
}
