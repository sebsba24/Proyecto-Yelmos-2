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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Despacho;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.DespachoDao;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Despachos")
public class DespachoController {
	
	@Autowired
	private DespachoDao despachoDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allDespacho(){
		Map<String, Object> respon= new HashMap();
		List<Despacho> listDespacho= this.despachoDao.findALll();
		respon.put("data",listDespacho);
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createDespacho(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}

}
