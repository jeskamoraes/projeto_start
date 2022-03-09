package br.com.start;

import java.util.Scanner;

public class Aluno extends Pessoa {
	
	static Scanner entrada = new Scanner(System.in);
	
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
		//CRIANDO A INSTANCIA DA CLASSE USUARIO PARA PODER PASSAR A SENHA
		Usuario usu = new Usuario();
		System.out.println("Digite seu nome");
		setNome(entrada.next());
		System.out.println("Digite sua data de nascimento");
		setDataNascimento(entrada.next());
		System.out.println("Digite seu CPF");
		setCpf(entrada.next());
		System.out.println("Digite seu email");
		setEmail(entrada.next());
		System.out.println("Digite sua senha");
		usu.setSenha(entrada.next());
		System.out.println("Digite seu telefone");
		setTelefone(entrada.next());
		System.out.println("Digite seu estado");
		setEstado(entrada.next());
		System.out.println("Digite sua cidade");
		setCidade(entrada.next());
		System.out.println("Digite sua escola");
		setEscola(entrada.next());
		System.out.println("Digite sua turma");
		setTurma(entrada.next());
		System.out.println();
		System.out.println("Cadastro realizado com sucesso");
		Main.menuPrincipal();
	}
	
	void exibirAluno() {
	}

}
