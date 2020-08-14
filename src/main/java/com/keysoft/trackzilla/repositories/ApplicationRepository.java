package com.keysoft.trackzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keysoft.trackzilla.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
