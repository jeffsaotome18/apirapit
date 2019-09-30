package com.jeffsaotome.serviciosRest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jeffsaotome.serviciosRest.models.entity.Equipos;



public interface EquiposDAO extends CrudRepository<Equipos, String>{

	
	public List<Equipos>findAll();

    public Optional<Equipos> findById(String equserial);
	
	public Equipos save(Equipos equ);
	
	public void delete(Equipos equ);
	
	
	
	
	
	
	
}
