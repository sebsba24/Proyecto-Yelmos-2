package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.facade.IProducto;
import com.Yelmos.TeamDigitalYelmos.model.Producto;
import com.Yelmos.TeamDigitalYelmos.repository.ProductoRepository;

@Service
public class ProductoDao {

	@Autowired
	private ProductoRepository productoRepor;
	

	public List<Producto> findALll() {
		return this.productoRepor.findAll();
	}


	public Producto create(Producto product) {
		return productoRepor.save(product);
		
	}


	public Producto update(Producto product) {
		return productoRepor.save(product);
		
	}


	public void delete(Producto product) {
		productoRepor.delete(product);
		
	}
	
	

}
