package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Rol;
import com.Yelmos.TeamDigitalYelmos.facade.IRol;
import com.Yelmos.TeamDigitalYelmos.repository.RolRepository;


@Service
public class RolDao{

	@Autowired
	private RolRepository rolRepor;

//	@Override
//	public List<Rol> findALll() {
//		return this.rolRepor.findAll();
//	}
//
//	@Override
//	public void create(Rol rol) {
//		this.rolRepor.save(rol);
//		
//	}
//
//	@Override
//	public void update(Rol rol) {
//		this.rolRepor.save(rol);
//		
//	}
//
//	@Override
//	public void delete(Rol rol) {
//		Rol roo = this.rolRepor.getById(rol.getRol());
//		this.rolRepor.delete(roo);
//		
//	}
//
//	@Override
//	public Rol finById(Long rol) {
//		Rol roo = this.rolRepor.getById(rol);
//		return roo;
//	}
	
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
