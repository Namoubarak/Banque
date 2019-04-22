package com.example.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entities.Client;
@Configuration
public interface ClientRepository extends JpaRepository<Client,Long>{

}
