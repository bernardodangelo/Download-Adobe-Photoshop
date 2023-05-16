import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTest {

    @Test
    public void testAdicionaProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Produto 1", 1, 10.0);
        Produto produto2 = new Produto("Produto 2", 2, 20.0);

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);

        assertEquals(2, carrinho.getQuantidadeProduto(produto1));
        assertEquals(3, carrinho.getQuantidadeProduto(produto2));
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Produto 1", 1, 10.0);
        Produto produto2 = new Produto("Produto 2", 2, 20.0);

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);
        carrinho.removeProduto(produto1, 1);

        assertEquals(1, carrinho.getQuantidadeProduto(produto1));
        assertEquals(3, carrinho.getQuantidadeProduto(produto2));
    }

    @Test
    public void testCalcularValorTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Produto 1", 1, 10.0);
        Produto produto2 = new Produto("Produto 2", 2, 20.0);

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 3);

        assertEquals(80.0, carrinho.calcularValorTotal());
    }
}
