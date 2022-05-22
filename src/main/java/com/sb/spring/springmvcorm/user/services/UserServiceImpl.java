package com.sb.spring.springmvcorm.user.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sb.spring.springmvcorm.user.dao.UserDao;
import com.sb.spring.springmvcorm.user.entity.User;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao dao;

	/*
	 * userDaoImpl is the default bean name of userDaoImpl if qualifier is not
	 * provided then spring gets confused whether to import the interface or class
	 * If interface is provided spring complains interface cannot be instantiated
	 * So, we specifically tell spring to get the class which implements the
	 * interface If multiple classes implement the same interface then @Qualifer
	 * should be used in this class and @Component("<bean_name>") in the inheriting
	 * class so that every instance of that interface can be uniquely identified
	 */
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// Can have business logic here
		// We can also give @Transactional annotation to this function because there can
		// be multiple DB associated function calls here and we can group them together
		// in a single transaction
		return dao.create(user);

	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}
}
