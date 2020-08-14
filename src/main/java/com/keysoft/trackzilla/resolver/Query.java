package com.keysoft.trackzilla.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.services.ApplicationService;

@Component
public class Query implements GraphQLQueryResolver {

	private ApplicationService applicationService;

	public Query(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}

	public List<Application> findAllApplications() {
		return applicationService.listApplications();
	}

	public long countApplications() {
		return applicationService.count();
	}
}
