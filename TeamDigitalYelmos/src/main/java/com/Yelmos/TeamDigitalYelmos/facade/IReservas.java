package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Reserva;

public interface IReservas {
	
	public List<Reserva> findALll();
	public void create(Reserva reserv);
	public void update(Reserva reserv);
	public void delete(Reserva reserv);

}
