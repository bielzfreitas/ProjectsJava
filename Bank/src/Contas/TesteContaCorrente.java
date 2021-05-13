package Contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {

	ContaCorrente cc;
	
	@Before
	void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	void deposito() {
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	void saque() {
		int valorSacado = cc.sacar(50);
		assertEquals(cc.saldo, 150);
		assertEquals(valorSacado, 50);
	}
	
	@Test
	void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}

}
