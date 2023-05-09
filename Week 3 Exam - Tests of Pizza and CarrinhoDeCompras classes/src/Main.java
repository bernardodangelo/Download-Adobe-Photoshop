import java.util.HashMap;

public class Main {
	
    public static void main(String[] args) {
    	
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Calabresa");
        pizza1.adicionaIngrediente("Cebola");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Chocolate Branco");
        pizza2.adicionaIngrediente("Cholate Preto");
        pizza2.adicionaIngrediente("Granulado");

        Pizza pizza3 = new Pizza();


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);
        carrinho.adicionaPizza(pizza3);

        System.out.println("\nQuantidade de pizzas: " + carrinho.getNumPizzas());
        System.out.println("\nValor total: R$ " + carrinho.getValorTotal());
        System.out.println("\nIngredientes utilizados:\n");
        
        HashMap<String, Integer> ingredientesUtilizados = Pizza.getIngredientesUtilizados();
        
        for (String ingrediente : ingredientesUtilizados.keySet()) {
            System.out.println(ingrediente + ": " + ingredientesUtilizados.get(ingrediente));
        }
    }
}