
public class ContaMaiusculas extends TemplateContador {

	private int quantidade;
	@Override
	public void notificarPalavra(String palavra) {
		if(condicao(palavra))
			quantidade++;

	}

	@Override
	public int retornarContagem() {
		return quantidade;
	}
	
	@Override
	public boolean condicao(String palavra) {
		return (Character.isUpperCase(palavra.charAt(0)));
	}

}
