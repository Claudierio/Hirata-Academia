package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.cadastro.CadastroProfessor;

public class ProfessorTest {

	
	@Autowired
	private CadastroProfessor cadastroProfessor;
	
	
	@Test
	void professorFakerTest() {

		Faker faker = new Faker();

		Professor professor1 = new Professor1Factory().generate();

		cadastroProfessor.save(professor1);

		Professor professor2 = new Professor2Factory().generate();

		cadastroProfessor.save(professor2);

		Professor professor3 = new Professor3Factory().generate();

		cadastroProfessor.save(professor3);
	}
	
	@Test
	void saveProfessor() {
		for(int x = 0; x < 10; x++) {
			cadastroProfessor.save(Professor1Factory.generate());
			cadastroProfessor.save(Professor2Factory.generate());
			cadastroProfessor.save(Professor3Factory.generate());
		}
	
	
	
}
}
