package com.keysoft.trackzilla.services;

import java.util.List;

import com.keysoft.trackzilla.model.Application;

public interface ApplicationService {

	public List<Application> listApplications();
	
	public long count();
}
