package com.example.seat_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.seat_system.Service.Ifs.SeatingChartService;

import com.example.seat_system.vo.AddSeatingChartRequest;
import com.example.seat_system.vo.AddSeatingChartResponse;

@RestController
public class SeatingChartController {

	@Autowired
	SeatingChartService seatingChartService;
	
	@PostMapping(value = "add_Seat_Info")
	public AddSeatingChartResponse addSeatInfo(@RequestBody AddSeatingChartRequest request) {
		return seatingChartService.addSeatInfo(request);
		
	}

}
