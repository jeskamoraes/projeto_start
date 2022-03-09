package br.com.start;

import java.util.Scanner;

public class Usuario extends Pessoa {

	//CRIANDO ESTANCIA DO SCANNER PARA CAPTURAR DADOS
	static Scanner entrada = new Scanner(System.in);
	
	//CRIANDO A VARIAL PARA GUARDA A OPCAO DIGITADA
	static char opcoes;

	//CRIANDO ATRIBUTOS
	private String senha;
	private boolean usuarioLogado;

	public boolean isUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(boolean usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	//METODO PARA VALIDAR EMAIL E SENHA
	void verificarLogin() {
		String _email = "maria@start.com.br";
		String _senha = "123";
		
		//CASO O USUARIO DIGITAR EMAIL OU SENHA INVALIDAS, RETORNA A MENSAGEM
		while (usuarioLogado == false) {
		
			//CAPUTANDO EMAIL E SENHA DIGITADO
			System.out.println("Digite seu email");
			setEmail(entrada.next());

			System.out.println("Digite sua senha");
			setSenha(entrada.next());
	
			//UTILIZANDO O EQUALS PARA COMPARA SE A VARIAVEL E IGUAL AO VALOR DIGITADO
			if (getEmail().equals(_email) && senha.equals(_senha)) {
				//CASO O USUARIO DIGITAR EMAIL E SENHA CORRETAS, APRENSAR O SISTEMA LOGADO
				System.out.println("Login realizado com sucesso");
				exibirMenuLogin();
				usuarioLogado = true;
			} else {
				//SE O USUARIO DIGITAR EMAIL OU SENHA INVALIDOS, APRESENTAR MENSAGEM E CAPTURAR NOVAMENTE
				System.out.println("Email ou senha invalidos!");
				usuarioLogado = false;
			}
		}
	}


	//METODO PARA EXIBIR MENU DEPOIS QUE O USUARIO LOGAR NO SISTEMA
	void exibirMenuLogin() {
		do {
			System.out.println();
			System.out.println("Selecione a opcao desejada:");
			System.out.println("[1] - Minha viagem");
			System.out.println("[2] - Minhas informacoes");
			System.out.println("[3] - Sobre a Start");
			System.out.println("[4] - Sobre os pacotes");
			System.out.println("[5] - Sair");
			
			//CAPTURANDO VALOR DIGITADO NO CONSOLE
			opcoes = entrada.next().charAt((0));

			switch (opcoes) {
			case '1':
				break;
			case '2':
				break;
			case '5':
				System.out.println("Saindo do sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida");
			}

		} while (opcoes != '1' && opcoes != '2');
	}

}
