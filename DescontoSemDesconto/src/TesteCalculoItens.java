import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TesteCalculoItens {

	@Test
	void itensComDescontoAbsoluto() {
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("camiseta",100,new DescontoAbsoluto(10)));
		itens.add(new Item("tenis",450,new DescontoAbsoluto(100)));
		
		int total = Item.calculaTotal(itens);
		assertEquals(440, total);
		
	}
	
	@Test
	public void ItensComDescontoPercentual() {
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("camiseta",50,new DescontoPercentual(10)));
		itens.add(new Item("tenis",400,new DescontoPercentual(40)));
		
		int total = Item.calculaTotal(itens);
		assertEquals(285, total);
	}

	@Test
	public void ItensSemDescontoPercentual() {
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("camiseta",50));
		itens.add(new Item("tenis",400));
		
		int total = Item.calculaTotal(itens);
		assertEquals(450, total);
	}
}
