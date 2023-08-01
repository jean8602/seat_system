package com.example.seat_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {

	@Id
	@Column(name = "emp_id")
	private String employeeId;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "floor_seat_seq")
	private String floorSeatSeq;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String name, String email, String floorSeatSeq) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.floorSeatSeq = floorSeatSeq;
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
