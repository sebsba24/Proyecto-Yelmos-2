package com.Yelmos.TeamDigitalYelmos.facade;

import java.util.List;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Usuario;

public interface IUsuarios {
	
	public List<Usuario> findALll();
	public void create(Usuario usuario);
	public void update(Usuario usuario);
	public void delete(Usuario usuario);
	

}
