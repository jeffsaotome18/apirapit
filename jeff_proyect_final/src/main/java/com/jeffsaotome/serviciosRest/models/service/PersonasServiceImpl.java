package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffsaotome.serviciosRest.models.dao.PersonasDAO;
import com.jeffsaotome.serviciosRest.models.entity.Personas;



@Service
public class PersonasServiceImpl implements PersonasService {

	@Autowired
	private PersonasDAO personasDAO;
	
	@Override
	public List<Personas> listar() {
		// TODO Auto-generated method stub
		return personasDAO.findAll();
	}

	@Override
	public Optional<Personas> listarid(Integer cedula) {
		return personasDAO.findById(cedula);
		// TODO Auto-generated method stub
		//return personasDAO.findById(id);
	}

	@Override
	public Personas agregar(Personas p) {
		// TODO Auto-generated method stub
		return  personasDAO.save(p);
	}

	@Override
	public Personas editar(Personas p) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Personas eliminar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
