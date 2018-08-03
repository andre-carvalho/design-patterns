import java.util.List;

public class Item {
	private String nome;
	private int valorAbsoluto;
	private Desconto desconto = new DescontoSemDesconto();
	
	public Item(String nome,int valor) {
		this.nome=nome;
		this.valorAbsoluto=valor;
	}
	
	public Item(String nome,int valor,Desconto desconto) {
		this.nome=nome;
		this.valorAbsoluto=valor;
		this.desconto=desconto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return desconto.calculaDesconto(valorAbsoluto);
	}
	public void setValor(int valor) {
		this.valorAbsoluto = valor;
	}
	public static int calculaTotal(List<Item> itens) {
		int total = 0;
		for (Item i : itens)
			total += i.getValor();
		return total;
	}

}
