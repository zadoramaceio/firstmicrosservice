package com.example.devsuperior.hrworker.repositories;

import com.example.devsuperior.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
