public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if(login.equals("login") && senha.equals("senha")) {
			return new Usuario(login);
		}
		throw new LoginException("Usuário e senha incorretos!", login);
	}
	
}
