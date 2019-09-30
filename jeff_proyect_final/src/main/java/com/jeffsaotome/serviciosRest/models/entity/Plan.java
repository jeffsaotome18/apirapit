package com.jeffsaotome.serviciosRest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoplan")
public class Plan {

	@Id
	@Column(name="planvalor")
	private String planvalor;
	
	@Column(name="linumerolineatip")
	private String linumerolineatip;
	
	

	
	public Plan(){
		
	}
	


	public String getLinumerolineatip() {
		return linumerolineatip;
	}

	public void setLinumerolineatip(String linumerolineatip) {
		this.linumerolineatip = linumerolineatip;
	}

	public String getPlanvalor() {
		return planvalor;
	}

	public void setPlanvalor(String planvalor) {
		this.planvalor = planvalor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
