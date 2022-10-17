package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "contratos")
public class Contrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContrato")
	private int idContrato;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioC")
	private Date inicioC;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFinC")
	private Date finC;
	
	@Column(name = "detalles", length = 100)
	private String dtlls;
	
	@OneToOne
    @JoinColumn(name="fk_tipoContrato")
    private TipoContrato idTContra;
	
	@OneToOne
    @JoinColumn(name="fk_evento")
    private Evento idEvent;
	
	@OneToOne
    @JoinColumn(name="fk_proveedor")
    private Proveedor idProv;

}
