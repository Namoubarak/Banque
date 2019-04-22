package com.example.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entities.Operation;
@Configuration
public interface OperationRepository extends JpaRepository<Operation, Long>{

}
