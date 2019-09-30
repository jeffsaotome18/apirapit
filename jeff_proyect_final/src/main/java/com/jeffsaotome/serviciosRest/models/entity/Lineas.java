package com.jeffsaotome.serviciosRest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linea")
public class Lineas {

	@Id
	@Column(name="linumerolinea")
	private String linumerolinea;
	
	@Column(name="perid")
	private Integer perid;
	
	@Column(name="linestado")
	private String linestado;
	    
	
    public Lineas() {
    	
	}
    
	public String getLinumerolinea() {
		return linumerolinea;
	}

	public void setLinumerolinea(String linumerolinea) {
		this.linumerolinea = linumerolinea;
	}

	public Integer getPerid() {
		return perid;
	}

	public void setPerid(Integer perid) {
		this.perid = perid;
	}

	public String getLinestado() {
		return linestado;
	}

	public void setLinestado(String linestado) {
		this.linestado = linestado;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
