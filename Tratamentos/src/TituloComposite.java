
public class TituloComposite implements Titulo {
	
	private Titulo t1;
	private Titulo t2;

	
	public TituloComposite(Titulo t1, Titulo t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public String getTitulo() {
		return t1.getTitulo() + t2.getTitulo();
	}

}
