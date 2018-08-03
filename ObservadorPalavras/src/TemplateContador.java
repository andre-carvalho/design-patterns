
public abstract class TemplateContador implements ObservadorPalavras {

	private int quantidade;
	@Override
	public void notificarPalavra(String palavra) {
		quantidade = (condicao(palavra))?(quantidade+1):(quantidade);

	}

	@Override
	public int retornarContagem() {
		// TODO Auto-generated method stub
		return quantidade;
	}
	
	public abstract boolean condicao(String palavra);

}
