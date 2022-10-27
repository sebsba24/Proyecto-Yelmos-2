package com.Yelmos.TeamDigitalYelmos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.TipoContrato;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.TipoControtaDao;

@RestController
@RequestMapping(path= "/api/teamDigitalYelmos/tipocontrato" )
public class TipoContratoController {
	
	@Autowired
	private TipoControtaDao tipoContratoDao;
	
	@GetMapping
	public List<TipoContrato>findAll(){
		return tipoContratoDao.findAll();
		
	}
	
	@PostMapping
	public TipoContrato create (@RequestBody TipoContrato tpcontra) {
		return tipoContratoDao.create(tpcontra);
		
	}
	
	@PutMapping
	public TipoContrato update (@RequestBody TipoContrato tpcontra) {
		return tipoContratoDao.update(tpcontra);
		
	}
	
	@DeleteMapping
	public void delete (@RequestBody  TipoContrato tpcontra) {
		tipoContratoDao.delete(tpcontra);
	}
	
	

}
