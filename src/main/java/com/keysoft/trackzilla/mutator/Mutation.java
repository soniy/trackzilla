package com.keysoft.trackzilla.mutator;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.keysoft.trackzilla.exeption.ApplicationNotFoundException;
import com.keysoft.trackzilla.model.Application;
import com.keysoft.trackzilla.repositories.ApplicationRepository;

@Component
public class Mutation implements GraphQLMutationResolver {

	private ApplicationRepository applicationRepository;

	public Mutation(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	public Application newApplication(String name, String owner, String description) {
		Application application = new Application(name, owner, description);
		return applicationRepository.saveAndFlush(application);
	}

	public boolean deleteApplication(Long id) {
		applicationRepository.deleteById(id);
		return true;
	}

	public Application updateApplicationOwner(String newOwner, Long id) {
		Optional<Application> optional = applicationRepository.findById(id);
		if (optional.isPresent()) {
			Application app = optional.get();
			app.setOwner(newOwner);
			return applicationRepository.saveAndFlush(app);
		}else {
			throw new ApplicationNotFoundException("Application Not Found",id);
		}
	}
}
