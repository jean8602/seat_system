package com.example.seat_system.vo;

import java.util.List;

public class SearchAllResponse {

	private String employeeId;

	private String name;

	private String email;

	private String floorSeatSeq;

	private String floorNo;

	private String seatNo;

	private List<SearchAllResponse> searchAllList;

	public SearchAllResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public SearchAllResponse(String employeeId, String name, String email, String floorSeatSeq, String floorNo,
//			String seatNo) {
//		super();
//		this.employeeId = employeeId;
//		this.name = name;
//		this.email = email;
//		this.floorSeatSeq = floorSeatSeq;
//		this.floorNo = floorNo;
//		this.seatNo = seatNo;
//	}

	
	public SearchAllResponse(List<SearchAllResponse> searchAllList) {
		super();
		this.searchAllList = searchAllList;
	}


	public SearchAllResponse(String employeeId, String name, String email, String floorSeatSeq) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.email = email;
	this.floorSeatSeq = floorSeatSeq;
}

	public SearchAllResponse(String floorSeatSeq, String floorNo, String seatNo, String employeeId, String name,
		String email) {
	super();
	this.floorSeatSeq = floorSeatSeq;
	this.floorNo = floorNo;
	this.seatNo = seatNo;
	this.employeeId = employeeId;
	this.name = name;
	this.email = email;
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

	public List<SearchAllResponse> getSearchAllList() {
		return searchAllList;
	}

	public void setSearchAllList(List<SearchAllResponse> searchAllList) {
		this.searchAllList = searchAllList;
	}

}
