import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void loginSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("login", "senha");
		assertEquals("login", u.getLogin());
		
	}
	
	@Test//(expected= LoginException.class)
	void loginErro() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("login", "senhaerro");	
	}
	
	@Test
	void informacaoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("login", "senhaerro");
			fail();
		} catch (LoginException e) {
			assertEquals("login", e.getLogin());
		}	
	}

}
