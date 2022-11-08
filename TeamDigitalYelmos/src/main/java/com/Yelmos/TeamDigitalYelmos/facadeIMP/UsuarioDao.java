package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IUsuarios;
import com.Yelmos.TeamDigitalYelmos.model.Usuario;
import com.Yelmos.TeamDigitalYelmos.repository.UsuarioRepository;

@Service
public class UsuarioDao implements IUsuarios{
	
	@Autowired
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
	public void delete(Long idUsuario) {
		usuarioRepor.deleteById(idUsuario);
		
	}

	@Override
	public void saverUser(Usuario usuario) {
		usuarioRepor.save(usuario);
		
	}

	@Override
	public Usuario findById(Long idUsuario) {
		return usuarioRepor.findById(idUsuario).get();
		
	}

	


}
