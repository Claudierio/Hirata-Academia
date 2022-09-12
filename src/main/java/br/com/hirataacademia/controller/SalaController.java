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

import br.com.hirataacademia.basicas.Sala;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class SalaController {
	@Autowired
	private Academia academia;

	@PostMapping("sala")
	public Sala createSala(@RequestBody Sala sala) {

		return academia.saveSala(sala);
	}

	@PutMapping("sala")
	public Sala updateSala(@RequestBody Sala sala) {

		return academia.saveSala(sala);
	}

	@DeleteMapping("sala/{id}")
	public void deleteSala(@PathVariable Long id) {

		academia.deleteSalaById(id);
	}

	@GetMapping("sala")
	public List<Sala> listSala() {

		return academia.findAllSala();
	}

}