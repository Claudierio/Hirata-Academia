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

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Gerente;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")
public class GerenteController {
	@Autowired
	private Academia academia;
	@PostMapping("CreateGerente")
	public Gerente createGerente(@RequestBody Gerente gerente) {

		return academia.saveGerente(gerente);
	}

	@PutMapping("UpdateGerente")
	public Gerente updateGerente(@RequestBody Gerente gerente) {

		return academia.saveGerente(gerente);
	}

	@DeleteMapping("DeleteGerente/{id}")
	public void deleteGerente(@PathVariable Long id) {

		academia.deleteGerenteById(id);
	}
	
	@GetMapping("IDgerente/{id}")
	public Gerente findGerenteById(@PathVariable Long id) {
		return academia.findGerenteById(id);
	}

	@GetMapping("AllGerente")
	public List<Gerente> listGerente() {

		return academia.findAllGerente();
	}
}
