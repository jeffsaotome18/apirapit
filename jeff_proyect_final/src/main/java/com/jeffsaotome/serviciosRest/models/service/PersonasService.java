package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;
import java.util.Optional;

import com.jeffsaotome.serviciosRest.models.entity.Personas;


public interface PersonasService {

	public List<Personas> listar();

	public Optional<Personas> listarid(Integer id);
	
	public Personas agregar(Personas p);
	
	public Personas editar(Personas p);

	public Personas eliminar(Integer id);


		
}
