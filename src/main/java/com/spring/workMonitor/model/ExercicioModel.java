package com.spring.workMonitor.model;

import org.springframework.data.mongodb.core.mapping.Document;

//Classe responsavel por montar o objeto

@Document
public class ExercicioModel {
	
	private String name;
	private String repetition;
	private String weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRepetition() {
		return repetition;
	}
	public void setRepetition(String repetition) {
		this.repetition = repetition;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}	
}
