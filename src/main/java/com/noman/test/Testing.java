package com.noman.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Testing {
	
	@Autowired
	private  Man man;
	@Autowired
	private User user;
	
	
	public void checkMethod() {
		
		user.setFirstName("Noman");
		user.setLastName("Ghous");
		System.out.println(user.hashCode());
		System.out.println("Now Man ///////////////");
		
		System.out.println(man.hashCode());
		
	}
	public void checkMethod2() {
		
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.hashCode());
		System.out.println("Now Man ///////////////");
		
		System.out.println(man.hashCode());
		
	}
}
