package com.example.seat_system.vo;

public class UpdateEmployeeInfoRequest {

	private String employeeId;

	private String name;

	private String email;

	private String floorSeatSeq;

	public UpdateEmployeeInfoRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFloorSeatSeq() {
		return floorSeatSeq;
	}

	public void setFloorSeatSeq(String floorSeatSeq) {
		this.floorSeatSeq = floorSeatSeq;
	}

}
