package com.ectechsoftware.erp.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping(value="/clientes")
public class clientesController {


	
	@RequestMapping(value="/homeclientes", method=RequestMethod.GET)
	public String iniciarCliente (Model model) {
		return "/clientes/homeclientes";
	}
	@RequestMapping(value="/buscaclientes", method=RequestMethod.GET)
	public String buscarrCliente (Model model) {
		return "/clientes/buscaclientes";
	}
	@RequestMapping(value="/creacliente", method=RequestMethod.GET)
	public String crearCliente (Model model) {
		return "/clientes/formcliente";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardarCliente() {
		return "categorias/homeclientes";
	}
}
