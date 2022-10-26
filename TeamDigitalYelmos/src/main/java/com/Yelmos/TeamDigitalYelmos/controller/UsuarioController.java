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

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Usuario;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.UsuarioDao;

@Controller
@RequestMapping(path = "/api/Teamdigitalyelmos/Usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@GetMapping("/all")
	public ResponseEntity<Map<String, Object>> allUsuario(){
		Map<String, Object> respon= new HashMap();
		List<Usuario> listUsuario= this.usuarioDao.findALll();
		respon.put("data",listUsuario);
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Map<String, Object>> createUsuario(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		Usuario usuar = new Usuario();
		usuar.setNomU(request.get("nombreU").toString());
		usuar.setApeU(request.get("apellidoU").toString());
		usuar.setEmaU(request.get("emailU").toString());
		usuar.setDocumento(Long.parseLong(request.get("documento").toString()));
		usuar.setEstado(request.get("estado").toString());
		usuar.setContrasena(request.get("contrasena").toString());
		usuar.setRol(Long.parseLong(request.get("rol").toString()));
		
		
		
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}

}
