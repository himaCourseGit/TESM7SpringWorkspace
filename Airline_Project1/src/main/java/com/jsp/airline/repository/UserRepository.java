package com.jsp.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
