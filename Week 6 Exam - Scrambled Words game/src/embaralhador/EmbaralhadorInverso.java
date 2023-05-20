package embaralhador;

public class EmbaralhadorInverso implements Embaralhador {
    
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}
