package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tipoproductos")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProducto")
	private Long idTP;
	
	@Column(name ="marca", length = 50)
	private String marca;

}
