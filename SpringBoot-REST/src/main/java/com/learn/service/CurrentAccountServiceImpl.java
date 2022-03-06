package com.learn.service;

import org.springframework.stereotype.Service;

@Service("ser")
public class CurrentAccountServiceImpl implements AccountService {

	public CurrentAccountServiceImpl() {
		System.out.println(" -> Obj CurrentAccountServiceImpl Creation");
	}

	@Override
	public void callMe() {
		System.out.println("CurrentAccountServiceImpl :: callMe");
	}

}
