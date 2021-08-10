package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	ArrayList<UserBean> list = new ArrayList<UserBean>();

	public void insert(UserBean user) {
		String hb[] = user.getHobby();
		String hob = "";
		for (String hobby : hb) {
			hob = hob+hobby+",";
		}
		jdbcTemplate.update("insert into user(name,email,gender,hobby,password) values(?,?,?,?,?)",user.getName(),user.getEmail(),user.getGender(),hob,user.getPassword());
	}

	public List<UserBean> showData() {
		List<UserBean> users = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<UserBean>(UserBean.class));
		return users;
	}

	public int delete(int id) {
		int row = 0;
		row = jdbcTemplate.update("delete from user where id=?",id);
		return row;
	}

	public UserBean getDataById(int id) {
//		=  jdbcTemplate.update("select * from user where id=?",id);
		
		return jdbcTemplate.queryForObject("select * from user where id =?",new Object[] {id},new BeanPropertyRowMapper<UserBean>(UserBean.class)) ;
	}

	public int updateUser(UserBean user) {
		String hb[] = user.getHobby();
		String hob = "";
		for (String hobby : hb) {
			hob = hob+hobby+",";
		}
//		return jdbcTemplate.update("update user set name="+user.getName() + ",email="+user.getEmail()+",gender="+user.getGender()+",hobby="+ user.getHobby()+",password="+user.getPassword()+"");
		return jdbcTemplate.update("update user set name=?,email=?,gender=?,hobby=?,password=? where id=?", user.getName(),user.getEmail(),user.getGender(),hob,user.getPassword(),user.getId());
	} 
	
	
	
	
}

