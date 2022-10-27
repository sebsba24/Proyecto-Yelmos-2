package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Proveedor;
import com.Yelmos.TeamDigitalYelmos.facade.IProveedores;
import com.Yelmos.TeamDigitalYelmos.repository.ProveedorRepository;

@Service
public class ProveedorDao{

	
	@Autowired
	private ProveedorRepository proveedorRepor;
	
	public List<Proveedor> findALll() {
		return this.proveedorRepor.findAll();
	}

	public Proveedor create(Proveedor prov) {
		return proveedorRepor.save(prov);
		
	}

	public Proveedor update(Proveedor prov) {
		return proveedorRepor.save(prov);
		
	}

	public void delete(Proveedor prov) {
		proveedorRepor.delete(prov);
		
	}

}
