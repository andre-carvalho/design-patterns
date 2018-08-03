
public class DescontoAbsoluto implements Desconto {
	private int valorDesconto;
	
	public DescontoAbsoluto(int valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	@Override
	public int calculaDesconto(int valor) {
		// TODO Auto-generated method stub
		return valor - valorDesconto;
	}

}
