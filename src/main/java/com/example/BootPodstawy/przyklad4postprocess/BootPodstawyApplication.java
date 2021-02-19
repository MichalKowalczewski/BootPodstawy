package com.example.BootPodstawy.przyklad4postprocess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootPodstawyApplication implements CommandLineRunner {

	@Autowired
    InitHelloWorld helloWorld;

	public static void main(String[] args) {
		SpringApplication.run(BootPodstawyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(helloWorld.message());
	}
}
