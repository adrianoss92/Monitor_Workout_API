package com.spring.workMonitor.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WorkoutMonitorModel {

	@Id
	private String id;
	private String musculo;
	private List<ExercicioModel> exercicios;
	private LocalDateTime registrationDate;
	private LocalDateTime workoutDate;

	public LocalDateTime getWorkoutDate() {
		return workoutDate;
	}

	public void setWorkoutDate(LocalDateTime workoutDate) {
		this.workoutDate = workoutDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMusculo() {
		return musculo;
	}

	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}

	public List<ExercicioModel> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<ExercicioModel> exercicios) {
		this.exercicios = exercicios;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

}
