package com.sb.spring.springmvcorm.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sb.spring.springmvcorm.user.dao.UserDao;
import com.sb.spring.springmvcorm.user.entity.User;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("UserDaoImpl")
	private UserDao dao;

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
}
