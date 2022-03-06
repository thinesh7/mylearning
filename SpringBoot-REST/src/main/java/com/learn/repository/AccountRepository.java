package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findByaccountNumber(String accountNumber);
}
