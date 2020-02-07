package com.heliohdd.spring_boot_ionic_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heliohdd.spring_boot_ionic_backend.services.S3Service;

@SpringBootApplication
public class SpringBootIonicBackendApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIonicBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		s3Service.uploadFile("C:\\temp\\fotos\\ana.jpg");
	}	
}