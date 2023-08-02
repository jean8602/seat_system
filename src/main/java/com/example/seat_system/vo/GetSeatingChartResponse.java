package com.example.seat_system.vo;

import java.util.List;
import com.example.seat_system.entity.SeatingChart;

public class GetSeatingChartResponse {
	private String message;

	private List<SeatingChart> seatingList;

	public GetSeatingChartResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetSeatingChartResponse(List<SeatingChart> seatingList) {
		super();
		this.seatingList = seatingList;
	}

	public GetSeatingChartResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<SeatingChart> getSeatingList() {
		return seatingList;
	}

	public void setSeatingList(List<SeatingChart> seatingList) {
		this.seatingList = seatingList;
	}

}
