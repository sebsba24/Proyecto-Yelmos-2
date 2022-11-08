package com.Yelmos.TeamDigitalYelmos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Yelmos.TeamDigitalYelmos.facadeIMP.DespachoDao;
import com.Yelmos.TeamDigitalYelmos.model.Despacho;

@Controller
@RequestMapping
public class DespachoController {
	
	@Autowired
	private DespachoDao despachoDao;
	
	@GetMapping("/despachos")
	public String findAll(Model modelo) {
		modelo.addAttribute("despachos", despachoDao.findALll());
		return "despachos";
	}
	
	@GetMapping("/despachos/crear")
	public String create(Model modelo) {
		Despacho desp = new Despacho();
		modelo.addAttribute("despacho", desp);
		return "despacho_crear";
	}
	
	@PostMapping("/despachos")
	public String saveDes(@ModelAttribute("despacho") Despacho despa) {
		despachoDao.saveDes(despa);
		return "redirect:/despachos/";
	}
	
	@GetMapping("/despachos/editar/{idDespa}")
	public String formEdit(@PathVariable Long idDespa, Model modelo) {
		modelo.addAttribute("despacho", despachoDao.findById(idDespa));
		return "edit_desp";
	}
	
	@PostMapping("/despachos/{idDespa}")
	public String update(@PathVariable Long idDespa, @ModelAttribute("Despacho") Despacho despa, Model modelo) {
		Despacho existDespa = despachoDao.findById(idDespa);
		existDespa.setIdDespa(idDespa);
		existDespa.setFechaSalida(despa.getFechaSalida());
		existDespa.setCantidadSalida(despa.getCantidadSalida());
		existDespa.setEstadoDespacho(despa.getEstadoDespacho());
		existDespa.setFk_productoD(despa.getFk_productoD());
		existDespa.setFk_packing(despa.getFk_packing());
		
		despachoDao.update(existDespa);
		return "redirect:/despachos";
		
	}
	
	@GetMapping("/despachos/{idDespa}")
	public String delete(@PathVariable Long idDespa) {
		despachoDao.delete(idDespa);
		return "redirect:/despachos";
	}
	
	
	

}
