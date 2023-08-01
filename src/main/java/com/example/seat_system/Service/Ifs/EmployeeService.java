package com.example.seat_system.Service.Ifs;

import com.example.seat_system.vo.AddEmployeeInfoRequest;
import com.example.seat_system.vo.AddEmployeeInfoResponse;
import com.example.seat_system.vo.GetEmployeeInfoResponse;
import com.example.seat_system.vo.UpdateEmployeeInfoRequest;
import com.example.seat_system.vo.UpdateEmployeeInfoResponse;

public interface EmployeeService {
	
//	新增員工資料
	public AddEmployeeInfoResponse addEmployeeInfo (AddEmployeeInfoRequest request);
//  修改員工資料 （含修改位置）
	public UpdateEmployeeInfoResponse updateEmployeeInfo (UpdateEmployeeInfoRequest request);
// 	查詢員工資料
	public GetEmployeeInfoResponse getEmployeeInfo();
	
	
}
