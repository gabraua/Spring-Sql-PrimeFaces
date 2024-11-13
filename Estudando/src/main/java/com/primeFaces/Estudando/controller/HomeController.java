package com.primeFaces.Estudando.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.primeFaces.Estudando.modelo.Aluno;
import com.primeFaces.Estudando.modelo.CadastroAluno;


@Controller
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping
	public String exibir() {
		
		return "home";
	}
	
	@PostMapping
	public String cadastrarAluno(CadastroAluno dados) {
		var aluno = Aluno.builder();
		System.out.println(dados);
		return"home";
	}
}
