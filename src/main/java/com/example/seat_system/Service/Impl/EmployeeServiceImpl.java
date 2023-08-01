package com.example.seat_system.Service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.seat_system.Service.Ifs.EmployeeService;
import com.example.seat_system.entity.Employee;
import com.example.seat_system.repository.EmployeeDao;
import com.example.seat_system.repository.SeatingChartDao;
import com.example.seat_system.vo.AddEmployeeInfoRequest;
import com.example.seat_system.vo.AddEmployeeInfoResponse;
import com.example.seat_system.vo.GetEmployeeInfoResponse;
import com.example.seat_system.vo.UpdateEmployeeInfoRequest;
import com.example.seat_system.vo.UpdateEmployeeInfoResponse;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	SeatingChartDao seatingChartDao;

	@Override
	public AddEmployeeInfoResponse addEmployeeInfo(AddEmployeeInfoRequest request) {
		// 員工編號須為5碼，隨機生成
		String employeeId = String.format("%05d", (int) (Math.random() * 10000));
		String name = request.getName();
		String email = request.getEmail();

		// 內容不得為空，必須有內容

		if (!StringUtils.hasText(employeeId) || !StringUtils.hasText(name) || !StringUtils.hasText(email)) {
			return new AddEmployeeInfoResponse("員工基本資料不得為空");
		}

//		確認該帳號是否以存在資料庫 重複就不能註冊
		int result = employeeDao.insertEmployeeInfoWhereNotExists(employeeId, name, email);

		if (result == 0) {
			return new AddEmployeeInfoResponse("員工編號重複");
		}

		// 可以新增多筆資料？ 一開始可以不用有位置
//		新增位置時要避免有重複的

		return new AddEmployeeInfoResponse("成功");
	}

	@Override
	public UpdateEmployeeInfoResponse updateEmployeeInfo(UpdateEmployeeInfoRequest request) {
		// 可以修改位置，得先確認位置是否已存在，才可以新增
//		判斷該員工是否有在資料庫，有才可以修改

		String employeeId = request.getEmployeeId();
		String newName = request.getName();
		String newEmail = request.getEmail();
		String newFloorSeatSeq = request.getFloorSeatSeq();

		if (!StringUtils.hasText(newName) || !StringUtils.hasText(newEmail)) {
			return new UpdateEmployeeInfoResponse("內容不得為空");
		}

		// 如果座位位置為空，則將其設為 null，否則保留原值
	    String floorSeatSeq = Optional.ofNullable(newFloorSeatSeq).orElse(null);

	    // 判斷座位位置是否存在資料庫內，或為 null
	    if (floorSeatSeq != null && !seatingChartDao.existsById(newFloorSeatSeq)) {
	        return new UpdateEmployeeInfoResponse("該位置不存在");
	    }
	    
//	    判斷座位是否有重複，如果有重複就不能修改

		int res = employeeDao.updateEmployeeInfoByEmployeeId(newName, newEmail, newFloorSeatSeq, employeeId);
		if (res == 0) {

			return new UpdateEmployeeInfoResponse("修改失敗");

		}

		return new UpdateEmployeeInfoResponse("success!");

	}

	@Override
	public GetEmployeeInfoResponse getEmployeeInfo() {
		List<Employee> op = employeeDao.findAll();
		return new GetEmployeeInfoResponse(op);
	}

}
