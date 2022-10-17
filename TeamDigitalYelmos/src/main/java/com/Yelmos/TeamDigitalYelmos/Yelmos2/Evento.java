package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private int idEvent;
	
	@Column(name = "nombreE", length = 50)
	private String nomE;
	
	@Column(name = "descripcion", length = 100)
	private String descripE;
	
	@Column(name = "cantidadImplemento")
	private int cantImpleE;
	
	@Column(name = "implementosAdicionales", length = 20)
	private String nomProvee ;
	
	@Column(name = "cantidadImplementosAdicional")
	private int cantImpleAdiE;
	
	@OneToOne
    @JoinColumn(name="fk_reservaE")
    private Reserva idR;
	
	@OneToOne
    @JoinColumn(name="fk_tipoEvento")
    private TipoEvento idTE;

	
}
