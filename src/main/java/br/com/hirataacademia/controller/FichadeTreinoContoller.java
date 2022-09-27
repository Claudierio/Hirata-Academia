package br.com.hirataacademia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.basicas.FichadeTreino;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class FichadeTreinoContoller {
	@Autowired
	private Academia academia;

	@PostMapping("CreateFichadeTreino")
	public FichadeTreino createFichadeTreino(@RequestBody FichadeTreino fichadeTreino) {

		return academia.saveFichadeTreino(fichadeTreino);
	}

	@PutMapping("UpdateFichadeTreino")
	public void updateFichadeTreino(@RequestBody FichadeTreino fichadeTreino) {

		 academia.UpdateTreino(fichadeTreino);
	}

	@DeleteMapping("DeleteFichadeTreino/{id}")
	public void deleteFichadeTreino(@PathVariable Long id) {

		academia.deleteFichadeTreinoById(id);
	}

	@GetMapping("AllFichadeTreino")
	public List<FichadeTreino> listFichadeTreino() {

		return academia.findAllFichadeTreino();
	}
	@GetMapping("FindFichadeTreino/{id}")
	public FichadeTreino  findFichadeTreinoById(@PathVariable Long id) {
		return academia.findFichadeTreinoById(id);
	}

	
	
}
