package com.Yelmos.TeamDigitalYelmos.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private Long idProduc;
	
	@Column(name = "nombreProducto", length = 100)
	private String nomProduct;
	
	@OneToOne
    @JoinColumn(name="fk_categoria")
    private Categoria idCatego;
	
	@OneToOne
    @JoinColumn(name="fk_tipoProducto")
    private TipoProducto idTP;
	
	@ManyToOne
	@JoinColumn(name = "fk_inventario")
	private Inventario fk_inventario;

	public Producto() {
		
	}
	
	public Producto(Long idProduc, String nomProduct, Categoria idCatego, TipoProducto idTP, Inventario fk_inventario) {
		super();
		this.idProduc = idProduc;
		this.nomProduct = nomProduct;
		this.idCatego = idCatego;
		this.idTP = idTP;
		this.fk_inventario = fk_inventario;
	}
	
	public Producto(String nomProduct, Categoria idCatego, TipoProducto idTP, Inventario fk_inventario) {
		super();
		this.nomProduct = nomProduct;
		this.idCatego = idCatego;
		this.idTP = idTP;
		this.fk_inventario = fk_inventario;
	}

	public Long getIdProduc() {
		return idProduc;
	}

	public void setIdProduc(Long idProduc) {
		this.idProduc = idProduc;
	}

	public String getNomProduct() {
		return nomProduct;
	}

	public void setNomProduct(String nomProduct) {
		this.nomProduct = nomProduct;
	}

	public Categoria getIdCatego() {
		return idCatego;
	}

	public void setIdCatego(Categoria idCatego) {
		this.idCatego = idCatego;
	}

	public TipoProducto getIdTP() {
		return idTP;
	}

	public void setIdTP(TipoProducto idTP) {
		this.idTP = idTP;
	}

	public Inventario getFk_inventario() {
		return fk_inventario;
	}

	public void setFk_inventario(Inventario fk_inventario) {
		this.fk_inventario = fk_inventario;
	}
	
	
	
	
	

}
