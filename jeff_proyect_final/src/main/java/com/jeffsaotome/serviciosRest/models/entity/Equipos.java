package com.jeffsaotome.serviciosRest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class Equipos {

	@Id
	@Column(name="equserial")
	private String equserial;
	
	@Column(name="linumerolineaeq")
	private String linumerolineaeq;
	
	@Column(name="equmarca")
	private String equmarca;
	
	@Column(name="equdescripcion")
	private String equdescripcion;
	
	@Column(name="equestado")
	private String equestado;
	
   public Equipos() {
		
	}

public String getEquserial() {
	return equserial;
}

public void setEquserial(String equserial) {
	this.equserial = equserial;
}

public String getLinumerolineaeq() {
	return linumerolineaeq;
}

public void setLinumerolineaeq(String linumerolineaeq) {
	this.linumerolineaeq = linumerolineaeq;
}

public String getEqumarca() {
	return equmarca;
}

public void setEqumarca(String equmarca) {
	this.equmarca = equmarca;
}

public String getEqudescripcion() {
	return equdescripcion;
}

public void setEqudescripcion(String equdescripcion) {
	this.equdescripcion = equdescripcion;
}

public String getEquestado() {
	return equestado;
}

public void setEquestado(String equestado) {
	this.equestado = equestado;
}
   
   
	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
}
