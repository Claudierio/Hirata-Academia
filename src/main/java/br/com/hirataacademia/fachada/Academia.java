package br.com.hirataacademia.fachada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.basicas.FichadeTreino;
import br.com.hirataacademia.basicas.Funcionario;
import br.com.hirataacademia.basicas.Matricula;
import br.com.hirataacademia.basicas.Modalidade;
import br.com.hirataacademia.basicas.Pagamento;
import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.basicas.ProfessorEstagiario;
import br.com.hirataacademia.basicas.Sala;
import br.com.hirataacademia.cadastro.CadastroAluno;
import br.com.hirataacademia.cadastro.CadastroContador;
import br.com.hirataacademia.cadastro.CadastroDespesa;
import br.com.hirataacademia.cadastro.CadastroEndereco;
import br.com.hirataacademia.cadastro.CadastroEquipamento;
import br.com.hirataacademia.cadastro.CadastroFichadeTreino;
import br.com.hirataacademia.cadastro.CadastroMatricula;
import br.com.hirataacademia.cadastro.CadastroModalidade;
import br.com.hirataacademia.cadastro.CadastroPagamento;
import br.com.hirataacademia.cadastro.CadastroPlano;
import br.com.hirataacademia.cadastro.CadastroProfessor;
import br.com.hirataacademia.cadastro.CadastroProfessorEstagiario;
import br.com.hirataacademia.cadastro.CadastroSala;

@Service
public class Academia {
	@Autowired
	private CadastroAluno cadastroAluno;
	@Autowired
	private CadastroContador cadastroContador;
	@Autowired
	private CadastroEndereco cadastroEndereco;
	@Autowired
	private CadastroEquipamento cadastroEquipamento;
	@Autowired
	private CadastroMatricula cadastroMatricula;
	@Autowired
	private CadastroModalidade cadastroModalidade;
	@Autowired
	private CadastroPagamento cadastroPagamento;
	@Autowired
	private CadastroPlano cadastroPlano;
	@Autowired
	private CadastroProfessor cadastroProfessor;
	@Autowired
	private CadastroProfessorEstagiario cadastroProfessorEstagiario;
	@Autowired
	private CadastroSala cadastroSala;
	@Autowired
	private CadastroDespesa cadastroDespesa;
	@Autowired
	private CadastroFichadeTreino cadastroFichadeTreino;

	public Aluno saveAluno(Aluno entity) {
		return cadastroAluno.save(entity);
	}

	public List<Aluno> findAllAluno() {

		return cadastroAluno.findAll();
	}

	public Aluno findAlunoById(Long id) {
		return cadastroAluno.findAlunoById(id);
	}
	
	public void deleteAlunoById(Long id) {
		cadastroAluno.deleteById(id);
	}

	public void deleteAluno(Aluno entity) {
		cadastroAluno.delete(entity);
	}

	public Contador saveContador(Contador entity) {

		return cadastroContador.save(entity);
	}

	public List<Contador> findAllContador() {

		return cadastroContador.findAll();
	}

	public Contador findContadorById(Long id) {

		return cadastroContador.findContadorById(id);
	}

	public void deleteContadorById(Long id) {
		cadastroContador.deleteById(id);
	}

	public void deleteContador(Contador entity) {
		cadastroContador.delete(entity);
	}

	public Endereco saveEndereco(Endereco entity) {

		return cadastroEndereco.save(entity);
	}

	public List<Endereco> findAllEndereco() {

		return cadastroEndereco.findAll();
	}
	public Endereco findEnderecobyId(Long id) {

		return cadastroEndereco.findEnderecoById(id);
	}

	public void deleteEnderecoById(Long id) {
		cadastroEndereco.deleteById(id);
	}

	public void deleteEndereco(Endereco entity) {
		cadastroEndereco.delete(entity);
	}

	public Equipamento saveEquipamento(Equipamento entity) {

		return cadastroEquipamento.save(entity);
	}

	public List<Equipamento> findAllEquipamento() {

		return cadastroEquipamento.findAll();
	}

	public Equipamento findEquipamentoById(Long id) {

		return cadastroEquipamento.findEquipamentoById(id);
	}
	public void deleteEquipamentoById(Long id) {
		cadastroEquipamento.deleteById(id);
	}

	public void deleteEquipamento(Equipamento entity) {
		cadastroEquipamento.delete(entity);
	}

	public Matricula saveMatricula(Matricula entity) {

		return cadastroMatricula.save(entity);
	}

	public List<Matricula> findAllMatricula() {

		return cadastroMatricula.findAll();
	}

	public Matricula findMatriculaById(Long id) {

		return cadastroMatricula.findMatriculaById(id);
	}
	public void deleteMatriculaById(Long id) {
		cadastroMatricula.deleteById(id);
	}

	public void deleteMatricula(Matricula entity) {
		cadastroMatricula.delete(entity);
	}

	public Modalidade saveModalidade(Modalidade entity) {

		return cadastroModalidade.save(entity);
	}

	public List<Modalidade> findAllModalidade() {

		return cadastroModalidade.findAll();
	}
	public Modalidade findModalidadeById(Long id) {

		return cadastroModalidade.findModalidadeById(id);
	}
	public void deleteModalidadeById(Long id) {
		cadastroModalidade.deleteById(id);
	}

	public void deleteModalidade(Modalidade entity) {
		cadastroModalidade.delete(entity);
	}

	public Pagamento savePagamento(Pagamento entity) {

		return cadastroPagamento.save(entity);
	}

	public List<Pagamento> findAllPagamento() {

		return cadastroPagamento.findAll();
	}
	public Pagamento findPagamentoById(Long id) {

		return cadastroPagamento.findPagamentoById(id);
	}
	public void deletePagamentoById(Long id) {
		cadastroPagamento.deleteById(id);
	}

	public void deletePagamento(Pagamento entity) {
		cadastroPagamento.delete(entity);
	}

	public Plano savePlano(Plano entity) {

		return cadastroPlano.save(entity);
	}

	public List<Plano> findAllPlano() {

		return cadastroPlano.findAll();
	}
	public Plano findPlanoById(Long id) {

		return cadastroPlano.findPlanoById(id);
	}
	public void deletePlanoById(Long id) {
		cadastroPlano.deleteById(id);
	}

	public void deletePlano(Plano entity) {
		cadastroPlano.delete(entity);
	}

	public Professor saveProfessor(Professor entity) {

		return cadastroProfessor.save(entity);
	}

	public List<Professor> findAllProfessor() {

		return cadastroProfessor.findAll();
	}

	public void deleteProfessorById(Long id) {
		cadastroProfessor.deleteById(id);
	}

	public void deleteProfessor(Professor entity) {
		cadastroProfessor.delete(entity);
	}
	public Professor findProfessorById(Long id) {
		return cadastroProfessor.findProfessorById(id);
	}

	public ProfessorEstagiario saveProfessorEstagiario(ProfessorEstagiario entity) {

		return cadastroProfessorEstagiario.save(entity);
	}

	public List<ProfessorEstagiario> findAllProfessorEstagiario() {

		return cadastroProfessorEstagiario.findAll();
	}

	public void deleteProfessorEstagiarioById(Long id) {
		cadastroProfessorEstagiario.deleteById(id);
	}

	public void deleteProfessorEstagiario(ProfessorEstagiario entity) {
		cadastroProfessorEstagiario.delete(entity);
	}
	
	public ProfessorEstagiario findProfessorEstagiarioById(Long id) {
		
		return cadastroProfessorEstagiario.findProfessorEstagiarioById(id);
	}

	public Sala saveSala(Sala entity) {

		return cadastroSala.save(entity);
	}

	public List<Sala> findAllSala() {

		return cadastroSala.findAll();
	}

	public Sala findSalaById(Long id) {

		return cadastroSala.findSalaById(id);
	}
	public void deleteSalaById(Long id) {
		cadastroSala.deleteById(id);
	}

	public void deleteSala(Sala entity) {
		cadastroSala.delete(entity);
	}

	public Despesa saveDespesa(Despesa entity) {

		return cadastroDespesa.save(entity);
	}

	public List<Despesa> findAllDespesa() {

		return cadastroDespesa.findAll();
	}

	public Despesa findDespesaById(Long id) {
		
		return cadastroDespesa.findDespesaById(id);
	}
	
	public void deleteDespesaById(Long id) {
		cadastroDespesa.deleteById(id);
	}

	public void deleteDespesa(Sala entity) {
		cadastroSala.delete(entity);
	}

	public FichadeTreino saveFichadeTreino(FichadeTreino entity) {

		return cadastroFichadeTreino.save(entity);
	}

	public List<FichadeTreino> findAllFichadeTreino() {

		return cadastroFichadeTreino.findAll();
		
	}
	public void UpdateTreino(FichadeTreino entity) {
		cadastroFichadeTreino.editarTreino(entity);
	}
	public FichadeTreino findFichadeTreinoById(Long id) {

		return cadastroFichadeTreino.findFichadeTreinoById(id);
	}

	public void deleteFichadeTreinoById(Long id) {
		cadastroFichadeTreino.deleteById(id);
	}

	public void deleteFichadeTreino(FichadeTreino entity) {
		cadastroFichadeTreino.delete(entity);
	}

	public float calculoLucroAnual() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		float lucro = 0;
		try {
			List<Despesa> despesas = cadastroDespesa.listarDespesaPorIntervalo(
					sdf.parse(LocalDate.now().getYear() + "-01-01"), sdf.parse(LocalDate.now().getYear() + "-12-31"));
			List<Pagamento> pagamentos = cadastroPagamento.listarPagamentoPorIntervalo(
					sdf.parse(LocalDate.now().getYear() + "-01-01"), sdf.parse(LocalDate.now().getYear() + "-12-31"));

			lucro = (float) (-despesas.stream().mapToDouble(x -> x.getValor()).sum()
					+ pagamentos.stream().mapToDouble(x -> x.getMatricula().getPlano().getPreco()).sum());

		} catch (ParseException e) {
			System.out.println("Erro ao formatar data");
		}

		return lucro;
	}

	public void efetivarEstagiario(Long id) {
		ProfessorEstagiario estagiario = findProfessorEstagiarioById(id);
		Professor professor = new Professor(estagiario.getNome(), estagiario.getDataDeNascimento(), estagiario.getCpf(), estagiario.getEndereco(), estagiario.getId());
		cadastroProfessor.save(professor);
		cadastroProfessorEstagiario.deleteById(id);
	}

	public void atualizarSalarioContador(float novoSalario, Long id) throws Exception {
		Contador contador = findContadorById(id);
		
		contador.setSalario(novoSalario);
		cadastroContador.save(contador);

	}
	


	public void atualizarSalarioProfessor(float novoSalario, Long id) throws Exception {
		Professor professor = findProfessorById(id);

		professor.setSalario(novoSalario);
		cadastroProfessor.save(professor);

	}
	

}
