
public class LocalizacaoProxy implements TratamentoInterface {
	
	private TratamentoInterface tratamento;
	private String localizacao;
	

	public LocalizacaoProxy(TratamentoInterface tratamento, String localizacao) {
		this.tratamento = tratamento;
		this.localizacao = localizacao;
	}

	public String prefixo() {
		return tratamento.prefixo();
	}

	public String gerarTratamento() {
		return tratamento.gerarTratamento() + " de " + localizacao;
	}

	public Titulo getTitulo() {
		return tratamento.getTitulo();
	}

	public void setTitulo(Titulo titulo) {
		tratamento.setTitulo(titulo);
	}
}
