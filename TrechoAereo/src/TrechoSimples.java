
public class TrechoSimples implements TrechoAereo {

	private String origem;
	private String destino;
	private int distancia;
	private int preco;
	
	
	public TrechoSimples(String origem, String destino, int distancia, int preco) {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.preco = preco;
	}
	
	@Override
	public String getOrigem() {
		return origem;
	}
	@Override
	public String getDestino() {
		return destino;
	}
	@Override
	public int getDistancia() {
		return distancia;
	}
	@Override
	public int getPreco() {
		return preco;
	}
	
}
