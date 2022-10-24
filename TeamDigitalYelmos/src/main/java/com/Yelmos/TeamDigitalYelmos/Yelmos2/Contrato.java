package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;


import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contratos")
@Getter
@Setter
public class Contrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContrato")
	private Long idContrato;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioC")
	private Date inicioC;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFinC")
	private Date finC;
	
	@Column(name = "detalles", length = 100)
	private String dtlls;
	
	@ManyToOne
	@JoinColumn(name = "fk_proveedor", referencedColumnName = "idProveedor")
	private Proveedor fk_proveedor;
	
	@ManyToOne
    @JoinColumn(name="fk_evento", referencedColumnName = "idEvento")
    private Evento fk_evento;
	
	@OneToOne
    @JoinColumn(name="fk_tipoContrato")
    private TipoContrato idTContra;
	
	public Long getIdContrato() {
		return idContrato;
	}

}
