package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffsaotome.serviciosRest.models.dao.lineasDAO;
import com.jeffsaotome.serviciosRest.models.entity.Lineas;



@Service
public class LineasServiceImpl implements LineasService {

	@Autowired
	private lineasDAO lineaDAO;
	

	
	@Override
	public List<Lineas> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lineas listarid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lineas agregar(Lineas li) {

		return lineaDAO.save(li);
	}

	@Override
	public Lineas editar(Lineas li) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lineas eliminar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
}
