package com.loncoto.backendIntervention.repositories;

import org.springframework.data.repository.CrudRepository;

import com.loncoto.backendIntervention.metier.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
