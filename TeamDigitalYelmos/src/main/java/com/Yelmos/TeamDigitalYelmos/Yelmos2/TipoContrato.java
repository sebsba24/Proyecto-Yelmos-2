package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "tiposcontratos")
public class TipoContrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoContrato")
	private int idTContra;
	
	@Column(name = "nombreTipoContrato", length = 50)
	private String tipContrato;
	

}
