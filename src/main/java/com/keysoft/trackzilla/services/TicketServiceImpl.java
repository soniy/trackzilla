package com.keysoft.trackzilla.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keysoft.trackzilla.model.Ticket;
import com.keysoft.trackzilla.repositories.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public List<Ticket> listTickets() {
		return ticketRepository.findAll();
	}

}
