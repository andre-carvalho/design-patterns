import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTrechosAereos {

	@Test
	void escala() {
		TrechoAereo t1 = new TrechoSimples("GRU", "FOR", 2000, 700);
		TrechoAereo t2 = new TrechoSimples("FOR", "MAN", 3500, 600);
		TrechoAereo escala = new TrechoEscala(t1, t2);
		assertEquals("GRU", escala.getOrigem());
		assertEquals("MAN", escala.getDestino());
		assertEquals(5500, escala.getDistancia());
		assertEquals(1300, escala.getPreco());
	}
	
	@Test
	void escalaDesencontrada() {
		TrechoAereo t1 = new TrechoSimples("GRU", "REC", 2000, 700);
		TrechoAereo t2 = new TrechoSimples("FOR", "MAN", 3500, 600);

		try {
			@SuppressWarnings("unused")
			TrechoAereo escala = new TrechoEscala(t1, t2);	
		} catch (RuntimeException exception) {
			assertEquals("voo desencontrado", exception.getMessage());
		}
	    
	}
	
	@Test
	void conexao() {
		TrechoAereo t1 = new TrechoSimples("GRU", "FOR", 2000, 700);
		TrechoAereo t2 = new TrechoSimples("FOR", "MAN", 3500, 600);
		
		TrechoAereo conexao = new TrechoConexao(t1, t2, 300);
		assertEquals("GRU", conexao.getOrigem());
		assertEquals("MAN", conexao.getDestino());
		assertEquals(5500, conexao.getDistancia());
		assertEquals(1600, conexao.getPreco());
	}
	
	@Test
	void conexaoEscala() {
		TrechoAereo t1 = new TrechoSimples("GRU", "FOR", 2000, 700);
		TrechoAereo t2 = new TrechoSimples("FOR", "MAN", 3500, 600);
		TrechoAereo t3 = new TrechoSimples("FOR", "MAN", 1500, 400);
		
		TrechoAereo conexao = new TrechoConexao(t1, t2, 300);
		TrechoAereo escala;
		
		try {
			
			escala = new TrechoEscala(conexao, t3);
			assertEquals("GRU", escala.getOrigem());
			assertEquals("MAN", escala.getDestino());
			assertEquals(7000, escala.getDistancia());
			assertEquals(2000, escala.getPreco());
			
		} catch (RuntimeException exception) {
			// no exception expected here!!
		}
	}

}
