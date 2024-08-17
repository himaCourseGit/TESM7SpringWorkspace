package com.le.springdataquerymodify.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.le.springdataquerymodify.Entity.EmployeeQuery;
@Repository
public interface EmployeeQueryrepository extends JpaRepository<EmployeeQuery, Long> {
	@Query("select e from EmployeeQuery e")
	List<EmployeeQuery> findallempoyeequery();

	@Query("select e from EmployeeQuery e where e.active=:activestate and e.designation in:designationlist")
	List<EmployeeQuery> findallEmployeeQuerybyactivestatusanddesignation(@Param("activestate") Boolean activestate,
			@Param("designationlist") List<String> designationlist,
			Sort sort);
	
	@Modifying
	@Query("update EmployeeQuery e set e.active=?1 where e.empId in ?2")
	 int updateemployeestateByEmployeeId(Boolean activestate,List<Long> empidlist);

}
