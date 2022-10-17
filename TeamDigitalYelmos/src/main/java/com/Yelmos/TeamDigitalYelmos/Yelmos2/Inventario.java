package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "inventarios")

public class Inventario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idInventario")
	private int idInvt;
	
	@Column(name = "cantidad")
	private int cnt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaIngreso")
	private Date fechaing;
	
	@OneToOne
    @JoinColumn(name="fk_productoI")
    private Producto idProduc;

}
