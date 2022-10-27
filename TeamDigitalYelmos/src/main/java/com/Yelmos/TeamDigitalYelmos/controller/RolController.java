package com.Yelmos.TeamDigitalYelmos.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/Rol/")
public class RolController {
	@Autowired
	private RolDao rolDao;
	
	@GetMapping
	public List<Rol> findAll(){
		return rolDao.findALll();
	}
	
	@PostMapping
	public Rol create (@RequestBody Rol roo){
		return rolDao.create(roo);
		
	}
	
	@PutMapping
	public Rol update (@RequestBody Rol roo) {
		return rolDao.update(roo);
	}
	
	@DeleteMapping
	public void delete (@RequestBody Rol roo) {
		rolDao.delete(roo);
	}
	
//	@GetMapping
//	public ResponseEntity<Map<String, Object>> allUsuario(){
//		Map<String, Object> respon= new HashMap();
//		List<Rol> listRol= this.rolDao.findALll();
//		respon.put("data",listRol);
//		return new ResponseEntity<>(respon, HttpStatus.OK);
//		
//	}
//	
//	@PostMapping
//	public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> request){
//		System.out.println("@@"+request.toString());
//		Map<String, Object> respon= new HashMap();
//		Rol rooo = new Rol();
//		rooo.setRol(Long.parseLong(request.get("idRol").toString()));
//		rooo.setNombreRol(request.get("nombreRol").toString());
//		return new ResponseEntity<>(respon,HttpStatus.OK);
//		
//	}
//	
//	@PutMapping
//	public ResponseEntity<Map<String, Object>> update(@RequestBody Map<String, Object> request){
//		System.out.println("@@"+request.toString());
//		Map<String, Object> respon= new HashMap();
//		return new ResponseEntity<>(respon, HttpStatus.OK);
//		
//	}
//	
//	@DeleteMapping
//	public void delete(@RequestBody Rol request) {
//		rolDao.delete(request);
//	}

}
