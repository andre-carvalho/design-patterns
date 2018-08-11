
public class TituloBuilder {
	
	private TratamentoInterface instance;
	private AuxiliarBuilder auxiliar = new AuxiliarBuilder();
	
	public AuxiliarBuilder criarSenhor(String nome) {
		instance = new Senhor(nome);
		return auxiliar;
	}
	
	public AuxiliarBuilder criarDoutor(String nome) {
		instance = new Doutor(nome);
		return auxiliar;
	}
	
	public class AuxiliarBuilder {
		
		public AuxiliarBuilder sendoReitor() {
			TituloComposite composite = new TituloComposite(instance.getTitulo(), new Reitor());
			instance.setTitulo(composite);
			return this;
		}
		
		public AuxiliarBuilder sendoDeputado() {
			TituloComposite composite = new TituloComposite(instance.getTitulo(), new Deputado());
			instance.setTitulo(composite);
			return this;
		}

		public AuxiliarBuilder de(String l) {
			instance= new LocalizacaoProxy(instance, l);
			return this;
		}
		
		public TratamentoInterface get() {
			return instance;
		}
	}
	
}
