public class ContaTodas extends TemplateContador{

	private int quantidade;
	
	@Override
	public void notificarPalavra(String palavra) {
		quantidade++;
	}

	@Override
	public int retornarContagem() {
		return quantidade;
	}

	@Override
	public boolean condicao(String palavra) {
		return true;
	}

}
