package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;

@Entity
@Table(name = "usuarios")
@Getter
@Setter 
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long idU;
	
	@Column(name = "nombreU", length =40)
	private String nomU;
	
	@Column(name = "apellidoU", length =40)
	private String apeU;
	
	@Column(name = "emailU", length =80)
	private String emaU;
	
	@Column(name = "documento")
	private Long documento;
	
	@Column(name = "estado", length =14)
	private String estado;
	
	@Column(name = "contrasena", length =50)
	private String contrasena;
	
	@OneToOne
    @JoinColumn(name="rol")
    private Rol rol;
	
	@OneToMany(mappedBy = "fk_usuario")
	private List<Reserva> ListReserva;

	public Long getIdU() {
		return idU;
	}

	public void setIdU(Long idU) {
		this.idU = idU;
	}

	public String getNomU() {
		return nomU;
	}

	public void setNomU(String nomU) {
		this.nomU = nomU;
	}

	public String getApeU() {
		return apeU;
	}

	public void setApeU(String apeU) {
		this.apeU = apeU;
	}

	public String getEmaU() {
		return emaU;
	}

	public void setEmaU(String emaU) {
		this.emaU = emaU;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Reserva> getListReserva() {
		return ListReserva;
	}

	public void setListReserva(List<Reserva> listReserva) {
		ListReserva = listReserva;
	}
	
	

}
