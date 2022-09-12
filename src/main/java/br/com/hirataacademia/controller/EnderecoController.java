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

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class EnderecoController {
	@Autowired
	private Academia academia;

	@PostMapping("endereco")
	public Endereco createEndereco(@RequestBody Endereco endereco) {

		return academia.saveEndereco(endereco);
	}

	@PutMapping("endereco")
	public Endereco updateEndereco(@RequestBody Endereco endereco) {

		return academia.saveEndereco(endereco);
	}

	@DeleteMapping("endereco/{id}")
	public void deleteEndereco(@PathVariable Long id) {

		academia.deleteEnderecoById(id);
	}

	@GetMapping("endereco")
	public List<Endereco> listEndereco() {

		return academia.findAllEndereco();
	}

}
