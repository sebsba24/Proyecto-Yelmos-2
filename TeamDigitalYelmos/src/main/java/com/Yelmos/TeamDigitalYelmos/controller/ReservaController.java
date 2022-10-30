package com.Yelmos.TeamDigitalYelmos.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.facadeIMP.ReservaDao;
import com.Yelmos.TeamDigitalYelmos.model.Reserva;

@RestController
@RequestMapping(path= "/api/teamDigitalYelmos/reservas" )
public class ReservaController {
	
	@Autowired
	private ReservaDao reservaDao;
	
	@GetMapping
	public List<Reserva>findAll(){
		return reservaDao.findALll();
		
	}
	
	@PostMapping
	public Reserva create (@RequestBody Reserva reserv) {
		return reservaDao.create(reserv);
		
	}
	
	@PutMapping
	public Reserva update (@RequestBody Reserva reserv) {
		return reservaDao.update(reserv);
		
	}
	
	@DeleteMapping
	public void delete (@RequestBody Reserva reserv) {
		reservaDao.delete(reserv);
	}

}
