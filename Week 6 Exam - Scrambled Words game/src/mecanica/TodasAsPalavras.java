package mecanica;

public class TodasAsPalavras implements MecanicaDoJogo {
    private static final int MAX_PALAVRAS = 20;
    private int pontuacao;
    private int palavraAtual;

    public TodasAsPalavras() {
        pontuacao = 0;
        palavraAtual = 0;
    }

    public boolean isFimDeJogo() {
        return palavraAtual >= MAX_PALAVRAS;
    }

    public boolean verificarPalavra(String palavraCorreta, String tentativa) {
        boolean acertou = palavraCorreta.equalsIgnoreCase(tentativa);
        if (acertou) {
            pontuacao++;
        }
        palavraAtual++;
        return acertou;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}

