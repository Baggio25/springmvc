package com.algaworks.brewer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.brewer.model.Cidade;
import com.algaworks.brewer.repository.Cidades;

@Controller
@RequestMapping("/cidades")
public class CidadesController {
	
	@Autowired
	private Cidades cidades;
	
	@RequestMapping("/nova")
	public String novo() {
		return "cidade/CadastroCidade";
	}
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Cidade> pesquisarPorCodigo(
			@RequestParam(name = "estado", defaultValue = "-1") Long codigoEstado) {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return cidades.findByEstadoCodigo(codigoEstado);
	}

	
}
 