import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContadorPalavras {

	@Test
	void contaTodasAsPalavras1() {
		QuebraFrase qf = new QuebraFrase();
		qf.adicionaContador("TODAS", new ContaTodas());
		qf.adicionaContador("PARES", new ContaPares());
		qf.adicionaContador("MAIUSCULAS", new ContaMaiusculas());
		qf.quebrarFrase("O rato roeu a roupa do rei de Roma");
		assertEquals(9, qf.recuperarContagem("TODAS"));
		assertEquals(5, qf.recuperarContagem("PARES"));
		assertEquals(2, qf.recuperarContagem("MAIUSCULAS"));
	}
	
	@Test
	void contaTodasAsPalavras2() {
		QuebraFrase qf = new QuebraFrase();
		qf.adicionaContador("TODAS", new ContaTodas());
		qf.adicionaContador("PARES", new ContaPares());
		qf.adicionaContador("MAIUSCULAS", new ContaMaiusculas());
		qf.quebrarFrase("As arveres somos nozes");
		assertEquals(4, qf.recuperarContagem("TODAS"));
		assertEquals(1, qf.recuperarContagem("PARES"));
		assertEquals(1, qf.recuperarContagem("MAIUSCULAS"));
	}

}
