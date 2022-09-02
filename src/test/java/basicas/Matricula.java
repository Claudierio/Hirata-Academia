package basicas;

public class Matricula {	
	private long id;
	private Plano plano;
	private Aluno aluno;
	private boolean ativo;
	private Modalidade modalidade;
	
	public Matricula(long id, Plano plano, Aluno aluno, Modalidade modalidade) {
		super();
		this.id = id;
		this.plano = plano;
		this.aluno = aluno;
		this.ativo = true;
		this.modalidade = modalidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
