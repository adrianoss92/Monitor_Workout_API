package com.spring.workMonitor.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.workMonitor.exeption.WorkoutExeption;
import com.spring.workMonitor.model.WorkoutMonitorModel;
import com.spring.workMonitor.service.WorkMonitorService;


@CrossOrigin(origins = "*")
@RestController
public class WorkMonitorController {
	
	@Autowired
	WorkMonitorService workMonitorService;
	
	@GetMapping("/workout")
	public ResponseEntity<List<WorkoutMonitorModel>> getAllWorkout(){
		List<WorkoutMonitorModel> allWorkout = workMonitorService.findAll();
		return new ResponseEntity<List<WorkoutMonitorModel>>(allWorkout, HttpStatus.OK);
	}
	
	@GetMapping("/workout/{id}")
	public ResponseEntity<WorkoutMonitorModel> getWorkoutb(@PathVariable(value="id") String id){
		
		
		Optional<WorkoutMonitorModel> treino = workMonitorService.findById(id);
		if(treino == null) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<WorkoutMonitorModel>(treino.get(), HttpStatus.OK);
		}		
	}
	
	@PostMapping("/workout")
    public ResponseEntity<WorkoutMonitorModel> saveWorkout(@RequestBody @Validated WorkoutMonitorModel workout) {
		workout.setRegistrationDate(LocalDateTime.now());
        return new ResponseEntity<WorkoutMonitorModel>(workMonitorService.save(workout), HttpStatus.CREATED);
    }
		
	@PutMapping("/workout/{id}")
	public ResponseEntity<WorkoutMonitorModel> updateWorkout(@RequestBody @Validated WorkoutMonitorModel workout, 
															@PathVariable(value="id") String id){
	
		Optional<WorkoutMonitorModel> treino = workMonitorService.findById(id);
		if(!treino.isPresent()) {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			workout.setId(treino.get().getId());
			
			return new ResponseEntity<WorkoutMonitorModel>(workMonitorService.save(workout), HttpStatus.OK);
		}		
	}
	
	@DeleteMapping("/workout/{id}")
	public ResponseEntity<?> removeWorkout(@PathVariable(value="id") String id){
		Optional<WorkoutMonitorModel> treino = workMonitorService.findById(id);
		if(!treino.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			workMonitorService.delete(treino.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
	
}
