package com.keysoft.trackzilla;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.model.Ticket;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TrackzillaControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getAllApplications() throws Exception {
		ResponseEntity<Application[]> responseEntity = this.restTemplate
				.getForEntity("http://localhost:" + port + "/api/v1/tza/applications", Application[].class);
		System.out.println("################################");
		System.out.println(responseEntity);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	public void getAllTickets() throws Exception {
		ResponseEntity<Ticket[]> responseEntity = this.restTemplate
				.getForEntity("http://localhost:" + port + "/api/v1/tza/tickets", Ticket[].class);
		System.out.println("################################");
		System.out.println(responseEntity);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
}
