package com.keysoft.trackzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keysoft.trackzilla.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
