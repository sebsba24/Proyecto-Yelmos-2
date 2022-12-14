package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tiposproveedores")
public class TipoProveedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProveedor")
	private Long idTProv;
	
	@Column(name = "nombreTipoP" , length = 30)
	private String nomTipP;
	
	@Column(name = "implemento" , length = 50)
	private String impP;
}
