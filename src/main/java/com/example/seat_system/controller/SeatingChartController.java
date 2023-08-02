package com.example.seat_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.seat_system.Service.Ifs.SeatingChartService;
import com.example.seat_system.vo.AddSeatingChartRequest;
import com.example.seat_system.vo.AddSeatingChartResponse;
import com.example.seat_system.vo.GetSeatingChartResponse;
import com.example.seat_system.vo.SearchAllResponse;
import com.example.seat_system.vo.SelectLocationRequest;
import com.example.seat_system.vo.SelectLocationResponse;


@CrossOrigin
@RestController
public class SeatingChartController {

	@Autowired
	SeatingChartService seatingChartService;

	@PostMapping(value = "add_Seat_Info")
	public AddSeatingChartResponse addSeatInfo(@RequestBody AddSeatingChartRequest request) {
		return seatingChartService.addSeatInfo(request);

	}

	@PostMapping(value = "selectLocation")
	public SelectLocationResponse selectLocation(@RequestBody SelectLocationRequest request) {
		return seatingChartService.selectLocation(request);

	}
	
	@GetMapping(value = "get_Seating")
	public GetSeatingChartResponse getSeatingInfo() {
		return seatingChartService.getSeatingInfo();
	}
	
	@GetMapping(value = "get_AllInfo")
	public SearchAllResponse getAllInfo() {
		return seatingChartService.getAllInfo();
	}
	


}
