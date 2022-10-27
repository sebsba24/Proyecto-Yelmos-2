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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Contrato;
import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.ContratoDao;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Contratos")
public class ContratoController {
	
	@Autowired
	private ContratoDao contratoDao;
	
	@GetMapping("/all")
	public List <Contrato> findAll(){
		return contratoDao.findAll();
		
	}
	
	@PostMapping
	public Contrato create (@RequestBody Contrato contrac) {
		return contratoDao.create(contrac);
		
	}
	
	@PutMapping
	public Contrato update (@RequestBody Contrato contrac) {
		return contratoDao.update(contrac);
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Contrato contrac) {
		contratoDao.delete(contrac);
	}

}
