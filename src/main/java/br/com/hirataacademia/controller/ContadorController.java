package br.com.hirataacademia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.fachada.Academia;
import br.com.hirataacademia.repositorios.RepositorioContador;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ContadorController {
	@Autowired
	private Academia academia;
	@Autowired
	private RepositorioContador repositorioContador;

	@PostMapping("CreateContador")
	public Contador createContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@PutMapping("UpdateContador")
	public Contador updateContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@DeleteMapping("DeleteContador/{id}")
	public void deleteContador(@PathVariable Long id) {

		academia.deleteContadorById(id);
	}
	@GetMapping("contador/{id}")
	public Contador findContadorById(@PathVariable Long id) {
		return academia.findContadorById(id);
	}

	@GetMapping("AllContador")
	public List<Contador> listContador() {

		return academia.findAllContador();
	}
	
	@PatchMapping("SalarioContador/salario")
	public void atualizarSalarioContador(float novoSalario, Long id) {
		Contador contador = findContadorById(id);
		contador.setSalario(novoSalario);
		academia.saveContador(contador);
		
	}
	
	@GetMapping("contador/lucroAnual")
	public float calculoLucroAnual() {
		
		return academia.calculoLucroAnual();
	}
	

}
