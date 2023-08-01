package com.example.seat_system.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.seat_system.Service.Ifs.SeatingChartService;
import com.example.seat_system.repository.SeatingChartDao;
import com.example.seat_system.vo.AddSeatingChartRequest;
import com.example.seat_system.vo.AddSeatingChartResponse;
import com.example.seat_system.vo.SelectLocationRequest;
import com.example.seat_system.vo.SelectLocationResponse;
import com.example.seat_system.vo.UpdateLocationRequest;
import com.example.seat_system.vo.UpdateLocationResponse;
import com.example.seat_system.vo.UpdateSeatingChartRequest;
import com.example.seat_system.vo.UpdateSeatingChartResponse;

@Service
public class SeatingChartServiceImpl implements SeatingChartService {

	@Autowired
	SeatingChartDao seatingChartDao;

//	新增座位資訊
	@Override
	public AddSeatingChartResponse addSeatInfo(AddSeatingChartRequest request) {

		String floorNo = request.getFloorNo();
		String seatNo = request.getSeatNo();
		String pattern = "\\d+";
		String floorSeatSeq = floorNo + "-" + seatNo;

//		防呆 限制floorNo & seatNo只能為整數 不得有符號
		
		if (!StringUtils.hasText(floorNo) && !floorNo.matches(pattern)) {
			return new AddSeatingChartResponse("樓層資料不得為空與要為整數");
		}

		if (!StringUtils.hasText(seatNo) && !seatNo.matches(pattern)) {
			return new AddSeatingChartResponse("樓層資料不得為空與要為整數");
		}


//		確認資料沒重複新增到資料庫
		int result = seatingChartDao.insertSeatInfoWhereNotExists(floorSeatSeq, floorNo, seatNo);

		if (result == 0) {
			return new AddSeatingChartResponse("資料重複");
		}

		return new AddSeatingChartResponse("成功");
	}

//	修改座位資訊
	@Override
	public UpdateSeatingChartResponse updateSeatInfo(UpdateSeatingChartRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SelectLocationResponse selectLocation(SelectLocationRequest request) {
		// 分為有選過位置與沒選過位置
		return null;
	}

	@Override
	public UpdateLocationResponse updateLocation(UpdateLocationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
