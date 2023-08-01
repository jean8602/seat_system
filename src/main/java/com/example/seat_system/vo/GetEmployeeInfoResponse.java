package com.example.seat_system.vo;

import java.util.List;

import com.example.seat_system.entity.Employee;

public class GetEmployeeInfoResponse {

	private String message;

	private List<Employee> employeeList;

	public GetEmployeeInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetEmployeeInfoResponse(String message) {
		super();
		this.message = message;
	}

	public GetEmployeeInfoResponse(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
