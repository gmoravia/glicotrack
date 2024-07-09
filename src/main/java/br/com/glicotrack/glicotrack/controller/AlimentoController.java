package br.com.glicotrack.glicotrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.glicotrack.glicotrack.AlimentoRepository;
import br.com.glicotrack.glicotrack.entity.Alimento;

@RestController("alimento")
public class AlimentoController {
	
	@Autowired
	AlimentoRepository alimentoRepository;
	
	@GetMapping("count")
	public String getCountAlimento() {
		long numberAlimentos = alimentoRepository.count();
		return "Numero de alimentos = "+numberAlimentos;
	}
	
	@GetMapping("add")
	public String addAlimento(){
		Alimento alimento = new Alimento();
		//alimento.setId(2L);
		alimento.setGrupo(1);
		alimento.setDescricao("banana");
		alimento.setMedida("1 unidade");
		alimento.setPeso(100);
		alimento.setKcal(100);
		alimento.setCho(10);
		alimentoRepository.save(alimento);
		return "User added successfully";
	}
	
	@GetMapping("list")
	public String listAlimentoUser(){
		List<Alimento> lstAlimento = alimentoRepository.findAll();
		String aux = "";
		for (Alimento alimento : lstAlimento) {
			aux += alimento.getDescricao() + " - " + alimento.getCho() + "</br>";
		}
		return aux;
	}

}
