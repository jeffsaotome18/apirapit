package com.jeffsaotome.serviciosRest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffsaotome.serviciosRest.models.dao.PlanDAO;
import com.jeffsaotome.serviciosRest.models.entity.Plan;


@Service
public class PlanServiceImpl implements PlanService{

	
	@Autowired
	private PlanDAO planDAO;
	
	@Override
	public List<Plan> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan listarid(String planvalor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan agregar(Plan pl) {
		// TODO Auto-generated method stub
		return planDAO.save(pl);
	}

	@Override
	public Plan editar(Plan pl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan eliminar(String planvalor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
