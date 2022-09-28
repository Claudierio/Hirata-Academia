package br.com.hirataacademia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.hirataacademia.basicas.Aluno;

@SpringBootTest
class HirataAcademiaApplicationTests {

	@Test
	void createAlunoTest() {
		Aluno aluno = new Aluno("filipe", new Date(), "78546325941", null, 56.2f, 1.54f, 25.0, "9878695635"  );
		assertEquals(aluno.getImc(),23.697,0.001);
	}
	
	//@Test
	//void

}
