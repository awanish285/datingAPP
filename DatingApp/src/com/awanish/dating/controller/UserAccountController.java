package com.awanish.dating.controller;

import com.awanish.dating.dao.UserAccountDao;
import com.awanish.dating.dao.UserAccountDaoImpl;
import com.awanish.dating.model.Interest;
import com.awanish.dating.model.UserAccount;

public class UserAccountController {
	
	public static void main(String []args)
	{
		UserAccountController controller = new UserAccountController();
		controller.findAllUser();
	}
	
	
	public void registerUser()
	{
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setAge(30);
		userAccount.setCity("Austin");
		userAccount.setCountry("USA");
		userAccount.setEmail("abc@gmail.com");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567890");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Watching webSeries");
		interest.setHobbies("playing cricket");
		userAccount.setInterest(interest);
		dao.save(userAccount);
		
		System.out.println(dao.findById(1));
		
	}
	
	
	public void findAllUser()
	{
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("John");
		userAccount.setAge(30);
		userAccount.setCity("Austin");
		userAccount.setCountry("USA");
		userAccount.setEmail("abc@gmail.com");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567890");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Watching webSeries");
		interest.setHobbies("playing cricket");
		userAccount.setInterest(interest);
		dao.save(userAccount);
		
		
		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setUserName("John");
		userAccount2.setAge(30);
		userAccount2.setCity("Austin");
		userAccount2.setCountry("USA");
		userAccount2.setEmail("abc@gmail.com");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber("1234567890");
		Interest interest2 = new Interest();
		interest2.setId(1);
		interest2.setLikes("Watching webSeries");
		interest2.setHobbies("playing cricket");
		userAccount2.setInterest(interest);
		dao.save(userAccount2);
		
		UserAccount userAccount3 = new UserAccount();
		userAccount3.setId(3);
		userAccount3.setUserName("John");
		userAccount3.setAge(32);
		userAccount3.setCity("Austinsss");
		userAccount3.setCountry("USA");
		userAccount3.setEmail("abc@gmail.com");
		userAccount3.setPassword("password");
		userAccount3.setPhoneNumber("1234567890");
		Interest interest3 = new Interest();
		interest3.setId(1);
		interest3.setLikes("Watching webSeries");
		interest3.setHobbies("playing cricket");
		userAccount3.setInterest(interest3);
		dao.save(userAccount3);
		System.out.println(dao.findMatchers(32,"Austinsss"));
		
	}

}
