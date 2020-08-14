package com.keysoft.trackzilla.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.repositories.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	public List<Application> listApplications() {
		return applicationRepository.findAll();
	}

	@Override
	public long count() {
		return applicationRepository.count();
	}
}
