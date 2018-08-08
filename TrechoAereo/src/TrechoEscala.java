
public class TrechoEscala implements TrechoAereo {
	
	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	
	public TrechoEscala(TrechoAereo primeiro, TrechoAereo segundo) {
		if(!primeiro.getDestino().equals(segundo.getOrigem())) {
			throw new RuntimeException("voo desencontrado");
		}
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return primeiro.getOrigem();
	}
	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return segundo.getDestino();
	}
	@Override
	public int getDistancia() {
		// TODO Auto-generated method stub
		return primeiro.getDistancia() + segundo.getDistancia();
	}
	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return primeiro.getPreco() + segundo.getPreco();
	}

}
