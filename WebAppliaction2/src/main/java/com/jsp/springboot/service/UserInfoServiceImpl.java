package com.jsp.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jsp.springboot.dao.UserInfoDao;
import com.jsp.springboot.entity.UserInfo1;
@Service
public class UserInfoServiceImpl implements UserInfoService1 {
	@Autowired
	private UserInfoDao dao;

	@Override
	public UserInfo1 register(UserInfo1 info) {
		// TODO Auto-generated method stub
		return dao.addUser(info);
	}

	@Override
	public UserInfo1 login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.searchByEmailAndPassword(email, password);
	
	}

}
