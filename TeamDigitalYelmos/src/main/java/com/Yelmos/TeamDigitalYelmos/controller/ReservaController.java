package com.Yelmos.TeamDigitalYelmos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Reserva;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.ReservaDao;

@Controller
@RequestMapping(path= "/api/teamDigitalYelmos/reservas" )
public class ReservaController {
	
	@Autowired
	private ReservaDao reservaDao;
	
	@GetMapping("/all")
	public List<Reserva>findAll(){
		return reservaDao.findALll();
		
	}
	
	@PostMapping("/create")
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
