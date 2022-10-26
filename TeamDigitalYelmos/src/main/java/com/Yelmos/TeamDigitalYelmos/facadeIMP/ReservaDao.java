package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Reserva;
import com.Yelmos.TeamDigitalYelmos.facade.IReservas;
import com.Yelmos.TeamDigitalYelmos.repository.ReservaRepository;

@Service
public class ReservaDao implements IReservas {

	@Autowired
	private ReservaRepository reservaRepo;

	@Override
	public List<Reserva> findALll() {
		return this.reservaRepo.findAll();
	}

	@Override
	public Reserva create(Reserva reserv) {
		return reservaRepo.save(reserv);
	}

	@Override
	public Reserva update(Reserva reserv) {
		return reservaRepo.save(reserv);
	}

	@Override
	public void delete(Reserva reserv) {
		reservaRepo.delete(reserv);
	}
	
	
}
