package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IDespachos;
import com.Yelmos.TeamDigitalYelmos.model.Despacho;
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
		despachoRepor.save(despa);		
	}

	@Override
	public void saveDes(Despacho despa) {
		despachoRepor.save(despa);
		
	}

	@Override
	public Despacho findById(Long idDespa) {
		return despachoRepor.findById(idDespa).get();
	}

	@Override
	public void update(Despacho despa) {
		despachoRepor.save(despa);
		
	}

	@Override
	public void delete(Long idDespa) {
		despachoRepor.deleteById(idDespa);
		
	}
	
	
	

}
