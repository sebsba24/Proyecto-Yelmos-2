package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tiposcontratos")
@Getter
@Setter
public class TipoContrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoContrato")
	private Long idTContra;
	
	@Column(name = "nombreTipoContrato", length = 50)
	private String tipContrato;
	

}
