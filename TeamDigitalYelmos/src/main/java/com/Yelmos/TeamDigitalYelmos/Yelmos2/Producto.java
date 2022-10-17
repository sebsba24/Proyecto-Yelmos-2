package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;

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
	

}
