
public class DescontoPercentual implements Desconto {

	private int porcentagemDesconto;
	
	public DescontoPercentual(int porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	@Override
	public int calculaDesconto(int valor) {
		// TODO Auto-generated method stub
		return valor * (100 - porcentagemDesconto) / 100;
	}

}
