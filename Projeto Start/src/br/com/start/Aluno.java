package br.com.start;

public class Aluno extends Pessoa {

	private String turma;
	private String escola;

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	void validarCpf() {

	}

	void cadastarAluno() {
		System.out.println("Aluno cadastrado com sucesso!");
		// System.out.println(getNome()); -->Exibindo dados para teste
		// System.out.println(cidade); -->Exibindo dados para teste
	}

	void exibirAluno() {
	}

}
