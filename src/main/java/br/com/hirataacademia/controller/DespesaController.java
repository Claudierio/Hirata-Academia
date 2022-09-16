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

import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class DespesaController {
	@Autowired
	private Academia academia;

	@PostMapping("despesa")
	public Despesa createDespesa(@RequestBody Despesa despesa) {

		return academia.saveDespesa(despesa);
	}

	@PutMapping("despesa")
	public Despesa updateDespesa(@RequestBody Despesa despesa) {

		return academia.saveDespesa(despesa);
	}

	@DeleteMapping("despesa/{id}")
	public void deleteDespesa(@PathVariable Long id) {

		academia.deleteDespesaById(id);
	}

	@GetMapping("despesa")
	public List<Despesa> listDespesa() {

		return academia.findAllDespesa();
	}

}

