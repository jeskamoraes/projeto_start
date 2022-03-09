package br.com.start;

public class Usuario extends Pessoa {
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//Validando usuario e senha
	void verificarLogin() {
		if (login == "joao" && senha == "123") {
			System.out.println("Login realizado com sucesso");
		}
		else {
			System.out.println("Login ou senha invalidos!");
		}
	}

}
