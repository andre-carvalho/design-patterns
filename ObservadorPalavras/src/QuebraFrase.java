import java.util.HashMap;
import java.util.Map;

public class QuebraFrase {
	
	private Map<String,ObservadorPalavras> observadores = new HashMap<>();

	public int recuperarContagem(String type) {
		
		return observadores.get(type).retornarContagem();
	}

	public void quebrarFrase(String string) {
		String[] palavras = string.split(" ");
		for (String palavra : palavras) {
			for (ObservadorPalavras observador : observadores.values())
				observador.notificarPalavra(palavra);
		}
	}

	public void adicionaContador(String type, ObservadorPalavras contaTodas) {
		observadores.put(type, contaTodas);
		
	}

}
