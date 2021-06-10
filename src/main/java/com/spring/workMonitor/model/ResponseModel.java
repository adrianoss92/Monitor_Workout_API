package com.spring.workMonitor.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ResponseModel {
	
	
	private List<WorkoutMonitorModel> response;

	public List<WorkoutMonitorModel> getResponse() {
		return response;
	}

	public void setResponse(List<WorkoutMonitorModel> response) {
		this.response = response;
	}
	
	
	
}
