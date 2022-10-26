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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.RolDao;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Rol")
public class RolController {
	@Autowired
	private RolDao rolDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allRol(){
		Map<String, Object> respon= new HashMap();
		List<Rol> listRol= this.rolDao.findALll();
		respon.put("data",listRol);
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createRol(@RequestBody Map<String, Object> request){
//		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		Rol r = new Rol();
		r.setNombreRol(request.get("nombreRol").toString());		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Map<String, Object>> updateRol(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Rol request) {
		rolDao.delete(request);
	}

}
