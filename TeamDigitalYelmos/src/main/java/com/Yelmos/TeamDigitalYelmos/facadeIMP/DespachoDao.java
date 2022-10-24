package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Despacho;
import com.Yelmos.TeamDigitalYelmos.facade.IDespachos;
import com.Yelmos.TeamDigitalYelmos.repository.DespachoRepository;

@Service
public class DespachoDao implements IDespachos {

	@Autowired
	private DespachoRepository despachoRepor;
	
	@Override
	public List<Despacho> findALll() {
		return this.despachoRepor.findAll();
	}

	@Override
	public void create(Despacho despa) {
		this.despachoRepor.save(despa);
		
	}

	@Override
	public void update(Despacho despa) {
		this.despachoRepor.save(despa);
		
	}

	@Override
	public void delete(Despacho despa) {
		Despacho despac = this.despachoRepor.getById(despa.getIdDespa());
		this.despachoRepor.delete(despac);
		
	}
	
	

}
