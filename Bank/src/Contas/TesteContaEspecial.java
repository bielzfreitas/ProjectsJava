package Contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {

	@Before
	void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}

	@Test
	void saqueMaiorQueSaldoDentroDoLimite() {
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(valorSacado, 250);
	}
}
