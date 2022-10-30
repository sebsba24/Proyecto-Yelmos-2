package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IReservas;
import com.Yelmos.TeamDigitalYelmos.model.Reserva;
import com.Yelmos.TeamDigitalYelmos.repository.ReservaRepository;

@Service
public class ReservaDao{

	@Autowired
	private ReservaRepository reservaRepo;


	public List<Reserva> findALll() {
		return this.reservaRepo.findAll();
	}


	public Reserva create(Reserva reserv) {
		return reservaRepo.save(reserv);
	}


	public Reserva update(Reserva reserv) {
		return reservaRepo.save(reserv);
	}


	public void delete(Reserva reserv) {
		reservaRepo.delete(reserv);
	}
	
	
}
