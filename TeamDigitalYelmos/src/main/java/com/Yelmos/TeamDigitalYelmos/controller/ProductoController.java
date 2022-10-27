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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Producto;
import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.ProductoDao;

@RestController
@RequestMapping(path = "/api/TeamDigitalYelmos/Productos")
public class ProductoController {
	
	@Autowired
	private ProductoDao productoDao;
	
	@GetMapping
	public List <Producto> findAll(){
		return productoDao.findALll();
		
	}
	
//	@PostMapping
//	public Producto create (@RequestBody Producto product) {
//		return productoDao.create(product);
//		
//	}
//	
//	@PostMapping
//	public Producto update (@RequestBody Producto product) {
//		return productoDao.create(product);
//		
//	}
//	
//	@DeleteMapping
//	public void delete(@RequestBody Producto product) {
//		productoDao.delete(product);
//	}

}
