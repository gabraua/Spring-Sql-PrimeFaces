package com.primeFaces.Estudando.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeFaces.Estudando.modelo.Aluno;
import com.primeFaces.Estudando.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	@GetMapping
	public List<Aluno> listar(){
		return alunoRepository.findAll();
		}
	
	@PostMapping
	public void incluir(@RequestBody Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	@PutMapping
	public void alterar(@RequestBody Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	@DeleteMapping("/{matricula}")
	public void deletar(@PathVariable long matricula) {
		alunoRepository.deleteById(matricula);
	}
	
	@GetMapping("/{matricula}")
	public Optional<Aluno> ler(@PathVariable long matricula) {
		return alunoRepository.findById(matricula);
	}
}
