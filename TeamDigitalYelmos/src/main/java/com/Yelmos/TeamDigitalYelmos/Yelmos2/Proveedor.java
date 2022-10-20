package com.Yelmos.TeamDigitalYelmos.Yelmos2;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProveedor")
	private int idProv;
	
	@Column(name = "nombreProveedor", length = 60)
	private String nomProvee;
	
	@Column(name = "emailP", length = 80)
	private String emailP;
	
	@Column(name = "telefonoP")
	private Long teleP;
	
	@OneToOne
    @JoinColumn(name="fk_tipoProveedor")
    private TipoProveedor idTProv;
	

}
