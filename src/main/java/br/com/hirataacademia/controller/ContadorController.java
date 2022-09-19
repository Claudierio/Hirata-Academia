package br.com.hirataacademia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.fachada.Academia;
import br.com.hirataacademia.repositorios.RepositorioContador;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/HirataAcademia/api/v1/")

public class ContadorController {
	@Autowired
	private Academia academia;
	@Autowired
	private RepositorioContador repositorioContador;

	@PostMapping("contador")
	public Contador createContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@PutMapping("contador")
	public Contador updateContador(@RequestBody Contador contador) {

		return academia.saveContador(contador);
	}

	@DeleteMapping("contador/{id}")
	public void deleteContador(@PathVariable Long id) {

		academia.deleteContadorById(id);
	}

	@GetMapping("contador")
	public List<Contador> listContador() {

		return academia.findAllContador();
	}
	/*
	
	public ResponseEntity partialUpdateName(
		    @RequestBody Contador partialUpdate, 
		    @PathVariable("id") Long id) 
		{
		    Optional<Contador> optionalStudent = repositorioContador.findById(id);

		    if(optionalStudent.isPresent() && partialUpdate!=null) {
		        Contador current=optionalStudent.get();
		        current.setSalario(partialUpdate.getSalario());
		        return ResponseEntity.ok(repositorioContador.save(current));     
		     }
			return null;  
		              
		      //return an error 
		}
		*/

}
