package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IDespachos;
import com.Yelmos.TeamDigitalYelmos.model.Despacho;
import com.Yelmos.TeamDigitalYelmos.repository.DespachoRepository;

@Service
public class DespachoDao {

	@Autowired
	private DespachoRepository despachoRepor;
	
	public List<Despacho> findAll() {
		return despachoRepor.findAll();
	}

	public Despacho create(Despacho despa) {
		return despachoRepor.save(despa);
		
	}

	public Despacho  update(Despacho despa) {
		return despachoRepor.save(despa);
		
	}

	public void delete(Despacho despa) {
		despachoRepor.delete(despa);
	}
	
	

}
