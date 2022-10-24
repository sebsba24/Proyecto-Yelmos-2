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
	public void create(Reserva reserv) {
		this.reservaRepo.save(reserv);
		
	}

	@Override
	public void update(Reserva reserv) {
		this.reservaRepo.save(reserv);
		
	}

	@Override
	public void delete(Reserva reserv) {
		Reserva reser = this.reservaRepo.getById(reserv.getIdR());
		this.reservaRepo.delete(reser);
		
	}

}
