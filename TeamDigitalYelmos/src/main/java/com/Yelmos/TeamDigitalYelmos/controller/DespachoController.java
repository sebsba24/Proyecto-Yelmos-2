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
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.facadeIMP.DespachoDao;
import com.Yelmos.TeamDigitalYelmos.model.Despacho;
import com.Yelmos.TeamDigitalYelmos.model.Rol;

@RestController
@RequestMapping(path = "/api/TeamDigitalYelmos/Despachos")
public class DespachoController {
	
	@Autowired
	private DespachoDao despachoDao;
	
	@GetMapping
	public List<Despacho> findAll(){
		return despachoDao.findAll();
		
	}
	
	@PostMapping
	public Despacho create (@RequestBody Despacho despa) {
		return despachoDao.create(despa);
		
	}
	
	@PutMapping
	public Despacho update (@RequestBody Despacho despa) {
		return despachoDao.update(despa);
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Despacho despa) {
		despachoDao.delete(despa);
	}

}
