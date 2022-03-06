package com.learn.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("serr")
@Primary
public class SavingsAccountServiceImpl implements AccountService {

	public SavingsAccountServiceImpl() {
		System.out.println(" -> Obj SavingsAccountServiceImpl Creation");
	}

	@Override
	public void callMe() {
		System.out.println("SavingsAccountServiceImpl :: callMe");
	}

}
