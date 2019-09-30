package com.jeffsaotome.serviciosRest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jeffsaotome.serviciosRest.models.entity.Plan;


public interface PlanDAO extends CrudRepository<Plan, String>{

	
	public List<Plan>findAll();

    public Optional<Plan> findById(String planvalor);
	
	public Plan save(Plan pl);
	
	public void delete(Plan pl);
	
}
