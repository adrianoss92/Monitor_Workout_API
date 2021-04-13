package com.spring.workMonitor.exeption;

public class WorkoutExeption extends RuntimeException {
	

	private static final long serialVersionUID = -6437739173341910528L;

	public WorkoutExeption(String mensagem) {
		super(mensagem);
	}
}
