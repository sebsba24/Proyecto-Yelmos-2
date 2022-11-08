package com.Yelmos.TeamDigitalYelmos.controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Yelmos.TeamDigitalYelmos.facadeIMP.UsuarioDao;
import com.Yelmos.TeamDigitalYelmos.model.Usuario;

@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	
	@GetMapping("/usuarios")
	public String findALL(Model modelo) {
		modelo.addAttribute("usuarios", usuarioDao.findALll());
		return "usuarios";
	}
	
	@GetMapping("/usuarios/crear")
	public String create(Model modelo) {
		Usuario usu = new Usuario();
		modelo.addAttribute("usuario", usu);
		return "crear_usu";
	}
	
	@PostMapping("/usuarios")
	public String saveUser(@ModelAttribute("usuario") Usuario usuario) {
		usuarioDao.saverUser(usuario);
		return "redirect:/usuarios/";
		
	}
	
	@GetMapping("/usuarios/editar/{idUsuario}")
	public String formEdit(@PathVariable Long idUsuario, Model modelo) {
		modelo.addAttribute("usuario", usuarioDao.findById(idUsuario));
		return "edit_user";
	}
	
	@PostMapping("/usuarios/{idUsuario}")
	public String update(@PathVariable Long idUsuario, @ModelAttribute("Usuario") Usuario usuario, Model modelo) {
		Usuario existUser = usuarioDao.findById(idUsuario);
		existUser.setIdUsuario(idUsuario);
		existUser.setNombreU(usuario.getNombreU());
		existUser.setApellidoU(usuario.getApellidoU());
		existUser.setEmailU(usuario.getEmailU());
		existUser.setDocumento(usuario.getDocumento());
		existUser.setEstado(usuario.getEstado());
		existUser.setContrasena(usuario.getContrasena());
		existUser.setRol(usuario.getRol());
		
		usuarioDao.update(existUser);
		return "redirect:/usuarios";
		
	}
	
	@GetMapping("/usuarios/{idUsuario}")
	public String delete (@PathVariable Long idUsuario) {
		usuarioDao.delete(idUsuario);
		return "redirect:/usuarios";
	}
	
	
}
