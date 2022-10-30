package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "despachos")
@Getter
@Setter
public class Despacho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDespacho")
	private Long idDespa;
	
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
	
	public Long getIdDespa() {
		return idDespa;
	}
	

}
