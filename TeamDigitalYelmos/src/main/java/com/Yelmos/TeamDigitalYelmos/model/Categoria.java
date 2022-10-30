package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoria")
	private Long idCatego;
	
	@Column(name = "nombreCategoria", length = 40)
	private String nomCtego;

}
