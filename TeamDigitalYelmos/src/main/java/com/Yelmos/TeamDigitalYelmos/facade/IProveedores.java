package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Proveedor;

public interface IProveedores {
	
	public List<Proveedor> findALll();
	public void create(Proveedor prov);
	public void update(Proveedor prov);
	public void delete(Proveedor prov);

}
