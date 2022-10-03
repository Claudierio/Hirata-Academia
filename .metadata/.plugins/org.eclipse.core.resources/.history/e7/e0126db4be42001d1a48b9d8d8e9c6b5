package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.cadastro.CadastroProfessor;

@SpringBootTest
public class ProfessorTest {

	
	@Autowired
	private CadastroProfessor cadastroProfessor;

	
	@Test
	void saveProfessor() {
		for(int x = 0; x < 5; x++) {
			cadastroProfessor.save(Professor1Factory.generate());
			cadastroProfessor.save(Professor2Factory.generate());
			cadastroProfessor.save(Professor3Factory.generate());
		}
	
	
	
}
}
