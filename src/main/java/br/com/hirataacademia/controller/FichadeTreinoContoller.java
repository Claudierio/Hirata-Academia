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

import br.com.hirataacademia.basicas.FichadeTreino;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class FichadeTreinoContoller {
	@Autowired
	private Academia academia;

	@PostMapping("fichadeTreino")
	public FichadeTreino createFichadeTreino(@RequestBody FichadeTreino fichadeTreino) {

		return academia.saveFichadeTreino(fichadeTreino);
	}

	@PutMapping("fichadeTreino")
	public FichadeTreino updateFichadeTreino(@RequestBody FichadeTreino fichadeTreino) {

		return academia.saveFichadeTreino(fichadeTreino);
	}

	@DeleteMapping("fichadeTreino/{id}")
	public void deleteFichadeTreino(@PathVariable Long id) {

		academia.deleteFichadeTreinoById(id);
	}

	@GetMapping("fichadeTreino")
	public List<FichadeTreino> listFichadeTreino() {

		return academia.findAllFichadeTreino();
	}

}
