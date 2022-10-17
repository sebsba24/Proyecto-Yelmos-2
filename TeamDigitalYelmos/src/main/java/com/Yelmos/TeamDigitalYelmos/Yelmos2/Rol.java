package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "roles")

public class Rol implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rol;
	
	@Column(name="nombreRol", length =20)
	private String nombreRol;
	

}
