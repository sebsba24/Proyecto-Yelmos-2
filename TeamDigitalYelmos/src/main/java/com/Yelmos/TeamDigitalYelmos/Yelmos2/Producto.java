package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private int idProduc;
	
	@Column(name = "nombreProducto", length = 100)
	private String nomProduct;
	
	@OneToOne
    @JoinColumn(name="fk_categoria")
    private Categoria idCatego;
	
	@OneToOne
    @JoinColumn(name="fk_tipoProducto")
    private TipoProducto idTP;
	
	@ManyToOne
	@JoinColumn(name = "fk_inventario", referencedColumnName = "idInventario")
	private Inventario fk_inventario;
	
	@ManyToMany(mappedBy = "ListProducto")
	private List<Despacho> ListDespacho;
	
	
	

}
