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

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ContadorController {
	@Autowired
	private Academia academia;

	@PostMapping("contador")
	public Contador createContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@PutMapping("contador")
	public Contador updateContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@DeleteMapping("contador/{id}")
	public void deleteContador(@PathVariable Long id) {

		academia.deleteContadorById(id);
	}

	@GetMapping("contador")
	public List<Contador> listContador() {

		return academia.findAllContador();
	}

}
