package com.example.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entities.Compte;
@Configuration
public interface CompteRepository extends JpaRepository<Compte, String>{

}
