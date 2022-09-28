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
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class EnderecoController {
	@Autowired
	private Academia academia;

	@PostMapping("CreateEndereco")
	public Endereco createEndereco(@RequestBody Endereco endereco) {

		return academia.saveEndereco(endereco);
	}

	@PutMapping("UpdateEndereco")
	public Endereco updateEndereco(@RequestBody Endereco endereco) {

		return academia.saveEndereco(endereco);
	}

	@DeleteMapping("DeleteEndereco/{id}")
	public void deleteEndereco(@PathVariable Long id) {

		academia.deleteEnderecoById(id);
	}

	@GetMapping("FindEndereco/{id}")
	public Endereco findEnderecoById(@PathVariable Long id) {
		return academia.findEnderecobyId(id);
	}

	@GetMapping("AllEndereco")
	public List<Endereco> listEndereco() {

		return academia.findAllEndereco();
	}

}
