package org.jsp.springMVC.service;

import org.jsp.springMVC.entity.UserInfo;

public interface UserInfoService {
int registration(UserInfo info);
UserInfo login(String email,String password);
}
