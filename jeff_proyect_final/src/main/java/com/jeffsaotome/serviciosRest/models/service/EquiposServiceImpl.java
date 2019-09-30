package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffsaotome.serviciosRest.models.dao.EquiposDAO;
import com.jeffsaotome.serviciosRest.models.entity.Equipos;



@Service
public class EquiposServiceImpl implements EquiposService{

	@Autowired
	private EquiposDAO equipoDAO;
		
	
	@Override
	public List<Equipos> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipos listarid(String equserial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipos agregar(Equipos equ) {
		// TODO Auto-generated method stub
		return equipoDAO.save(equ);
	}

	@Override
	public Equipos editar(Equipos equ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipos eliminar(String equserial) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
