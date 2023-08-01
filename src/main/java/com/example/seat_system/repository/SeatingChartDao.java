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
	@Query(value = "insert into seatingChart(floor_seat_seq,floor_no,seat_no)"
			+ " select :inputFloorSeatSeq, :inputFloorNo, :inputSeatNo"
			+ " where not exists (select 1 from seatingChart where floor_seat_seq = :inputFloorSeatSeq)", nativeQuery = true)
	public int insertSeatInfoWhereNotExists(@Param("inputFloorSeatSeq") String inputFloorSeatSeq,
			@Param("inputFloorNo") String inputFloorNo,
			@Param("inputSeatNo") String inputinputSeatNo);

}
