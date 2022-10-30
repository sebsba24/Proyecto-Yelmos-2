package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.model.Usuario;

public interface IUsuarios {
	
	public List<Usuario> findALll();
	public void create (Usuario usuario);
	public void saverUser (Usuario usuario);
	public Usuario findById (Long idUsuario);
	public void update(Usuario usuario);
	public void delete(Long idUsuario);
	

}
