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

		char opcoes;

		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Seja bem vindo a START insira a opcao desejada");
			System.out.println("[1] - Cadastro");
			System.out.println("[2] - Ajuda");
			System.out.println("[3] - Sair");
			opcoes = entrada.next().charAt((0));

			switch (opcoes) {
			case '1':
				break;
			case '2':
				break;
			case '3':
				System.out.println("Saindo do sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Opcoes invalidas");
			}

		} while (opcoes != '1' && opcoes != '2');

		do {
			System.out.println();
			System.out.println("Possui cadastro?");
			System.out.println("[1] - Sim");
			System.out.println("[2] - Nao");
			System.out.println("[3] - Sair");
			opcoes = entrada.next().charAt((0));
			
			switch (opcoes) {
			case '1':
				System.out.println("Digite seu usuario");
				usu.setLogin(entrada.next());
				System.out.println("Digite sua senha");
				usu.setSenha(entrada.next());
				usu.verificarLogin();
				break;
			case '2':
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
				System.out.println();
				alu.cadastarAluno();
				break;
			case '3':
				System.out.println("Saindo do sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Opcoes invalidas");
			}

		} while (opcoes != '1' && opcoes != '2');

		entrada.close();

	}

}
