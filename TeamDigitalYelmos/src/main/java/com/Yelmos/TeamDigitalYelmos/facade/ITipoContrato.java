package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.TipoContrato;

public interface ITipoContrato {
	
	public List<TipoContrato> findALll();
	public void create(TipoContrato tpcontra);
	public void update(TipoContrato tpcontra);
	public void delete(TipoContrato tpcontra);

}
