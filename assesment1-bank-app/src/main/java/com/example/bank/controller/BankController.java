package com.example.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/bank/name")
	public String getBankName() {
		return "State Bank Of India";
	}
	
	@GetMapping("/bank/address")
	public String getBankAddress() {
		return "Neeladri Nagar, Electronic City, Banglore";
	}
}