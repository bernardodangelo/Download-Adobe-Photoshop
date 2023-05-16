import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    private String tamanho;

    public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho produto = (ProdutoComTamanho) o;
        return Objects.equals(tamanho, produto.tamanho);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}
