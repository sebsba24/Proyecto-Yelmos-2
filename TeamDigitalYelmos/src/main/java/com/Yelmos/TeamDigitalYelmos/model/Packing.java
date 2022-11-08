package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name ="Packing")

public class Packing{

	
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

	public Packing() {
		
	}
	
	public Packing(Long idP, int cantE, String obser, Reserva idR, List<Despacho> listDespacho) {
		super();
		this.idP = idP;
		this.cantE = cantE;
		this.obser = obser;
		this.idR = idR;
		ListDespacho = listDespacho;
	}
	
	public Packing(int cantE, String obser, Reserva idR, List<Despacho> listDespacho) {
		super();
		this.cantE = cantE;
		this.obser = obser;
		this.idR = idR;
		ListDespacho = listDespacho;
	}

	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	public int getCantE() {
		return cantE;
	}

	public void setCantE(int cantE) {
		this.cantE = cantE;
	}

	public String getObser() {
		return obser;
	}

	public void setObser(String obser) {
		this.obser = obser;
	}

	public Reserva getIdR() {
		return idR;
	}

	public void setIdR(Reserva idR) {
		this.idR = idR;
	}

	public List<Despacho> getListDespacho() {
		return ListDespacho;
	}

	public void setListDespacho(List<Despacho> listDespacho) {
		ListDespacho = listDespacho;
	}
	
	
	
	

}
