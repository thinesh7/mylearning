package com.aa.myfunctional.interfcae.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface AccountService {
	List<Account> getAllActiveAccountsByType(List<Account> accountList, String accType, Account acc);
}

class Account {

	public String accNumber;
	public String accType;
	public boolean isActive;

	public Account(String accNumber, String accType, boolean isActive) {
		this.accNumber = accNumber;
		this.accType = accType;
		this.isActive = isActive;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accType=" + accType + ", isActive=" + isActive + "]";
	}
}

class AccountListProcessor {

	public List<Account> getAllActiveAccountsByType(AccountService accountService, List<Account> accountList,
			String accType, Account acc) {
		return accountService.getAllActiveAccountsByType(accountList, accType, acc);
	}

}

public class MyBiFunctionalInterfaceTester {

	public static void main(String[] args) {
		
		Account accccc = new Account("ACC05", "CURRENT", true);
		accccc.accNumber = "??";
		System.out.println(accccc.accNumber);

		List<Account> allAccountList = Arrays.asList(new Account("ACC01", "CURRENT", true),
				new Account("ACC02", "SAVINGS", true), new Account("ACC03", "CURRENT", false),
				new Account("ACC04", "SAVINGS", false), new Account("ACC05", "CURRENT", true),
				new Account("ACC06", "SAVINGS", true));

		List<Account> allAccList = new ArrayList<>(allAccountList);

		AccountListProcessor processor = new AccountListProcessor();

		Account testAccount = new Account("Aiyoo", null, false);

		allAccountList = processor.getAllActiveAccountsByType((accList, accType, account) -> {
			Object clone = ((ArrayList<Account>)accList).clone();
			List<Account> accList1 = ((List<Account>)clone);
			accList1.removeIf(acc -> (!acc.accType.equals(accType) || !acc.isActive));
			accList1.add(new Account("?", "TEST TYPE", false));
			account.setAccType(" --> Aiyoo Type <-- ");
			return accList1;
		}, allAccList, "SAVINGS", testAccount);

		allAccountList.sort((x, y) -> -(x.accNumber.compareTo(y.accNumber)));

		allAccountList.forEach(System.out::println);

		/*
		 * Account [accNumber=ACC06, accType=SAVINGS, isActive=true] Account
		 * [accNumber=ACC02, accType=SAVINGS, isActive=true] Account [accNumber=,
		 * accType=null, isActive=false]
		 */

		System.out.println("---");

		System.out.println(allAccList);

		/*
		 * [Account [accNumber=ACC06, accType=SAVINGS, isActive=true], Account
		 * [accNumber=ACC02, accType=SAVINGS, isActive=true], Account [accNumber=?,
		 * accType=TEST TYPE, isActive=false]]
		 */

		System.out.println(testAccount);

		// Account [accNumber=Aiyoo, accType= --> Aiyoo Type <-- , isActive=false]
		
		String a = "abcdaqwerttyyuiopokjh";
		String b= "kj*h";
		
		System.out.println("--> "+b.indexOf('*'));
		String substring = b.substring(b.indexOf('*')+1);
		System.out.println(substring);
		
		List<Character> kk =  a.chars().mapToObj(x -> (char)x).collect(Collectors.toList());
		
		kk.forEach(System.out::println);
		
		System.out.println(a.indexOf('k'));
		System.out.println(a.indexOf(b));
	}
}
