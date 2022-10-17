package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;

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
	private int idP;
	
	@Column(name = "cantidadEntrada")
	private int cantE;
	
	@Column(name = "observaciones", length =120)
	private String obser;
	
	@OneToOne
    @JoinColumn(name="fk_reservaP")
    private Reserva idR;

}
