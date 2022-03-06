package com.interfacetest;

public class Service implements AccountService, CardService {

	@Override
	public void getCards() {
		System.out.println("Cards");
	}

	@Override
	public void getAccount() {
		System.out.println("Accounts");
	}

	@Override
	public void defaultMethod() {
		AccountService.super.defaultMethod();
		CardService.super.defaultMethod();
	}

	/*
	 * way 1:
	 * 
	 * @Override public void defaultMethod() { 
	 * 			our Impl 
	 * }
	 */

	/* way 2:
	 * @Override public void defaultMethod() {
	 *  AccountService.super.defaultMethod();
	 * } /*
	 * 
	 * 
	 * way 3:
	 * 
	 * @Override public void defaultMethod() { 
	 * AccountService.super.defaultMethod();
	 * CardService.super.defaultMethod(); 
	 * }
	 */
}
