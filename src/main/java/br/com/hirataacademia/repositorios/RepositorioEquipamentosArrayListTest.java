package br.com.hirataacademia.repositorios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import basicas.Equipamento;

class RepositorioEquipamentosArrayListTest {

	private static final Date Date = null;

	
	
	
	@Test
	
	void testAdicionarEquipamento() {
		Equipamento equipamento = new Equipamento(false, Date,5341354, "halter" );
		RepositorioEquipamentosArrayList eq1 = new RepositorioEquipamentosArrayList();
		
		eq1.adicionarEquipamento(equipamento);
		
		assertEquals(eq1.listarEquipamentos().contains(equipamento), true);
		
		
	}
	
	@Test
	
	void testProcurarEquipamento() {
		
		Equipamento equipamento = new Equipamento(false, Date,5341354, "halter" );
		RepositorioEquipamentosArrayList eq1 = new RepositorioEquipamentosArrayList();
		
		eq1.adicionarEquipamento(equipamento);
		
		assertEquals(eq1.procurarEquipamento(equipamento.getNumeroRegistro()), equipamento);
	}	

}
