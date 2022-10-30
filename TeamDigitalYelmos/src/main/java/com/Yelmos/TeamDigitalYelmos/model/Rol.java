package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Rol implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRol")
	private Long idRol;
	
	@Column(name="nombreRol", length =20)
	private String nombreRol;

	public Rol() {
		
	}
	
	
	public Rol(String nombreRol) {
		super();
		this.nombreRol = nombreRol;
	}
	
	

	public Rol(Long idRol, String nombreRol) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
	}


	public Long getRol() {
		return idRol;
	}

	public void setRol(Long rol) {
		this.idRol = rol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	
	
	

}
