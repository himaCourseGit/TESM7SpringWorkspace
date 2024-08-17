package com.jsp.springboot.service;

import com.jsp.springboot.entity.UserInfo1;

public interface UserInfoService1 {
UserInfo1 register(UserInfo1 info);
UserInfo1 login(String email,String password);
}
