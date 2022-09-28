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
import br.com.hirataacademia.basicas.Modalidade;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ModalidadeController {
	@Autowired
	private Academia academia;

	@PostMapping("CreateModalidade")
	public Modalidade createModalidade(@RequestBody Modalidade modalidade) {

		return academia.saveModalidade(modalidade);
	}

	@PutMapping("UpdateModalidade")
	public Modalidade updateModalidade(@RequestBody Modalidade modalidade) {

		return academia.saveModalidade(modalidade);
	}

	@DeleteMapping("DeleteModalidade/{id}")
	public void deleteModalidade(@PathVariable Long id) {

		academia.deleteModalidadeById(id);
	}

	@GetMapping("FindModalidade/{id}")
	public Modalidade findModalidadeById(@PathVariable Long id) {
		return academia.findModalidadeById(id);
	}

	@GetMapping("AllModalidade")
	public List<Modalidade> listModalidade() {

		return academia.findAllModalidade();
	}

}