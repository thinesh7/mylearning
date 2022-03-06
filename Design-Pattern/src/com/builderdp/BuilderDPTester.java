package com.builderdp;

import com.builderdp.BankAccount.BankAccountBuilder;

public class BuilderDPTester {

	public static void main(String[] args) {

		BankAccountBuilder builder = BankAccount.builder();

		BankAccount build = builder.setAccHolderName("Thinesh").setAccNo("123456").setAccType("Savings").build();

		System.out.println(build); // BankAccount [accHolderName=Thinesh, accNo=123456, accType=Savings]

		BankAccount build1 = BankAccount.builder().build();
		System.out.println(build1); // BankAccount [accHolderName=null, accNo=null, accType=null]
		build1.setAccNo("123456");
		build1.setAccHolderName("Test");
		build1.setAccType("Currrent");

		System.out.println(build1); // BankAccount [accHolderName=Test, accNo=123456, accType=Currrent]

		System.out.println(build.equals(build1)); // true
	}
}
