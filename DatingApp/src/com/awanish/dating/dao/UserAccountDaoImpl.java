package com.awanish.dating.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.awanish.dating.model.UserAccount;

//UserAccountDaoImpl class implent UserAccountDao and interact with databases

public class UserAccountDaoImpl implements UserAccountDao {
    //This map is used as inmemory databases
	Map<Integer, UserAccount> userAccounts = new HashMap();

    //this method is used to save the UserAccount detais
	@Override
	public void save(UserAccount userAccount) {

		userAccounts.put(userAccount.getId(), userAccount);

	}
    //This method is used to find the useraccount by ID
	@Override
	public UserAccount findById(int id) {

		return userAccounts.get(id);
	}
    //This method is used to get the All userAccount
	@Override
	public List<UserAccount> findAll() {
		return new ArrayList<UserAccount>(userAccounts.values());
	}
    //this method is used to find the matches account.
	@Override
	public List<UserAccount> findMatchers(int age, String city) {

		Collection<UserAccount> matchesUserallAccount = userAccounts.values();

		List<UserAccount> matches = new ArrayList<UserAccount>();

		for (UserAccount obj : matchesUserallAccount) {
			if (obj.getAge() == age && obj.getCity().equals(city)) {
				matches.add(obj);
			}
		}

		return matches;
	}

    //This method is used to delete the userAccount.
	@Override
	public void delete(int id) {
		
		userAccounts.remove(id);
		
	}

}
