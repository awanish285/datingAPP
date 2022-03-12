package com.awanish.dating.dao;

import java.util.List;

import com.awanish.dating.model.UserAccount;

public interface UserAccountDao {
	
	void save(UserAccount userAccount);
	
	UserAccount findById(int id);
	
	List<UserAccount> findAll();
	
	List<UserAccount> findMatchers(int age,String city);
	
	void delete(int id);

}
