import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTratamento {

	@Test
	void senhor() {
		TituloBuilder b = new TituloBuilder();
		TratamentoInterface t = b.criarSenhor("Carvalho").get();
		assertEquals("Senhor Carvalho", t.gerarTratamento());
	}
	
	@Test
	void doutor() {
		TituloBuilder b = new TituloBuilder();
		TratamentoInterface t = b.criarDoutor("Carvalho").get();
		assertEquals("Doutor Carvalho", t.gerarTratamento());
	}
	
	@Test
	void senhorReitor() {
		TituloBuilder b = new TituloBuilder();
		TratamentoInterface t = b.criarSenhor("Carvalho").sendoReitor().get();
		assertEquals("Mag. Senhor Carvalho", t.gerarTratamento());
	}
	
	@Test
	void doutorDeputadoReitor() {
		TituloBuilder b = new TituloBuilder();
		TratamentoInterface t = b.criarDoutor("Carvalho").sendoDeputado().sendoReitor().get();
		assertEquals("Exmo. Mag. Doutor Carvalho", t.gerarTratamento());
	}

}
