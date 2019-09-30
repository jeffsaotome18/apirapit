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

import com.jeffsaotome.serviciosRest.models.entity.Plan;
import com.jeffsaotome.serviciosRest.models.service.PlanService;




@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/apiplan")
public class PlanRestController {

	@Autowired
	private PlanService planService;
	

	
	@RequestMapping(value = "/plan", produces = "application/json", method=RequestMethod.POST)
	public Plan addPlan(@RequestBody Plan pl) {

		planService.agregar(pl);
		return pl;
	}


	
	
	
	
	
	
	
	
	
	
	
}
