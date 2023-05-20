package mecanica;

public interface MecanicaDoJogo {
	
    boolean isFimDeJogo();

    boolean verificarPalavra(String palavraCorreta, String tentativa);

    int getPontuacao();
    
}
