package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivoController {

	@GetMapping
	public String hello() {
		return "Criar uma nova agenda, buscar informações fora da plataforma, dedicar algum tempo extra para melhor aprendizado";
	}

}
