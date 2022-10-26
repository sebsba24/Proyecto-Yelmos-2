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
import com.Yelmos.TeamDigitalYelmos.Yelmos2.Usuario;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.RolDao;
import com.Yelmos.TeamDigitalYelmos.facadeIMP.UsuarioDao;
import com.Yelmos.TeamDigitalYelmos.repository.UsuarioRepository;

@Controller
@RequestMapping(path = "/api/teamDigitalYelmos/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	private RolDao rolDao;
	
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
		usuar.setApeU(request.get("apellidoU").toString());
		usuar.setContrasena(request.get("contrasena").toString());
		usuar.setDocumento(Long.parseLong(request.get("documento").toString()));
		usuar.setEmaU(request.get("emailU").toString());
		usuar.setEstado(request.get("estado").toString());
		usuar.setNomU(request.get("nombreU").toString());
//		Rol roo= this.rolDao.findById(Long.parseLong(request.get("idRol").toString()));
//		usuar.setRol(roo); 
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Map<String, Object>> update(@RequestBody Map<String, Object> request){
		System.out.println("@@"+request.toString());
		Map<String, Object> respon= new HashMap();
		return new ResponseEntity<>(respon, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Usuario request) {
		usuarioDao.delete(request);
	}
	
	
}
