package com.nourdine.vetements;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nourdine.vetements.entities.Vetement;
import com.nourdine.vetements.service.VetementService;

@SpringBootApplication
public class VetementsApplication implements CommandLineRunner{
	@Autowired
	VetementService vetementService;

	public static void main(String[] args) {
		SpringApplication.run(VetementsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		vetementService.saveVetement(new Vetement ("v1",20.00,new Date()));
		vetementService.saveVetement(new Vetement ("v2",50.00,new Date()));
		vetementService.saveVetement(new Vetement ("v3",70.00,new Date()));


	}

}
