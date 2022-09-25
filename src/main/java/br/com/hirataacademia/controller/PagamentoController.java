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
import br.com.hirataacademia.basicas.Pagamento;
import br.com.hirataacademia.fachada.Academia;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class PagamentoController {
	@Autowired
	private Academia academia;

	@PostMapping("pagamento")
	public Pagamento createPagamento(@RequestBody Pagamento pagamento) {

		return academia.savePagamento(pagamento);
	}

	@PutMapping("pagamento")
	public Pagamento updatePagamento(@RequestBody Pagamento pagamento) {

		return academia.savePagamento(pagamento);
	}

	@DeleteMapping("pagamento/{id}")
	public void deletePagamento(@PathVariable Long id) {

		academia.deletePagamentoById(id);
	}
	@GetMapping("pagamento/{id}")
	public Pagamento findPagamentoById(@PathVariable Long id) {
		return academia.findPagamentoById(id);
	}

	@GetMapping("pagamento")
	public List<Pagamento> listPagamento() {

		return academia.findAllPagamento();
	}

}
