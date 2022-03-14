package com.awanish.dating.dao;

import java.util.List;

import com.awanish.dating.model.UserAccount;

//UserAccount Dao class all method implements by Impl class
public interface UserAccountDao {
	//This method is used to save UserAccount
	void save(UserAccount userAccount);
	//This method is used to find user by id
	UserAccount findById(int id);
	//this method is used to finad all the useres
	List<UserAccount> findAll();
	//this method is used to find the mataches
	List<UserAccount> findMatchers(int age,String city);
	//this method is used to delete the userAccount
	void delete(int id);

}
