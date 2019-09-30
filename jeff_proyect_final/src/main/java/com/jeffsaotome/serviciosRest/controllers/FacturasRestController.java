package com.jeffsaotome.serviciosRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jeffsaotome.serviciosRest.models.entity.Facturas;
import com.jeffsaotome.serviciosRest.models.service.FacturasService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/apifacturas")
public class FacturasRestController {

	@Autowired
	private FacturasService facturaService;
	

	
	@RequestMapping(value = "/facturas", produces = "application/json", method=RequestMethod.POST)
	public Facturas addFacturas(@RequestBody Facturas fac) {

		facturaService.agregar(fac);
		return fac;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
