package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservas")
@Getter
@Setter
public class Reserva implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReseva")
	private Long idR;
	
	@Column(name = "direccionR", length =40)
	private String direR;
	
	@Column(name = "emailR", length =60)
	private String emailR;
	
	@Column(name = "telefonoR")
	private Long telR;
	
	@Column(name = "localidadR", length =30)
	private String locaR;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioR")
	private Date inicioR;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFinR")
	private Date finR;
	
	@ManyToOne
    @JoinColumn(name="fk_usuario", referencedColumnName = "idUsuario")
    private Usuario fk_usuario;
	
	public Long getIdR() {
		return idR;
	}
	
	
	
	

}
