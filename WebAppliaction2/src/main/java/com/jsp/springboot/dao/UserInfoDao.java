package com.jsp.springboot.dao;

import com.jsp.springboot.entity.UserInfo1;

public interface UserInfoDao {
UserInfo1 addUser(UserInfo1 info);
UserInfo1 searchByEmailAndPassword(String email,String password);
}
