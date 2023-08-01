package com.example.seat_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seating_chart")

public class SeatingChart {

	@Id
	@Column(name = "floor_seat_seq")
	private String floorSeatSeq;
	@Column(name = "floor_no")
	private String floorNo;
	@Column(name = "seat_no")
	private String seatNo;

	public SeatingChart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeatingChart(String floorSeatSeq, String floorNo, String seatNo) {
		super();
		this.floorSeatSeq = floorSeatSeq;
		this.floorNo = floorNo;
		this.seatNo = seatNo;
	}

	public String getFloorSeatSeq() {
		return floorSeatSeq;
	}

	public void setFloorSeatSeq(String floorSeatSeq) {
		this.floorSeatSeq = floorSeatSeq;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}
