package com.le.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.le.springdatajpamappings.Entity.Employeeee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employeeee, Long> {

}
