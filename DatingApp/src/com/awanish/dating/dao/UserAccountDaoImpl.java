package com.awanish.dating.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.awanish.dating.model.UserAccount;

public class UserAccountDaoImpl implements UserAccountDao {

	Map<Integer, UserAccount> userAccounts = new HashMap();

	@Override
	public void save(UserAccount userAccount) {

		userAccounts.put(userAccount.getId(), userAccount);

	}

	@Override
	public UserAccount findById(int id) {

		return userAccounts.get(id);
	}

	@Override
	public List<UserAccount> findAll() {
		return new ArrayList<UserAccount>(userAccounts.values());
	}

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

	@Override
	public void delete(int id) {
		
		userAccounts.remove(id);
		
	}

}
