package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;

import com.jeffsaotome.serviciosRest.models.entity.Lineas;


public interface LineasService {

	public List<Lineas> listar();

	public Lineas listarid(String linumerolinea);
	
	public Lineas agregar(Lineas li);
	
	public Lineas editar(Lineas li);

	public Lineas eliminar(String linumerolinea);

	
}
