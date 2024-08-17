package org.jsp.springMVC.dao;

import org.jsp.springMVC.entity.UserInfo;

public interface UserInfoDao {
int addUser(UserInfo info);
UserInfo verifyUser(String email,String password);
}
