import java.util.Scanner;

import dados.BancoDePalavras;
import embaralhador.Embaralhador;
import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo();
        BancoDePalavras bancoDePalavras = new BancoDePalavras("palavras.txt");

		System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas");
		System.out.println("");
		System.out.println("- Escolha uma mecânica de jogo -");
		System.out.println("(1) - Morte súbita");
		System.out.println("(2) - Pontuação máxima");
		System.out.println("Digite o seu determinado número para selecioná-la: ");
        int modo = sc.nextInt();
        sc.nextLine();

        MecanicaDoJogo mecanicaDoJogo = fabricaMecanica.criarMecanicaDoJogo(modo);
        Embaralhador embaralhador = fabricaMecanica.criarEmbaralhador();

        while (!mecanicaDoJogo.isFimDeJogo()) {
            String palavra = bancoDePalavras.getPalavraAleatoria();
            if (palavra == null) {
            	System.out.println("");
                System.out.println("Não há mais palavras disponíveis.");
                break;
            }

            String palavraEmbaralhada = embaralhador.embaralhar(palavra);
            
        	System.out.println("");
            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
            System.out.print("Digite sua tentativa: ");
            String tentativa = sc.nextLine();

            if (mecanicaDoJogo.verificarPalavra(palavra, tentativa)) {
            	System.out.println("");
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Você errou.");
            }
        }

        int pontuacaoFinal = mecanicaDoJogo.getPontuacao();
        
        System.out.println("");
        System.out.println("Pontuação final: " + pontuacaoFinal);
        
        sc.close();
    }
}

