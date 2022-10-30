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

import com.Yelmos.TeamDigitalYelmos.facadeIMP.ProveedorDao;
import com.Yelmos.TeamDigitalYelmos.model.Proveedor;
import com.Yelmos.TeamDigitalYelmos.model.Rol;

@RestController
@RequestMapping(path = "/api/TeamDigitalYelmos/Proveedores")
public class ProveedorController {
	
	@Autowired
	private ProveedorDao proveedorDao;
	
	@GetMapping
	public List <Proveedor> findAll(){
		return proveedorDao.findALll();
	}
	
	@PostMapping
	public Proveedor create (@RequestBody Proveedor prov) {
		return proveedorDao.create(prov);
		
	}

	@PutMapping
	public Proveedor update (@RequestBody Proveedor prov) {
		return proveedorDao.update(prov);
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody Proveedor prov) {
		proveedorDao.delete(prov);
	}
}
