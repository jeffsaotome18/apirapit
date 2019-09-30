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

import com.jeffsaotome.serviciosRest.models.entity.Equipos;
import com.jeffsaotome.serviciosRest.models.service.EquiposService;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/apiequipos")
public class EquiposRestController {

	@Autowired
	private EquiposService equipoService;
	

	
	@RequestMapping(value = "/equipos", produces = "application/json", method=RequestMethod.POST)	
	public Equipos addEquipo(@RequestBody Equipos equ) {

		equipoService.agregar(equ);
		return equ;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
