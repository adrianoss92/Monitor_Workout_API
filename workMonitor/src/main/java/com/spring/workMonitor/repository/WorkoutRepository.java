package com.spring.workMonitor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.workMonitor.model.WorkoutMonitorModel;

@Repository
// Implementação de herança com uma classe abstrata.
public interface WorkoutRepository extends MongoRepository<WorkoutMonitorModel, String> {
 
}
