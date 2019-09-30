package com.jeffsaotome.serviciosRest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jeffsaotome.serviciosRest.models.entity.Facturas;


public interface FacturasDAO extends CrudRepository<Facturas, Integer>{


	public List<Facturas>findAll();

    public Facturas findById(int factnumero);
	
	public Facturas save(Facturas fac);
	
	public void delete(Facturas fac);
	
	
	
}
