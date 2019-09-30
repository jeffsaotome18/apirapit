package com.jeffsaotome.serviciosRest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Facturas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="factnumero")
    private Integer factnumero;
	
	@Column(name="linumerolineas")
	private String linumerolineas;
	
	@Column(name="facfechaemision")
	private String facfechaemision;
	
	@Column(name="facvalor")
	private String facvalor;
	
    public Facturas() {
		
	}

	public Integer getFactnumero() {
		return factnumero;
	}

	public void setFactnumero(Integer factnumero) {
		this.factnumero = factnumero;
	}

	public String getLinumerolineas() {
		return linumerolineas;
	}

	public void setLinumerolineas(String linumerolineas) {
		this.linumerolineas = linumerolineas;
	}

	public String getFacfechaemision() {
		return facfechaemision;
	}

	public void setFacfechaemision(String facfechaemision) {
		this.facfechaemision = facfechaemision;
	}

	public String getFacvalor() {
		return facvalor;
	}

	public void setFacvalor(String facvalor) {
		this.facvalor = facvalor;
	}
	
	
	
	
}
