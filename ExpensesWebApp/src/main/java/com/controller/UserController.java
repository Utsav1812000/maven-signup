package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao dao;

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {

		UserBean bean2 = dao.login(email, password);
		if(bean2!=null) {
			int i = bean2.getUserId();
			System.out.println(i);
			if (i == 1) {
				return "showAdmin";
			}

		}
		return "index";
	}

}
