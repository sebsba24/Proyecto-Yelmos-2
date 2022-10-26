package com.Yelmos.TeamDigitalYelmos.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.RolDao;

@RestController
@RequestMapping(path = "/api/teamdigitalyelmos/Rol")
public class RolController {
	@Autowired
	private RolDao rolDao;
	
	@GetMapping
	public List <Rol> findAll(){
		return rolDao.findALll();
		
	}
	
	@PostMapping
	public Rol create (@RequestBody Rol rol) {
		return rolDao.create(rol);
		
	}
	
	@PutMapping
	public Rol update (@RequestBody Rol rol) {
		return rolDao.update(rol);
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Rol request) {
		rolDao.delete(request);
	}

}
