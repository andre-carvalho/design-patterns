
public abstract class Tratamento implements TratamentoInterface {
	
	private String nome;
	private Titulo titulo = new NullTitulo();
	
	public Tratamento(String nome) {
		this.nome = nome;
	}

	@Override
	public abstract String prefixo();
	
	@Override
	public String gerarTratamento() {
		return titulo.getTitulo() + prefixo() + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Titulo getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
