package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Contrato;
import com.Yelmos.TeamDigitalYelmos.facade.IContratos;
import com.Yelmos.TeamDigitalYelmos.repository.ContratoRepository;

@Service
public class ContratoDao implements IContratos {
	
	@Autowired
	private ContratoRepository contratoRepor;

	@Override
	public List<Contrato> findALll() {
		return this.contratoRepor.findAll();
	}

	@Override
	public void create(Contrato contrac) {
		this.contratoRepor.save(contrac);
		
	}

	@Override
	public void update(Contrato contrac) {
		this.contratoRepor.save(contrac);
		
	}

	@Override
	public void delete(Contrato contrac) {
		Contrato cont = this.contratoRepor.getById(contrac.getIdContrato());
		this.contratoRepor.delete(cont);
		
	}
	
	

}
