package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name ="Packing")

public class Packing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPacking")
	private Long idP;
	
	@Column(name = "cantidadEntrada")
	private int cantE;
	
	@Column(name = "observaciones", length =120)
	private String obser;
	
	@OneToOne
    @JoinColumn(name="fk_reservaP")
    private Reserva idR;
	
	@OneToMany (mappedBy = "fk_packing")
	private List <Despacho> ListDespacho;

}
