package com.keysoft.trackzilla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.repositories.ApplicationRepository;

@SpringBootApplication
public class TrackzillaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(TrackzillaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrackzillaApplication.class, args);
		LOGGER.info("TrackzillaApplication started");
	}

	/*
	 * @Bean public CommandLineRunner demo(ApplicationRepository repository) {
	 * return (args) ->{ repository.save(new
	 * Application("Trackzilla","Yatin","Test Application Trackzilla"));
	 * repository.save(new
	 * Application("Expenses","Sunil","Test Application Expenses"));
	 * repository.save(new
	 * Application("Notifications","Mahesh","Test Application Notifications"));
	 * 
	 * for (Application application : repository.findAll()) {
	 * LOGGER.info("The application is: {}",application); } }; }
	 */
}
