package org.jsp.springMVC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.jsp.springMVC.entity.UserInfo;
import org.springframework.jdbc.core.RowMapper;


public class UserInfoRowMapper implements RowMapper<UserInfo> {
@Override
	public UserInfo mapRow(ResultSet rs,int rowNum) throws SQLException{
	UserInfo info=new UserInfo();
	info.setFirstName(rs.getString("firstName"));
	info.setLastName(rs.getString("lastName"));
	info.setEmail(rs.getString("email"));
	info.setMobile(rs.getString("mobile"));
	info.setPassword(rs.getString("password"));
	return info;
}

}
