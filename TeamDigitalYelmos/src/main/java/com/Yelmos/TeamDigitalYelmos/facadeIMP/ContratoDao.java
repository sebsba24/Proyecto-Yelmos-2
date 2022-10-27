package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Contrato;
import com.Yelmos.TeamDigitalYelmos.facade.IContratos;
import com.Yelmos.TeamDigitalYelmos.repository.ContratoRepository;

@Service
public class ContratoDao {
	
	@Autowired
	private ContratoRepository contratoRepor;

	public List<Contrato> findAll() {
		return contratoRepor.findAll();
	}


	public Contrato create(Contrato contrac) {
		return contratoRepor.save(contrac);
		
	}


	public Contrato update(Contrato contrac) {
		return contratoRepor.save(contrac);
		
	}


	public void delete(Contrato contrac) {
		contratoRepor.delete(contrac);
		
	}
	
	

}
