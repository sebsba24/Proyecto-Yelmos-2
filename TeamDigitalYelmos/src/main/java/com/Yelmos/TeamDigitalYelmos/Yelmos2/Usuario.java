package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private int idU;
	
	@Column(name = "nombreU", length =40)
	private String nomU;
	
	@Column(name = "apellidoU", length =40)
	private String apeU;
	
	@Column(name = "emailU", length =80)
	private String emaU;
	
	@Column(name = "documento")
	private Long documento;
	
	@Column(name = "estado", length =14)
	private String estado;
	
	@Column(name = "contrasena", length =50)
	private String contrasena;
	
	@OneToOne
    @JoinColumn(name="rol")
    private Rol rol;

}
