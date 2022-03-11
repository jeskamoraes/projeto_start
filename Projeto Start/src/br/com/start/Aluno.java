package br.com.start;

import java.util.Scanner;

public class Aluno {

	// CRIANDO ESTANCIA DO SCANNER PARA CAPTURAR DADOS
	static Scanner entrada = new Scanner(System.in);
	
	private String nome;
	private String idade;
	private String endereco;
	private String cpf;
	private String telefone;
	private String instituicao;
	private String turma;
	private String email;
	private String senha;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		Aluno.entrada = entrada;
	}

	public static char getOpcoes() {
		return opcoes;
	}

	public static void setOpcoes(char opcoes) {
		Aluno.opcoes = opcoes;
	}

	public void cadastrarAluno() {
		System.out.println("Nome: ");
		setNome(entrada.nextLine());
		System.out.println("Idade: ");
		setIdade(entrada.nextLine());
		System.out.println("CPF: ");
		setCpf(entrada.nextLine());
		System.out.println("Endereço: ");
		setEndereco(entrada.nextLine());
		System.out.println("Telefone: ");
		setTelefone(entrada.nextLine());
		System.out.println("Instituição: ");
		setInstituicao(entrada.nextLine());
		System.out.println("Turma: ");
		setTurma(entrada.nextLine());
		System.out.println("Email: ");
		setEmail(entrada.nextLine());
		System.out.println("Senha: ");
		setSenha(entrada.nextLine());
		Main.menuPrincipal();
		
	}

	public void exibirAluno() {
		System.out.println("Nome:" + getNome());
		System.out.println("Idade:" + getIdade());
		System.out.println("CPF:" + getCpf());
		System.out.println("Endereço:" + getEndereco());
		System.out.println("Telefone:" + getTelefone());
		System.out.println("Instituição:" + getInstituicao());
		System.out.println("Turma:" + getTurma());
		System.out.println("Email:" + getEmail());
		System.out.println("Senha:" + getSenha());
	}

	

	// CRIANDO A VARIAL PARA GUARDA A OPCAO DIGITADA
	static char opcoes;

	// METODO PARA VALIDAR EMAIL E SENHA
	void verificarLogin() {

		boolean usuarioLogado = false;

		// CASO O USUARIO DIGITAR EMAIL OU SENHA INVALIDAS, RETORNA A MENSAGEM
		while (usuarioLogado == false) {

			// CAPUTANDO EMAIL E SENHA DIGITADO
			System.out.println("Digite seu email");
			String digitadoSsuario = entrada.next();

			System.out.println("Digite sua senha");
			String digitadoSenha = entrada.next();

			String _email = email;
			String _senha = senha;

			// UTILIZANDO O EQUALS PARA COMPARA SE A VARIAVEL E IGUAL AO VALOR DIGITADO
			if (digitadoSsuario.equals(_email) && digitadoSenha.equals(_senha)) {
				// CASO O USUARIO DIGITAR EMAIL E SENHA CORRETAS, APRENSAR O SISTEMA LOGADO
				System.out.println("Login realizado com sucesso");
				exibirMenuLogin();
				usuarioLogado = true;
			} else {
				// SE O USUARIO DIGITAR EMAIL OU SENHA INVALIDOS, APRESENTAR MENSAGEM E CAPTURAR
				// NOVAMENTE
				System.out.println("Email ou senha invalidos!");
				Main.menuPrincipal();
				usuarioLogado = false;
			}
		}
	}

	// METODO PARA EXIBIR MENU DEPOIS QUE O USUARIO LOGAR NO SISTEMA
	void exibirMenuLogin() {
		do {
			System.out.println();
			System.out.println("Selecione a opcao desejada:");
			System.out.println("[1] - Minhas informacoes");
			System.out.println("[2] - Pacotes");
			System.out.println("[3] - Sobre a Start");
			System.out.println("[4] - Sair");
			
			Pacote pac = new Pacote();
			
			// CAPTURANDO VALOR DIGITADO NO CONSOLE
			opcoes = entrada.next().charAt((0));

			switch (opcoes) {
			case '1':
				exibirAluno();
				break;
			case '2':
				pac.conhecerPacote();
				break;
			case '3':
				break;
			case '4':
				System.out.println("Saindo do sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida");
			}

		} while (opcoes != '2' && opcoes != '3');
	}
	

}
