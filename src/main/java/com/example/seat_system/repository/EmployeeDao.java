package com.example.seat_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.seat_system.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, String> {

//	將資料寫入資料庫
	@Transactional
	@Modifying
	@Query(value = "insert into employee(emp_id,name,email)"
			+ " select :inputEmployeeId, :inputName, :inputEmail"
			+ " where not exists (select 1 from employee where emp_id = :inputEmployeeId)", nativeQuery = true)
	public int insertEmployeeInfoWhereNotExists(@Param("inputEmployeeId") String employeeId,
			@Param("inputName") String inputName,
			@Param("inputEmail") String inputEmail);
	
		
	
	@Transactional
	@Modifying
	@Query(value = "update employee e set e.name = :newName, e.email = :newEmail,"
			+ " e.floor_seat_seq = :newFloorSeatSeq"
			+ " where e.emp_id = :inputEmployeeId", nativeQuery = true)

	public int updateEmployeeInfoByEmployeeId(
			@Param("newName") String newName, 
			@Param("newEmail") String newEmail,
			@Param("newFloorSeatSeq") String newFloorSeatSeq,
			@Param("inputEmployeeId") String inputEmployeeId);

}
