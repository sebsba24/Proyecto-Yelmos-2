package com.Yelmos.TeamDigitalYelmos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Proveedor;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.ProveedorDao;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Proveedores")
public class ProveedorController {
	
	@Autowired
	private ProveedorDao proveedorDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allProveedor(){
		Map<String, Object> respon= new HashMap();
		List<Proveedor> listProveedor= this.proveedorDao.findALll();
		respon.put("data",listProveedor);
		return new ResponseEntity<>(respon, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createProveedor(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}

}
