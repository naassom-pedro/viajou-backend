package com.viajou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viajou.model.Destinos;
import com.viajou.model.DestinosRepository;

@RestController
@CrossOrigin(origins="*")
public class DestinoController {
	@Autowired
	DestinosRepository destinos;
	@GetMapping("/Destino")
	public List<Destinos> GetDestino() {
		return destinos.findAll();
	}
}
