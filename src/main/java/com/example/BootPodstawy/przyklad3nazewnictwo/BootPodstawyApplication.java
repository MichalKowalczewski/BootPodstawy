package com.example.BootPodstawy.przyklad3nazewnictwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootPodstawyApplication implements CommandLineRunner {

	@Autowired
	//@Qualifier("Tiger")
	Animal animal;

	public static void main(String[] args) {
		SpringApplication.run(BootPodstawyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		animal.displayName();
	}
}
