package embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorAleatorio implements Embaralhador {
    
    public String embaralhar(String palavra) {
        List<Character> caracteres = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            caracteres.add(c);
        }
        Collections.shuffle(caracteres);
        StringBuilder embaralhado = new StringBuilder();
        for (char c : caracteres) {
            embaralhado.append(c);
        }
        return embaralhado.toString();
    }
}
