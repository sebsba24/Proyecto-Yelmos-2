package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Evento;
import com.Yelmos.TeamDigitalYelmos.facade.IEvento;
import com.Yelmos.TeamDigitalYelmos.repository.EventoRepository;

@Service
public class EventoDao implements IEvento {
	
	@Autowired
	private EventoRepository eventoRepor;

	@Override
	public List<Evento> findALll() {
		return this.eventoRepor.findAll();
	}

	@Override
	public void create(Evento event) {
		this.eventoRepor.save(event);
		
	}

	@Override
	public void update(Evento event) {
		this.eventoRepor.save(event);
		
	}

	@Override
	public void delete(Evento event) {
		Evento eve = this.eventoRepor.getById(event.getIdEvent());
		this.eventoRepor.delete(eve);
		
	}
	
	
	

}
