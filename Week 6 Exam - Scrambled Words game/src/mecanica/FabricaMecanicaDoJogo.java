package mecanica;

import embaralhador.Embaralhador;
import embaralhador.FabricaEmbaralhadores;

public class FabricaMecanicaDoJogo {
	
    public MecanicaDoJogo criarMecanicaDoJogo(int modo) {
        if (modo == 1) {
            return new MorteSubita();
        } else if (modo == 2) {
            return new TodasAsPalavras();
        } else {
            throw new IllegalArgumentException("Modo de jogo invÃ¡lido");
        }
    }

    public Embaralhador criarEmbaralhador() {
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
        return fabricaEmbaralhadores.obterEmbaralhadorAleatorio();
    }
}
