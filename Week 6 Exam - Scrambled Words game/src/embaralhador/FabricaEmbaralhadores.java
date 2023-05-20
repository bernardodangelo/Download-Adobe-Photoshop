package embaralhador;

import java.util.Random;

public class FabricaEmbaralhadores {
    private Random random;

    public FabricaEmbaralhadores() {
        random = new Random();
    }

    public Embaralhador obterEmbaralhadorAleatorio() {
        int escolha = random.nextInt(2);

        if (escolha == 0) {
            return new EmbaralhadorAleatorio();
        } else {
            return new EmbaralhadorInverso();
        }
    }
}
