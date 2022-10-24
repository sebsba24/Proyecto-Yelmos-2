package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Usuario;
import com.Yelmos.TeamDigitalYelmos.facade.IUsuarios;
import com.Yelmos.TeamDigitalYelmos.repository.UsuarioRepository;

@Service
public class UsuarioDao implements IUsuarios{
	
	@Autowired
//	class interface    variable
	private UsuarioRepository usuarioRepor;

	@Override
	public List<Usuario> findALll() {
		return this.usuarioRepor.findAll();
		
	}

	@Override
	public void create(Usuario usuario) {
		this.usuarioRepor.save(usuario);
		
	}

	@Override
	public void update(Usuario usuario) {
		this.usuarioRepor.save(usuario);
		
	}

	@Override
	public void delete(Usuario usuario) {
		Usuario usua = this.usuarioRepor.getById(usuario.getIdU());
		this.usuarioRepor.delete(usua);
	}

}
