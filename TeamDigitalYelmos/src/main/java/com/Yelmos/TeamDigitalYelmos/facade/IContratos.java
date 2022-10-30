package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Contrato;

public interface IContratos {
	
	public List<Contrato> findALll();
	public void create(Contrato contrac);
	public void update(Contrato contrac);
	public void delete(Contrato contrac);

}
