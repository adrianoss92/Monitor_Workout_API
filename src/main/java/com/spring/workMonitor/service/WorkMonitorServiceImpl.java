package com.spring.workMonitor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.workMonitor.model.WorkoutMonitorModel;
import com.spring.workMonitor.repository.WorkoutRepository;
//Classe de serviços responsavel por utilizar a interface que herda a classe abstrata


@Service  // implementação da interface e a criação dos metodos proposto na interface.
public class WorkMonitorServiceImpl implements WorkMonitorService{

	@Autowired
	WorkoutRepository workoutRepository;
	
	public List<WorkoutMonitorModel> findAll(){
            return workoutRepository.findAll();
	}
	
    public Optional<WorkoutMonitorModel> findById(String id){
        return workoutRepository.findById(id);
    }

    public WorkoutMonitorModel save(WorkoutMonitorModel workoutDocument){
        return workoutRepository.save(workoutDocument);
    }

    public void delete(WorkoutMonitorModel workoutDocument){
    	workoutRepository.delete(workoutDocument);
    }
	
}
