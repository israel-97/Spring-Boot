package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MentalidadesController {

	@GetMapping
	public String hello() {
		return "Estou utilizando as mentalidades de Persistência e Crescimento e a habilidade de Atenção aos Detalhes.";
	}
	
}
