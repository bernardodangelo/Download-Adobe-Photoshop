import org.junit.Assert;
import org.junit.Test;

import embaralhador.EmbaralhadorAleatorio;
import embaralhador.EmbaralhadorInverso;

public class EmbaralhadorTest {

    @Test
    public void testAleatorio() {
        EmbaralhadorAleatorio embaralhador = new EmbaralhadorAleatorio();

        String palavra = "LIMONADA";
        String embaralhado = embaralhador.embaralhar(palavra);

        Assert.assertNotEquals(palavra, embaralhado);
        Assert.assertEquals(palavra.length(), embaralhado.length());
        for (char c : palavra.toCharArray()) {
            Assert.assertTrue(embaralhado.contains(String.valueOf(c)));
        }
    }

	@Test
	public void testInverso() {
		EmbaralhadorInverso embaralhador = new EmbaralhadorInverso();
		
		String palavra = "LIMONADA";
		String embaralhado = embaralhador.embaralhar(palavra);
		
		Assert.assertEquals("ADANOMIL", embaralhado);
        }
}