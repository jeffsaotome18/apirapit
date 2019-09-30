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

import com.jeffsaotome.serviciosRest.models.entity.Lineas;
import com.jeffsaotome.serviciosRest.models.service.LineasService;
;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/apilineas")
public class LineasRestController {
	
	@Autowired
	private LineasService lineasService;
	

	//@PostMapping("/lineas")
	
	@RequestMapping(value = "/lineas", produces = "application/json", method=RequestMethod.POST)
	public Lineas addLinea(@RequestBody Lineas li) {

		lineasService.agregar(li);
		return li;
	}

	
	
	
}
