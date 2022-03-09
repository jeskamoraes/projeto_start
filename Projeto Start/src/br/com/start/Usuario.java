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
		String _login = "maria";
		String _senha = "123";
		
		//Usando o EQUALS para compara se a variavel e igual ao valor digitado
		if(login.equals(_login) && senha.equals(_senha)) {
			System.out.println("Login realizado com sucesso");	
			System.out.println("=====================================");
			System.out.println("=              START                =");
			System.out.println("=     Seja bem vindo " + _login +"          =");
			System.out.println("=====================================");
		}
		else {
			System.out.println("Login ou senha invalidos!");
		}
	}

}
