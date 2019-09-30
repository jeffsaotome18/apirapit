package com.jeffsaotome.serviciosRest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jeffsaotome.serviciosRest.models.entity.Lineas;


public interface lineasDAO extends CrudRepository<Lineas, String>{



	public List<Lineas>findAll();

    public Optional<Lineas> findById(String linumerolinea);
	
	public Lineas save(Lineas li);
	
	public void delete(Lineas li);
	
}
