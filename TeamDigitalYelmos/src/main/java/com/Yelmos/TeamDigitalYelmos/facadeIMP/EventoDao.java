package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IEvento;
import com.Yelmos.TeamDigitalYelmos.model.Evento;
import com.Yelmos.TeamDigitalYelmos.repository.EventoRepository;

@Service
public class EventoDao {
	
	@Autowired
	private EventoRepository eventoRepor;

	public List<Evento> findAll() {
		return this.eventoRepor.findAll();
	}

	public Evento create(Evento event) {
		return eventoRepor.save(event);
		
	}

	public Evento update(Evento event) {
		return eventoRepor.save(event);
		
	}

	public void delete(Evento event) {
		eventoRepor.delete(event);
		
	}
	
	
	

}
