package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Najih Moubarak
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.dao.ClientRepository;
import com.example.entities.*;
@SpringBootApplication(scanBasePackages = {"com.example.demo","com.example.entities","com.example.dao"})
//if this line doesn't exist Hibernate do not create tables
@EntityScan(basePackages = {"com.example.entities"})
@EnableJpaRepositories("com.example.dao")
public class BanqueExempleApplication {
	@Autowired

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(BanqueExempleApplication.class, args);
		ClientRepository clt = ctx.getBean(ClientRepository.class);
		clt.save(new Client("Najih","najihmoubarak@gmail.com"));
	}


	

}
