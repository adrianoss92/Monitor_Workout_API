package com.spring.workMonitor.service;

import java.util.List;
import java.util.Optional;

import com.spring.workMonitor.model.WorkoutMonitorModel;

public interface WorkMonitorService {
	
	public List<WorkoutMonitorModel> findAll();
	
	public Optional<WorkoutMonitorModel> findById(String id);
	
	public WorkoutMonitorModel save(WorkoutMonitorModel workoutDocument);
	
	public void delete(WorkoutMonitorModel workoutDocument);
}
