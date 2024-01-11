package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class helloWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Responsabilidade Pessoal: "
				+ "\n Mentalidade de Crescimento, "
                + "\n Orientação ao futuro, "
                + "\n Comunicação, "
                + "\n Atenção aos detalhes, "
                + "\n Proatividade, " 
                + "\n Trabalho em equipe,  "                + "\n Persistência,";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos para a semana: "
				+ "\n Comunicação, "
                + "\n Participar mais das aulas, "
               + "\n Trabalho em equipe,";
	}
	
	

}
