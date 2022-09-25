package br.com.hirataacademia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class AlunoController {
	@Autowired
	private Academia academia;

	@PostMapping("aluno")
	public Aluno createAluno(@RequestBody Aluno aluno) {

		return academia.saveAluno(aluno);
	}

	@PutMapping("aluno")
	public Aluno updateAluno(@RequestBody Aluno aluno) {

		return academia.saveAluno(aluno);
	}

	@DeleteMapping("aluno/{id}")
	public void deleteAluno(@PathVariable Long id) {

		academia.deleteAlunoById(id);
	}
	
	@GetMapping("aluno/{id}")
	public Aluno findAlunoById(@PathVariable Long id) {
		return academia.findAlunoById(id);
	}

	@GetMapping("aluno")
	public List<Aluno> listAluno() {

		return academia.findAllAluno();
	}

	
}
