package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Despacho;

public interface IDespachos {
	
	public List<Despacho> findALll();
	public void create(Despacho despa);
	public void update(Despacho despa);
	public void delete(Despacho despa);

}
