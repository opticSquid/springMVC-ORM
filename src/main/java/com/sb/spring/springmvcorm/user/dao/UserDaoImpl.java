package com.sb.spring.springmvcorm.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sb.spring.springmvcorm.user.entity.User;

@Repository

public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernatetemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernatetemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernatetemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		return hibernatetemplate.loadAll(User.class);
	}

	@Override
	public User findUser(Integer id) {
		return hibernatetemplate.get(User.class, id);
	}
}
