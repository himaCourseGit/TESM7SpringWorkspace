package com.ac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ac.entity.Student;
@Repository

public interface IStudentrepository extends JpaRepository<Student, Integer>{
	@Query("FROM Student where course=?1 AND fee=?2")
	List<Student> getStudentsByCourseAndFee(String course,double fee);
	//List<Student>

}
