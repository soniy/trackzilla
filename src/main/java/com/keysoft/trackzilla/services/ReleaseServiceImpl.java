package com.keysoft.trackzilla.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keysoft.trackzilla.model.Release;
import com.keysoft.trackzilla.repositories.ReleaseRepository;

@Service
public class ReleaseServiceImpl implements ReleaseService {
	@Autowired
	private ReleaseRepository releaseRepository;

	@Override
	public List<Release> listReleases() {
		return releaseRepository.findAll();
	}

}
