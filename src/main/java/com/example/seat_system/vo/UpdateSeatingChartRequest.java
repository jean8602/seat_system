package com.example.seat_system.vo;

public class UpdateSeatingChartRequest {

	private String floorSeatSeq;

	private String floorNo;

	private String seatNo;

	public UpdateSeatingChartRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateSeatingChartRequest(String floorSeatSeq, String floorNo, String seatNo) {
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
