package mecanica;

public class MorteSubita implements MecanicaDoJogo {
    private int pontuacao;
    private int tentativas;
    private boolean acertou;

    public MorteSubita() {
        pontuacao = 0;
        tentativas = 0;
        acertou = true;
    }

    public boolean isFimDeJogo() {
        return tentativas > 0 && !acertou;
    }

    public boolean verificarPalavra(String palavraCorreta, String tentativa) {
        tentativas++;
        acertou = palavraCorreta.equalsIgnoreCase(tentativa);
        if (acertou) {
            pontuacao++;
        }
        return acertou;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
}

