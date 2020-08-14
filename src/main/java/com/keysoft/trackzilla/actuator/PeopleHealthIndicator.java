package com.keysoft.trackzilla.actuator;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PeopleHealthIndicator implements HealthIndicator {

	private static final String MESSAGE_KEY = "PeopleService";

	@Override
	public Health health() {
		if (!isRunningServicePeopleService()) {
			return Health.down().withDetail(MESSAGE_KEY, "Not Available").build();
		}
		return Health.up().withDetail(MESSAGE_KEY, "Available").build();
	}

	private boolean isRunningServicePeopleService() {
		Random random = new Random(10);
		return random.nextBoolean();
	}
}
