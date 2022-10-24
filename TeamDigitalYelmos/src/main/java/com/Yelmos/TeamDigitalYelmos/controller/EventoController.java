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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Evento;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.EventoDao;

@Controller
@RequestMapping(path = "/api/Teamdigitalyelmos/Eventos" )
public class EventoController {
	
	@Autowired
	private EventoDao eventoDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allEvento(){
		Map<String, Object> respon= new HashMap();
		List<Evento> listEvento= this.eventoDao.findALll();
		respon.put("data",listEvento);
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createEvento(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}

}
