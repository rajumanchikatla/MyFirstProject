package com.example.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershiptDao {

	@Override
	
	public void addAccount() {
		System.out.println(getClass()+" :Adding membership account from membershipDao");
	}

}
