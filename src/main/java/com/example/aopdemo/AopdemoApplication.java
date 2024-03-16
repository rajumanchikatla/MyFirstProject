package com.example.aopdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.aopdemo.dao.AccountDao;
import com.example.aopdemo.dao.MembershiptDao;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountDao theAccountDAO,MembershiptDao theMembershiptDao){
		
		return runner-> {
			 demoTheBeforeAdvice(theAccountDAO, theMembershiptDao);
		};
	}


	private void demoTheBeforeAdvice(AccountDao theAccountDAO, MembershiptDao theMembershiptDao) {
		// TODO Auto-generated method stub
		//call the business method
		
		Account ac = new Account();
		theAccountDAO.addAccount(ac);
		System.out.println("calling memebershipdao");
		theMembershiptDao.addAccount();
		
//		System.out.println("lets call it again");
//		theAccountDAO.addAccount();
		
		

		
		
	}

}
