package com.jsp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.entity.UserInfo1;

public interface UserInfoRepository1 extends JpaRepository<UserInfo1, String>{
	UserInfo1 findByEmailAndPassword(String email,String password);
}