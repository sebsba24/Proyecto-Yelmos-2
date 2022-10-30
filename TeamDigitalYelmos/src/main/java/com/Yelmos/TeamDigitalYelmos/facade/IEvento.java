package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Evento;

public interface IEvento {
	
	public List<Evento> findALll();
	public void create(Evento event);
	public void update(Evento event);
	public void delete(Evento event);

}
