package br.com.start;

import java.util.Scanner;

public class Contato extends Pessoa{
	
	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	static Scanner entrada = new Scanner(System.in);
	
	public void formContato() {
		//PREENCHENDO FORMULARIO DE CONTATO
				System.out.println("Digite seu nome");
				setNome(entrada.next());
				System.out.println("Digite seu email");
				setEmail(entrada.next());
				System.out.println("Digite seu telefone");
				setTelefone(entrada.next());
				System.out.println("Digite sua mensagem");
				setMensagem(entrada.next());
				System.out.println();
				System.out.println("OBRIGADO PELO SEU CONTATO EM BREVE RETORNAREMOS A SUA SOLICITAÇÃO.");
				Main.menuPrincipal();
	}
}
