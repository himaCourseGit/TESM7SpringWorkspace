package org.jsp.springMVC.service;

import org.jsp.springMVC.dao.UserInfoDao;
import org.jsp.springMVC.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoServiceImpl implements UserInfoService {
@Autowired
private UserInfoDao dao;

public int registration(UserInfo info) {
	int record=dao.addUser(info);
	return record;
}
@Override
public UserInfo login(String email, String password) {
	
	return dao.verifyUser(email, password);
}


}
