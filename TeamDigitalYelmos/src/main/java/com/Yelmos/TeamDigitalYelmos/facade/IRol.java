package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Rol;

public interface IRol {
	
	public List<Rol> findALll();
	public void create(Rol rol);
	public void update(Rol rol);
	public void delete(Rol rol);
	Rol finById(Long rol);

}
