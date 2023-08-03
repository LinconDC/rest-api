package com.lincon.restapi;

import com.lincon.restapi.domain.AppUser;
import com.lincon.restapi.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//AppUser u1 = new AppUser(null, "Lincon Martins", "lincon", "123");
		//AppUser u2 = new AppUser(null, "Miyamoto Musashi", "mimu", "123");

		//userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
