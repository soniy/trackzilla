package com.keysoft.trackzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keysoft.trackzilla.services.ApplicationService;
import com.keysoft.trackzilla.services.ReleaseService;
import com.keysoft.trackzilla.services.TicketService;

@Controller
public class TrackzillaController {

	@Autowired
	private ApplicationService applicationService;
	
	@Autowired
	private TicketService ticketService;
	
	@Autowired
	private ReleaseService releaseService;

	@GetMapping("/applications")
	public String retrieveApplications(Model model) {
		model.addAttribute("applications", applicationService.listApplications());
		return "applications";
	}

	@GetMapping("/tickets")
	public String retrieveTickets(Model model) {
		model.addAttribute("tickets", ticketService.listTickets());
		return "tickets";
	}

	@GetMapping("/releases")
	public String retrieveReleases(Model model) {
		model.addAttribute("releases", releaseService.listReleases());
		return "releases";
	}
}
