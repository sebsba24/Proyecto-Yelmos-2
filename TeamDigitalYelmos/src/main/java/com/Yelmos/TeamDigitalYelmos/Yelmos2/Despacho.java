package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "despachos")
public class Despacho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDespacho")
	private int idDespa;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaSalida")
	private Date fechaing;
	
	@Column(name = "cantidadSalida")
	private int cantS;
	
	@Column(name = "estadoDespacho", length = 12)
	private String estadoDes;
	
	@OneToOne
    @JoinColumn(name="fk_productoD")
    private Producto idProduc;
	
	@ManyToOne
    @JoinColumn(name="fk_packing", referencedColumnName = "idPacking")
    private Packing fk_packing;
	
	@ManyToMany
	@JoinTable(name="despacho_producto",
			joinColumns = @JoinColumn(name="fk_productoI", nullable=false),
			inverseJoinColumns=@JoinColumn(name="fk_despacho",nullable=false))
	private List <Producto> ListProducto;
	
	

}
