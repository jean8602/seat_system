package com.example.seat_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.seat_system.Service.Ifs.EmployeeService;
import com.example.seat_system.vo.AddEmployeeInfoRequest;
import com.example.seat_system.vo.AddEmployeeInfoResponse;
import com.example.seat_system.vo.GetEmployeeInfoResponse;
import com.example.seat_system.vo.UpdateEmployeeInfoRequest;
import com.example.seat_system.vo.UpdateEmployeeInfoResponse;

@CrossOrigin
@RestController
public class EmployeeController {
	
@Autowired EmployeeService employeeService;
	
	@PostMapping(value = "add_Employee_Info")
	public AddEmployeeInfoResponse addEmployeeInfo(@RequestBody AddEmployeeInfoRequest request) {
		return employeeService.addEmployeeInfo(request);
		
	}
	
	@PostMapping(value = "update_Employee_Info")
	public UpdateEmployeeInfoResponse updateEmployeeInfo(@RequestBody UpdateEmployeeInfoRequest request) {
		return employeeService.updateEmployeeInfo(request);
		
	}
	
	@GetMapping(value = "get_Employee_Info")
	public GetEmployeeInfoResponse getEmployeeInfo() {
		return employeeService.getEmployeeInfo();
	}

}
