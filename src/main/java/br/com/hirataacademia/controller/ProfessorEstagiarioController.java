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
import br.com.hirataacademia.basicas.ProfessorEstagiario;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ProfessorEstagiarioController {
	@Autowired
	private Academia academia;

	@PostMapping("professorEstagiario")
	public ProfessorEstagiario createProfessorEstagiario(@RequestBody ProfessorEstagiario professorEstagiario) {

		return academia.saveProfessorEstagiario(professorEstagiario);
	}

	@PutMapping("professorEstagiario")
	public ProfessorEstagiario updateProfessorEstagiario(@RequestBody ProfessorEstagiario professorEstagiario) {

		return academia.saveProfessorEstagiario(professorEstagiario);
	}

	@DeleteMapping("professorEstagiario/{id}")
	public void deleteProfessorEstagiario(@PathVariable Long id) {

		academia.deleteProfessorEstagiarioById(id);
	}
	@GetMapping("professorEstagiario/{id}")
	public ProfessorEstagiario findProfessorEstagiarioById(@PathVariable Long id) {
		return academia.findProfessorEstagiarioById(id);
	}

	@GetMapping("professorEstagiario")
	public List<ProfessorEstagiario> listProfessorEstagiario() {

		return academia.findAllProfessorEstagiario();
	}

	@PatchMapping("professorEstagiario/{id}")
	public void efetivarEstagiario(Long id) {
		academia.efetivarEstagiario(id);
	}
	
}