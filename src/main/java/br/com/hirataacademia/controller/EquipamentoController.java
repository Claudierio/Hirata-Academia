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
import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class EquipamentoController {
	@Autowired
	private Academia academia;

	@PostMapping("equipamento")
	public Equipamento createEquipamento(@RequestBody Equipamento equipamento) {

		return academia.saveEquipamento(equipamento);
	}

	@PutMapping("equipamento")
	public Equipamento updateEquipamento(@RequestBody Equipamento equipamento) {

		return academia.saveEquipamento(equipamento);
	}

	@DeleteMapping("equipamento/{id}")
	public void deleteEquipamento(@PathVariable Long id) {

		academia.deleteEquipamentoById(id);
	}
	@GetMapping("equipamento/{id}")
	public Equipamento findEquipamentoById(@PathVariable Long id) {
		return academia.findEquipamentoById(id);
	}

	@GetMapping("equipamento")
	public List<Equipamento> listEquipamento() {

		return academia.findAllEquipamento();
	}

}

