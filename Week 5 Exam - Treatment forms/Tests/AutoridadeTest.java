import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AutoridadeTest {
	
    @Test
    void testFormatarNomeInformal() {
        Autoridade autoridade = new Autoridade("Bernardo", "D'Angelo", new NomeInformal());
        assertEquals("Bernardo", autoridade.getTratamento());
    }

    @Test
    void testFormatarNomeRespeitosoMasculino() {
        Autoridade autoridade = new Autoridade("Bernardo", "D'Angelo", new NomeRespeitoso("Masculino"));
        assertEquals("Sr. D'Angelo", autoridade.getTratamento());
    }

    @Test
    void testFormatarNomeRespeitosoFeminino() {
        Autoridade autoridade = new Autoridade("Anastásia", "D'Angelo", new NomeRespeitoso("Feminino"));
        assertEquals("Sra. D'Angelo", autoridade.getTratamento());
    }

    @Test
    void testFormatarNomeComTitulo() {
        Autoridade autoridade = new Autoridade("Bernardo", "D'Angelo", new NomeComTitulo("Magnífico"));
        assertEquals("Magnífico Bernardo D'Angelo", autoridade.getTratamento());
    }
}