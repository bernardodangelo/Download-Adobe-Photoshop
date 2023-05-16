import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testEquals() {
        Produto produto1 = new Produto("Produto 1", 1, 10.0);
        Produto produto2 = new Produto("Produto 2", 1, 20.0);
        Produto produto3 = new Produto("Produto 3", 2, 30.0);

        assertTrue(produto1.equals(produto2));
        assertFalse(produto1.equals(produto3));
    }

    @Test
    public void testHashCode() {
        Produto produto1 = new Produto("Produto 1", 1, 10.0);
        Produto produto2 = new Produto("Produto 2", 1, 20.0);

        assertEquals(produto1.hashCode(), produto2.hashCode());
    }
}
