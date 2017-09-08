package com.loncoto.backendIntervention.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loncoto.backendIntervention.metier.Intervention;

public interface InterventionRepository extends CrudRepository<Intervention, Integer> {

}
