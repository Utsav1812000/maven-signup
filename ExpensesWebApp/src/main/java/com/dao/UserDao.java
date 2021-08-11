package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public UserBean login(String email, String password) {
		
	 List<UserBean> bean=  jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
	 for (UserBean userBean : bean) {
		if(userBean.getEmail().equals(email) && userBean.getPassword().equals(password)) {
			return userBean;
		}
	 }
		return null;
	}

	
	
}
