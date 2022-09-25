package br.com.hirataacademia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.basicas.Matricula;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class MatriculaController {
	@Autowired
	private Academia academia;

	@PostMapping("matricula")
	public Matricula createMatricula(@RequestBody Matricula matricula) {

		return academia.saveMatricula(matricula);
	}

	@PutMapping("matricula")
	public Matricula updateMatricula(@RequestBody Matricula matricula) {

		return academia.saveMatricula(matricula);
	}

	@DeleteMapping("matricula/{id}")
	public void deleteMatricula(@PathVariable Long id) {

		academia.deleteMatriculaById(id);
	}
	@GetMapping("matricula/{id}")
	public Matricula findMatriculaById(@PathVariable Long id) {
		return academia.findMatriculaById(id);
	}

	@GetMapping("matricula")
	public List<Matricula> listMatricula() {

		return academia.findAllMatricula();
	}

}
