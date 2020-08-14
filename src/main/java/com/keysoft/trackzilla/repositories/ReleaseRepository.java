package com.keysoft.trackzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keysoft.trackzilla.model.Release;

public interface ReleaseRepository extends JpaRepository<Release, Long> {

}
