package com.example.seat_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.seat_system.entity.SeatingChart;

import jakarta.transaction.Transactional;

@Repository
public interface SeatingChartDao extends JpaRepository<SeatingChart, String> {
	
//	將資料寫入資料庫
	@Transactional
	@Modifying
	@Query(value = "insert into seating_chart(floor_seat_seq,floor_no,seat_no)"
			+ " select :inputFloorSeatSeq, :inputFloorNo, :inputSeatNo"
			+ " where not exists (select 1 from seating_chart where floor_seat_seq = :inputFloorSeatSeq)", nativeQuery = true)
	public int insertSeatInfoWhereNotExists(@Param("inputFloorSeatSeq") String inputFloorSeatSeq,
			@Param("inputFloorNo") String inputFloorNo,
			@Param("inputSeatNo") String inputinputSeatNo);
	
//	
//	@Transactional
//	@Modifying
//	@Query(value = "update employee e set e.name = :newName, e.email = :newEmail,"
//			+ " e.floor_seat_seq = :newFloorSeatSeq"
//			+ " where e.emp_id = :inputEmployeeId", nativeQuery = true)
//
//	public int updateEmployeeInfoByEmployeeId(
//			@Param("newName") String newName, 
//			@Param("newEmail") String newEmail,
//			@Param("newFloorSeatSeq") String newFloorSeatSeq,
//			@Param("inputEmployeeId") String inputEmployeeId);

}
