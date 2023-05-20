package dados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
    private List<String> palavras;

    public BancoDePalavras(String arquivo) {
        palavras = new ArrayList<>();
        lerPalavrasDoArquivo(arquivo);
    }

    private void lerPalavrasDoArquivo(String arquivo) {
        try (Scanner scanner = new Scanner(new File(arquivo))) {
            while (scanner.hasNextLine()) {
                String palavra = scanner.nextLine();
                palavras.add(palavra);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o arquivo de palavras: " + arquivo);
        }
    }

    public String getPalavraAleatoria() {
        if (palavras.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int indice = random.nextInt(palavras.size());
        return palavras.remove(indice);
    }
}
