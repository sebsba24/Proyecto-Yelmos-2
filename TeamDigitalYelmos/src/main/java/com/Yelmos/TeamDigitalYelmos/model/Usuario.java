package com.Yelmos.TeamDigitalYelmos.model;

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
public class Usuario {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long idUsuario;
	
	@Column(name = "nombreU", length =40)
	private String nombreU;
	
	@Column(name = "apellidoU", length =40)
	private String apellidoU;
	
	@Column(name = "emailU", length =80)
	private String emailU;
	
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

	
	public Usuario() {
		
	}
	
	
	public Usuario(String nombreU, String apellidoU, String emailU, Long documento, String estado,
			String contrasena, Rol rol) {
		super();
		this.nombreU = nombreU;
		this.apellidoU = apellidoU;
		this.emailU = emailU;
		this.documento = documento;
		this.estado = estado;
		this.contrasena = contrasena;
		this.rol = rol;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombreU() {
		return nombreU;
	}



	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}



	public String getApellidoU() {
		return apellidoU;
	}



	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}



	public String getEmailU() {
		return emailU;
	}



	public void setEmailU(String emailU) {
		this.emailU = emailU;
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
