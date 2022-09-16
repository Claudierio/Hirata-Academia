package br.com.hirataacademia.cadastro;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Pagamento;
import br.com.hirataacademia.repositorios.RepositorioPagamento;
@Service
public class CadastroPagamento {
	@Autowired
	private RepositorioPagamento repositorioPagamento;
	public Pagamento save(Pagamento entity) {
		
		return repositorioPagamento.save(entity);
	}
	
	public List<Pagamento> findAll(){
		
		return repositorioPagamento.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioPagamento.deleteById(id);
	}

	public void delete(Pagamento entity) {
		repositorioPagamento.delete(entity);
	}
	
	public List<Pagamento> listarPagamentoPorIntervalo(Date inicio, Date fim){
		
		return repositorioPagamento.listarPagamentoPorIntervalo(inicio, fim);
	}
}
