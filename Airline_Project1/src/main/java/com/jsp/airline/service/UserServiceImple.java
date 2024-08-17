package com.jsp.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.UserDTO;
import com.jsp.airline.entity.User;
import com.jsp.airline.repository.UserRepository;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	@Override
	public int addUser(UserDTO dto) {
		
//		User u1=userrepository.save(User.builder().
//				Id(dto.getId()).UserName(dto.getUserName()).FirstName(dto.getFirstName()).LastNAME(dto.getLastNAME())
//				.Gender(dto.getGender()).password(dto.getPassword()).MobileNumber(dto.getMobileNumber()).build());
//		System.out.println(u1);
//		return u1.getId();
		User user=userrepository.save(User.builder()
				.FirstName(dto.getFirstName())
				.LastNAME(dto.getLastNAME())
				.MobileNumber(dto.getMobileNumber())
				.Gender(dto.getGender())
				.UserName(dto.getUserName())
				.password(dto.getPassword())
				
				.build());
		System.out.println(user);
		return user.getId();
	}

}
