package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Proveedor;
import com.Yelmos.TeamDigitalYelmos.facade.IProveedores;
import com.Yelmos.TeamDigitalYelmos.repository.ProveedorRepository;

@Service
public class ProveedorDao implements IProveedores{

	
	@Autowired
	private ProveedorRepository proveedorRepor;
	
	@Override
	public List<Proveedor> findALll() {
		return this.proveedorRepor.findAll();
	}

	@Override
	public void create(Proveedor prov) {
		this.proveedorRepor.save(prov);
		
	}

	@Override
	public void update(Proveedor prov) {
		this.proveedorRepor.save(prov);
		
	}

	@Override
	public void delete(Proveedor prov) {
		Proveedor provee = this.proveedorRepor.getById(prov.getIdProv());
		this.proveedorRepor.delete(provee);
		
	}

}
