package com.example.BootPodstawy.przyklad5event;

import com.example.BootPodstawy.przyklad4postprocess.InitHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootPodstawyApplication implements CommandLineRunner {

	@Autowired
	ExamplePublisher publisher;

	public static void main(String[] args) {
		SpringApplication.run(BootPodstawyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		publisher.publish("test");
	}
}
