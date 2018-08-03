
public class ContaPares extends TemplateContador {

	private int quantidade;
	@Override
	public void notificarPalavra(String palavra) {
		quantidade = condicao(palavra)?(quantidade+1):(quantidade);

	}

	@Override
	public int retornarContagem() {
		// TODO Auto-generated method stub
		return quantidade;
	}
	
	@Override
	public boolean condicao(String palavra) {
		return (palavra.length() % 2 == 0);
	}

}
