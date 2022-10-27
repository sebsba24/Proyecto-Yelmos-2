package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.TipoContrato;
import com.Yelmos.TeamDigitalYelmos.repository.TipoContratoRepository;

@Service
public class TipoControtaDao {
	
	@Autowired
	private TipoContratoRepository tipoContratoRepor;
	
	public List<TipoContrato> findAll(){
		return this.tipoContratoRepor.findAll();
	}
	
	public TipoContrato create (TipoContrato tpcontra) {
		return tipoContratoRepor.save(tpcontra);
		
	}
	
	public TipoContrato update (TipoContrato tpcontra) {
		return tipoContratoRepor.save(tpcontra);
		
	}
	
	public void delete (TipoContrato tpcontra) {
		tipoContratoRepor.delete(tpcontra);
	}
	
	

}
