package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Reserva;

public interface IReservas {
	
	public List<Reserva> findALll();
	public Reserva create(Reserva reserv);
	public Reserva update(Reserva reserv);
	public void delete(Reserva reserv);

}
