package com.jeffsaotome.serviciosRest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Personas {
	
	@Id
	@Column(name="percedula")
	private Integer cedula;
	
	
	@Column(name="pernombre")
	private String nombre;
	
	@Column(name="perapellido")
	private String apellido;
	
	@Column(name="pertelefonofijo")
	private String telefonofijo;
	
	@Column(name="perfechanacimiento")
	private String fechanacimiento;
	
	
	public Personas() {
		
	}



	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefonofijo() {
		return telefonofijo;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTelefonofijo(String telefonofijo) {
		this.telefonofijo = telefonofijo;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	

	
	
	
	
}
