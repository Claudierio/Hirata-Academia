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
import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class PlanoController {
	@Autowired
	private Academia academia;

	@PostMapping("plano")
	public Plano createPlano(@RequestBody Plano plano) {

		return academia.savePlano(plano);
	}

	@PutMapping("plano")
	public Plano updatePlano(@RequestBody Plano plano) {

		return academia.savePlano(plano);
	}

	@DeleteMapping("plano/{id}")
	public void deletePlano(@PathVariable Long id) {

		academia.deletePlanoById(id);
	}
	@GetMapping("plano/{id}")
	public Plano findPlanoById(@PathVariable Long id) {
		return academia.findPlanoById(id);
	}

	@GetMapping("plano")
	public List<Plano> listPlano() {

		return academia.findAllPlano();
	}

}
