package com.Yelmos.TeamDigitalYelmos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Yelmos.TeamDigitalYelmos.facadeIMP.EventoDao;
import com.Yelmos.TeamDigitalYelmos.model.Evento;
import com.Yelmos.TeamDigitalYelmos.model.Rol;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Eventos" )
public class EventoController {
	
	@Autowired
	private EventoDao eventoDao;
	
	@GetMapping
	public List <Evento> findAll(){
		return eventoDao.findAll();
		
	}
	
	@PostMapping
	public Evento create (@RequestBody Evento event) {
		return eventoDao.create(null);
		
	}
	
	@PutMapping
	public Evento update (@RequestBody Evento event) {
		return eventoDao.update(event);
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Evento event) {
		eventoDao.delete(event);
	}

}
