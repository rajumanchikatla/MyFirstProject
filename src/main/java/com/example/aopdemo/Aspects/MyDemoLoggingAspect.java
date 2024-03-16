package com.example.aopdemo.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our advices for logging 
	
	@Before("execution(* add*(..))")
//	@Before("execution(public void updateAccount())")

	public void beforeAddAccountAdvice(){
		System.out.println("\n====> executing @before advice on addaccount");
	}
	
	
}
