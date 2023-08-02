package com.example.seat_system.Service.Ifs;

import com.example.seat_system.vo.AddSeatingChartRequest;
import com.example.seat_system.vo.AddSeatingChartResponse;
import com.example.seat_system.vo.GetSeatingChartResponse;
import com.example.seat_system.vo.SearchAllResponse;
import com.example.seat_system.vo.SelectLocationRequest;
import com.example.seat_system.vo.SelectLocationResponse;
import com.example.seat_system.vo.UpdateLocationRequest;
import com.example.seat_system.vo.UpdateLocationResponse;
import com.example.seat_system.vo.UpdateSeatingChartRequest;
import com.example.seat_system.vo.UpdateSeatingChartResponse;


public interface SeatingChartService {
//	新增座位資訊 （假如辦公室位置有更動）
	public AddSeatingChartResponse addSeatInfo (AddSeatingChartRequest request);
//  修改座位資訊
	public UpdateSeatingChartResponse updateSeatInfo (UpdateSeatingChartRequest request);
//	選位置
	public SelectLocationResponse selectLocation (SelectLocationRequest request);
//  更新位置
	public UpdateLocationResponse updateLocation (UpdateLocationRequest request);
// 	查詢座位資料
	public GetSeatingChartResponse getSeatingInfo();
//	查詢兩張表的東西
	public SearchAllResponse getAllInfo();
	
}
