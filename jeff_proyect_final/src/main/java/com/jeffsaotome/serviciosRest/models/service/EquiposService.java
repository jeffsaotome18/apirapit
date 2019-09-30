package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;

import com.jeffsaotome.serviciosRest.models.entity.Equipos;


public interface EquiposService {

	public List<Equipos> listar();

	public Equipos listarid(String equserial);
	
	public Equipos agregar(Equipos equ);
	
	public Equipos editar(Equipos equ);

	public Equipos eliminar(String equserial);
	
	
	
	
	
	
}
