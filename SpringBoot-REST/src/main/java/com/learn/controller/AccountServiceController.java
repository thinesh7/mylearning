package com.learn.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.learn.entity.Account;
import com.learn.repository.AccountRepository;

@RestController
@RequestMapping(value = "/v1/api")
//@GetMapping(value = "/allAcc") -> Cannot use here
public class AccountServiceController {

	@Value("${server.port}")
	private String serverPort;

	@Autowired
	private AccountRepository accountRepository;

	@GetMapping(value = "/allAcc")
	public ResponseEntity<List<Account>> getAllAccounts() {
		return ResponseEntity.ok(accountRepository.findAll());
	}

	@GetMapping(value = "/getAccount") // -> Only get Mapping
	public ResponseEntity<Account> getAccount(@RequestParam(name = "accountNumber", required = true) String accNo) {
		Account acc = accountRepository.findByaccountNumber(accNo);
		System.out.println(acc);
		return ResponseEntity.ok(acc);
	}
	
	@RequestMapping("/test") // -> can able to handle any request ..!
	public ResponseEntity<Account> getAccount22(@RequestParam(name = "accountNumber", required = true) String accNo) {
		Account acc = accountRepository.findByaccountNumber(accNo);
		System.out.println(acc);
		return ResponseEntity.ok(acc);
	}
}
