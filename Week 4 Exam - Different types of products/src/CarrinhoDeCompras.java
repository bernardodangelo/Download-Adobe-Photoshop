import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> produtos;

    public CarrinhoDeCompras() {
        produtos = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int quantidadeAtual = produtos.get(produto);
            produtos.put(produto, quantidadeAtual + quantidade);
        } else {
            produtos.put(produto, quantidade);
        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto)) {
            int quantidadeAtual = produtos.get(produto);
            if (quantidade <= quantidadeAtual) {
                int novaQuantidade = quantidadeAtual - quantidade;
                if (novaQuantidade > 0) {
                    produtos.put(produto, novaQuantidade);
                } else {
                    produtos.remove(produto);
                }
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            valorTotal += produto.getPreco() * quantidade;
        }
        return valorTotal;
    }

    public int getQuantidadeProduto(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }
}
