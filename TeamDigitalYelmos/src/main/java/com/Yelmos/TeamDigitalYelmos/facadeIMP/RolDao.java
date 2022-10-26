package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.repository.RolRepository;


@Service
public class RolDao{

	@Autowired
	private RolRepository rolRepor;
	
	
	public List<Rol> findALll() {
		return this.rolRepor.findAll();
	}
	
	public Rol create (Rol roo) {
		return rolRepor.save(roo);
	}

	public Rol update (Rol roo) {
		return rolRepor.save(roo);
	}
	
	public void delete (Rol roo) {
		rolRepor.delete(roo);
	}




}
