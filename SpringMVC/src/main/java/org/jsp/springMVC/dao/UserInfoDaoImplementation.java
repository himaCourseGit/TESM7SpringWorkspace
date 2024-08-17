package org.jsp.springMVC.dao;

import org.jsp.springMVC.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class UserInfoDaoImplementation implements UserInfoDao {
@Autowired
private  JdbcTemplate template;
	@Override
	public int addUser(UserInfo info) {
		String query="insert into userinfo values(?,?,?,?,?)";
		int record=template.update(query,info.getFirstName(),info.getLastName(),info.getEmail(),info.getMobile(),info.getPassword());
		
		return record;
	}

	public UserInfo verifyUser(String email, String password) {
		String query="select * from userinfo where email=? and password=?";
		//RowMapper <UserInfo> rm=new UserInfoRowMapper();
		try {
			UserInfo info=template.queryForObject(query,new UserInfoRowMapper(),email,password);
			return info;
		}catch(Exception e) {
			//todo:handle Exception
			return null;
		}
	}

}
