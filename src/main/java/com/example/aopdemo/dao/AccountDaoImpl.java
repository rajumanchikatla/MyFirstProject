package com.example.aopdemo.dao;

import org.springframework.stereotype.Repository;

import com.example.aopdemo.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+" :Adding an account form Account Dao");
	}

}
