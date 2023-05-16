import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTamanhoTest {

    @Test
    public void testEquals() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Produto 1", 1, 20.0, "P");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Produto 2", 1, 10.0, "P");
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Produto 3", 2, 30.0, "G");

        assertTrue(produto1.equals(produto2));
        assertFalse(produto1.equals(produto3));
    }

    @Test
    public void testHashCode() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Produto 1", 1, 20.0, "P");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Produto 2", 1, 10.0, "P");

        assertEquals(produto1.hashCode(), produto2.hashCode());
    }
}
