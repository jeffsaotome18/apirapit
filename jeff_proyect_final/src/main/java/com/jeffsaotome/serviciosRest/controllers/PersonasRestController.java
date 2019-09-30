package com.jeffsaotome.serviciosRest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jeffsaotome.serviciosRest.models.entity.Personas;
import com.jeffsaotome.serviciosRest.models.service.PersonasService;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/apipersonas")
public class PersonasRestController {

	// injection dependency
		@Autowired
		private PersonasService personasService;

		@RequestMapping(value = "/personas", produces = "application/json", method=RequestMethod.GET)
		public List<Personas> listar() {
			return personasService.listar();
		}
		
		
		@RequestMapping(value = "/personas/{id}", produces = "application/json", method=RequestMethod.GET)
		public Optional<Personas> getPersona(@PathVariable Integer cedula) {

			Optional<Personas> person = personasService.listarid(cedula);
			return person;

		}
		
		
		
	//	@PostMapping("/personas")
	//@ResponseStatus(HttpStatus.CREATED)
	//	public Personas agregar(@RequestBody Personas per) {
	//		return personasService.agregar(per);
			
		//}
		@RequestMapping(value = "/personas", produces = "application/json", method=RequestMethod.POST)
		public Personas addPersona(@RequestBody Personas p) {
			personasService.agregar(p);
			return p;
		}
	
		
  
		
	
		
	
}
