import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestePizza {
	
    @BeforeClass
    public static void zeraIngredientesUtilizados() {
        Pizza.zeraIngredientesUtilizados();
    }

	@Test
	void testPrecoDoisIngredientes() {
		Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Calabresa");
		assertEquals(15, pizza.getPreco());
	}
	
	@Test
	void testPrecoCincoIngredientes() {
		Pizza pizza = new Pizza();
	    pizza.adicionaIngrediente("Queijo");
	    pizza.adicionaIngrediente("Chocolate Branco");
	    pizza.adicionaIngrediente("Cholate Preto");
	    pizza.adicionaIngrediente("Coco");
	    pizza.adicionaIngrediente("Granulado");
		assertEquals(20, pizza.getPreco());
	}
	
	@Test
	void testPrecoMaisDeCincoIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		pizza.adicionaIngrediente("Ovo");
		pizza.adicionaIngrediente("Azeitona");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Ervilha");
		pizza.adicionaIngrediente("Azeite");
		assertEquals(23, pizza.getPreco());
	}
	
	
    @Test
    void testGetIngredientesUtilizados() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Calabresa");
        HashMap<String, Integer> ingredientesUtilizados = Pizza.getIngredientesUtilizados();
        assertEquals(1, (int) ingredientesUtilizados.get("Queijo"));
        assertEquals(1, (int) ingredientesUtilizados.get("Calabresa"));
    }

    
}
