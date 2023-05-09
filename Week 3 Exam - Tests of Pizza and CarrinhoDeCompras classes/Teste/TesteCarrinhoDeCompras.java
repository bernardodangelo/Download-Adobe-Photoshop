import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

    private CarrinhoDeCompras carrinho;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private Pizza pizzaSemIngredientes;

    @Before
    public void setUp() {
        carrinho = new CarrinhoDeCompras();

        pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Calabresa");
        pizza1.adicionaIngrediente("Cebola");

        pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Chocolate Branco");
        pizza2.adicionaIngrediente("Chocolate Preto");
        pizza2.adicionaIngrediente("Granulado");

        pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Orégano");

        pizzaSemIngredientes = new Pizza();

        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);
    }

    @Test
    public void testValorTotal() {
        assertEquals(60, carrinho.getValorTotal());
    }

    @Test
    public void testNumPizzas() {
        assertEquals(3, carrinho.getNumPizzas());
    }

    @Test
    public void testAdicionaPizzaSemIngredientes() {
        carrinho.adicionaPizza(pizzaSemIngredientes);
        assertEquals(60, carrinho.getValorTotal());
        assertEquals(3, carrinho.getNumPizzas());
    }
}
