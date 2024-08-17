package com.jsp.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.springboot.entity.UserInfo1;
import com.jsp.springboot.repository.UserInfoRepository1;

@Repository
public class UserInfoImpl1 implements UserInfoDao {
	@Autowired
private UserInfoRepository1 repo;
	@Override
	public UserInfo1 addUser(UserInfo1 info) {
		UserInfo1 information=repo.save(info);
		return information;
	}

	@Override
	public UserInfo1 searchByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		try {
			UserInfo1 info=repo.findByEmailAndPassword(email,password);
			return info;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
		
	


