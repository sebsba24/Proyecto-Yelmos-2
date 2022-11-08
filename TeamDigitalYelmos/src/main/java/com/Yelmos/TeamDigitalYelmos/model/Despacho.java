package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "despachos")
@Getter
@Setter
public class Despacho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDespacho")
	private Long idDespa;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "fechaSalida")
	private Date fechaSalida;
	
	@Column(name = "cantidadSalida")
	private int cantidadSalida;
	
	@Column(name = "estadoDespacho", length = 12)
	private String estadoDespacho;
	
	@OneToOne
    @JoinColumn(name="fk_productoD")
    private Producto fk_productoD;
	
	@ManyToOne
    @JoinColumn(name="fk_packing")
    private Packing fk_packing;

	public Despacho() {
	}
	
	
	public Despacho(Long idDespa, Date fechaSalida, int cantidadSalida, String estadoDespacho, Producto fk_productoD,
			Packing fk_packing) {
		super();
		this.idDespa = idDespa;
		this.fechaSalida = fechaSalida;
		this.cantidadSalida = cantidadSalida;
		this.estadoDespacho = estadoDespacho;
		this.fk_productoD = fk_productoD;
		this.fk_packing = fk_packing;
	}
	
	public Despacho(Date fechaSalida, int cantidadSalida, String estadoDespacho, Producto fk_productoD,
			Packing fk_packing) {
		super();
		this.fechaSalida = fechaSalida;
		this.cantidadSalida = cantidadSalida;
		this.estadoDespacho = estadoDespacho;
		this.fk_productoD = fk_productoD;
		this.fk_packing = fk_packing;
	}


	public Long getIdDespa() {
		return idDespa;
	}


	public void setIdDespa(Long idDespa) {
		this.idDespa = idDespa;
	}


	public Date getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public int getCantidadSalida() {
		return cantidadSalida;
	}


	public void setCantidadSalida(int cantidadSalida) {
		this.cantidadSalida = cantidadSalida;
	}


	public String getEstadoDespacho() {
		return estadoDespacho;
	}


	public void setEstadoDespacho(String estadoDespacho) {
		this.estadoDespacho = estadoDespacho;
	}


	public Producto getFk_productoD() {
		return fk_productoD;
	}


	public void setFk_productoD(Producto fk_productoD) {
		this.fk_productoD = fk_productoD;
	}


	public Packing getFk_packing() {
		return fk_packing;
	}


	public void setFk_packing(Packing fk_packing) {
		this.fk_packing = fk_packing;
	}
	
}
