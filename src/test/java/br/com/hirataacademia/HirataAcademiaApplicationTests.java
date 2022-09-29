package br.com.hirataacademia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.hirataacademia.basicas.Aluno;

@SpringBootTest
class HirataAcademiaApplicationTests {
	
	
	
	@Test
	void calcularImcTest() {
		Aluno aluno = new Aluno("filipe", new Date(), "78546325941", null, 56.2f, 1.54f, 25.0, "9878695635"  );
		assertEquals(aluno.getImc(),23.697,0.001);
	}
	
	/*@Test
	void efetivarEstagiarioSalarioTest() {
		Academia academia = new Academia();
		ProfessorEstagiario filipe = new ProfessorEstagiario("filipe", new Date(), "09924872428", null, 600.00, "6514631", new Date(), new Date(), "noite");
		academia.efetivarEstagiario(filipe.getId());
		assertEquals(filipe.getSalario(), );
	}
	
	
*/
	/*@Test
	void atualizarSalarioProfessorTest() throws Exception {
		CadastroProfessor cadastroProfessor = new CadastroProfessor();
		Academia academia = new Academia();
		Endereco endereco = new Endereco("545665", "445", "djawdnbawkl", "dajwdawld", "dajhwdawhd", "dawkjbdawd");
		Professor professor = new Professor("filipe", new Date(), "09924872428", endereco, 56.00, "noite", "5634563463", 854 );
		academia.atualizarSalarioProfessor(100.00f, professor.getId());
		assertEquals(professor.getSalario(), 100.00f);
	}
	*/
}
