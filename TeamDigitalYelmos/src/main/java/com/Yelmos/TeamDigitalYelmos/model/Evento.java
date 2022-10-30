package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "eventos")
@Getter
@Setter
public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private Long idEvent;
	
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
	
	@OneToMany(mappedBy = "fk_evento")
	private List <Contrato> ListContrato;

	public Long getIdEvent() {
		return idEvent;
	}
	
}
