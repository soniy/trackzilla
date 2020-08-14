package com.keysoft.trackzilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.model.Ticket;
import com.keysoft.trackzilla.services.ApplicationService;
import com.keysoft.trackzilla.services.TicketService;

@RestController
@RequestMapping("/api/v1/tza")
public class TrackzillaRestController {

	@Autowired
	private ApplicationService applicationService;

	@Autowired
	private TicketService ticketService;

	@GetMapping("/applications")
	public List<Application> listApplications() {
		return applicationService.listApplications();
	}

	@GetMapping("/tickets")
	public List<Ticket> listTickets() {
		return ticketService.listTickets();
	}
}
