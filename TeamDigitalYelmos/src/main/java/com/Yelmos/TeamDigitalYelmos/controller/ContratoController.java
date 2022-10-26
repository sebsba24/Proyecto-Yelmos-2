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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Contrato;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.ContratoDao;

@Controller
@RequestMapping(path = "/api/TeamDigitalYelmos/Contratos")
public class ContratoController {
	
	@Autowired
	private ContratoDao contratoDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allContrato(){
		Map<String, Object> respon= new HashMap();
		List<Contrato> listContrato= this.contratoDao.findALll();
		respon.put("data",listContrato);
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createContrato(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}

}
