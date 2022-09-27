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

import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ProfessorController {
	@Autowired
	private Academia academia;

	@PostMapping("CreateProfessor")
	public Professor createProfessor(@RequestBody Professor professor) {

		return academia.saveProfessor(professor);
	}

	@PutMapping("UpdateProfessor")
	public Professor updateProfessor(@RequestBody Professor professor) {

		return academia.saveProfessor(professor);
	}

	@DeleteMapping("DeleteProfessor/{id}")
	public void deleteProfessor(@PathVariable Long id) {

		academia.deleteProfessorById(id);
	}
	@GetMapping("FindProfessor/{id}")
	public Professor findProfessorById(@PathVariable Long id) {
		return academia.findProfessorById(id);
	}

	@GetMapping("AllProfessor")
	public List<Professor> listProfessor() {

		return academia.findAllProfessor();
	}
	
	@PatchMapping("professor/salario")
	public void atualizarSalarioProfessor(float novoSalario, Long id) {
		Professor professor = findProfessorById(id);
		professor.setSalario(novoSalario);
		academia.saveProfessor(professor);
		
	}
	

}