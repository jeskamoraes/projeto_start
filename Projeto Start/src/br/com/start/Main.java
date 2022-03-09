package br.com.start;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Estanciando Classe Cliente
		Aluno alu = new Aluno();
		Usuario usu = new Usuario();

		System.out.println("=====================================");
		System.out.println("=              START                =");
		System.out.println("=     A melhor viagem de formatura  =");
		System.out.println("=====================================");

		System.out.println();
		System.out.println("Possui cadastro?");
		System.out.println("1-Sim");
		System.out.println("2-Nao");
		Scanner entrada = new Scanner(System.in);
		int cadastro = entrada.nextInt();

		switch (cadastro) {
		case 1:
			System.out.println("Digite seu usuario");
			usu.setLogin(entrada.next());;
			System.out.println("Digite sua senha");
			usu.setSenha(entrada.next());;
			usu.verificarLogin();
			
			break;
		case 2:
			System.out.println();
			System.out.println("Digite seu nome");
			alu.setNome(entrada.next());
			System.out.println("Digite seu email");
			alu.setEmail(entrada.next());
			System.out.println("Digite seu telefone");
			alu.setTelefone(entrada.next());
			System.out.println("Digite seu estado");
			alu.setEstado(entrada.next());
			System.out.println("Digite sua cidade");
			alu.setCidade(entrada.next());
			System.out.println("qual o seu colegio?");
			alu.setEscola(null);
			System.out.println("qual o seu ano letivo?");
			alu.setTurma(null);
			System.out.println();
			alu.cadastarAluno();
			break;
		}

		entrada.close();

	}

}
