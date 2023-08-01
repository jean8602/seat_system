package com.example.seat_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.seat_system.Service.Ifs.EmployeeService;
import com.example.seat_system.vo.AddEmployeeInfoRequest;
import com.example.seat_system.vo.AddEmployeeInfoResponse;
import com.example.seat_system.vo.UpdateEmployeeInfoRequest;
import com.example.seat_system.vo.UpdateEmployeeInfoResponse;

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

}
