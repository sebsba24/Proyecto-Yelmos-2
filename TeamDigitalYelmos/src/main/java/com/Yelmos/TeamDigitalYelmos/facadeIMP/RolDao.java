package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facade.IRol;
import com.Yelmos.TeamDigitalYelmos.repository.RolRepository;


@Service
public class RolDao implements IRol{

	@Autowired
	private RolRepository rolRepor;
	
	@Override
	public List<Rol> findALll() {
		return this.rolRepor.findAll();
	}

	@Override
	public void create(Rol rol) {
		this.rolRepor.save(rol);
		
	}

	@Override
	public void update(Rol rol) {
		this.rolRepor.save(rol);
		
	}

	@Override
	public void delete(Rol rol) {
		Rol ro = this.rolRepor.getById(rol.getRol());
		this.rolRepor.delete(ro);
		
	}

	@Override
	public Rol findById(Long idRol) {
		Rol roo= this.rolRepor.getById(idRol);
		return roo;
	}


}
