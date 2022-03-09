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
	
	void verificarLogin() {
		String _usuario = "joao";
		String _senha   = "123";
		if (login == _usuario && senha == _senha) {
			System.out.println("Login realizado com sucesso");
		}
		else {
			System.out.println("Login ou senha invalidos!");
		}
	}
	void verificarSenha(String _senha) {
		
	}

}
