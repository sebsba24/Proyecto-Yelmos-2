package com.Yelmos.TeamDigitalYelmos.facadeIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yelmos.TeamDigitalYelmos.Yelmos2.Producto;
import com.Yelmos.TeamDigitalYelmos.facade.IProducto;
import com.Yelmos.TeamDigitalYelmos.repository.ProductoRepository;

@Service
public class ProductoDao implements IProducto{

	@Autowired
	private ProductoRepository productoRepor;
	
	@Override
	public List<Producto> findALll() {
		return this.productoRepor.findAll();
	}

	@Override
	public void create(Producto product) {
		this.productoRepor.save(product);
		
	}

	@Override
	public void update(Producto product) {
		this.productoRepor.save(product);
		
	}

	@Override
	public void delete(Producto product) {
		Producto produ = this.productoRepor.getById(product.getIdProduc());
		this.productoRepor.delete(produ);
		
	}
	
	

}
