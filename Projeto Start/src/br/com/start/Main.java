package br.com.start;

import java.util.Scanner;

public class Main {

	// ESTANCIANDO CLASSE CLIENTE
	static Aluno alu = new Aluno();
	static Usuario usu = new Usuario();
	static Contato con = new Contato();

	// VARIAL PARA PEGAR A OPCAO DIGITADA
	static char opcoes;

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// TELA INCIAL DO SISTEMA
		System.out.println("=====================================");
		System.out.println("=              START                =");
		System.out.println("=     A melhor viagem de formatura  =");
		System.out.println("=====================================");

		menuPrincipal();

	}

	// METODO PARA CHAMAR MENU PRINCIAL
	public static void menuPrincipal() {
		// MENU PRINCIPAL UTILIZANDO O DO WHILE PARA FICAR REPETINDO ENQUANTO O USUARIO
		// NAO DIGITAR OPCAO CORRETA

		do {
			System.out.println();
			System.out.println("Seja bem vindo a START insira a opcao desejada");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Efetuar Login");
			System.out.println("[3] - Solicitar Contato");
			System.out.println("[4] - Sair");
			
			//CAPTURANDO OPCAO DIGITADA NO CONSOLE
			opcoes = entrada.next().charAt((0));

			switch (opcoes) {
			case '1':
				// CHAMAR O METODO CADASTRAR ALUNO NA CLASSE ALUNO
				alu.cadastarAluno();
				break;
			case '2':
				//CHAMANDO METODO DA CLASSE USUARIO PARA VERIFICAR SE O USUARIO EXISTE
				usu.verificarLogin();
				break;
			case '3':
				//CHAMANDO METODO PARA PREENCHER FORMULARIO DE CONTATO
				con.formContato();
				break;
			case '4':
				//ENCERRANDO SISTEMA
				System.out.println("Sistema encerrado");
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida");
			}

			//CASO O USUARIO ESCOLHER A OPCAO DE CORRETA OU NAO CONSIGUIR LOGAR, APRESETAR O MENU NOVAMENTE
		} while (usu.isUsuarioLogado() == true || opcoes != '1' && opcoes != '2' && opcoes != '3');

		//FECHANDO O SCANNER
		entrada.close();
	}
}
