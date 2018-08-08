
public class TrechoConexao extends TrechoEscala {
	
	private int taxaAeroporto;
	
	public TrechoConexao(TrechoAereo primeiro, TrechoAereo segundo, int taxaAeroporto) {
		super(primeiro, segundo);
		this.taxaAeroporto=taxaAeroporto;
	}
	
	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return super.getPreco() + this.taxaAeroporto;
	}

}
