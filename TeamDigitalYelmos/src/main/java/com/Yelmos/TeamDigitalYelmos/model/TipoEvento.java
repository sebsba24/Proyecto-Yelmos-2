package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tiposeventos")
public class TipoEvento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoEvento")
	private Long idTE;
	
	@Column(name = "nombreTipoE", length = 30)
	private String nomtipe;
	
	@Column(name = "implementos" , length = 40)
	private String implemet;

}
