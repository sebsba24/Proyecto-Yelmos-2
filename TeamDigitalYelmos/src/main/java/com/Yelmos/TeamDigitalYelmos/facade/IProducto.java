package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Producto;

public interface IProducto {
	
	public List<Producto> findALll();
	public void create(Producto product);
	public void update(Producto product);
	public void delete(Producto product);

}
