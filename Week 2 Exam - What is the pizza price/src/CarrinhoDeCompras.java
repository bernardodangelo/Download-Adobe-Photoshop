class CarrinhoDeCompras {
	
	private int valorTotal;
	private int numPizzas;
	
	public CarrinhoDeCompras() {
	    valorTotal = 0;
	    numPizzas = 0;
	}

	public void adicionaPizza(Pizza pizza) {
	    if (pizza.getIngredientes().isEmpty()) {
	        System.out.println("Erro: pizza sem ingredientes não pode ser adicionada ao carrinho.");
	        return;
	    }
	    
	    int preco = pizza.getPreco();
	    if (preco > 0) {
	        valorTotal += preco;
	        numPizzas++;
	    }
	}

	public int getValorTotal() {
	    return valorTotal;
	}

	public int getNumPizzas() {
	    return numPizzas;
	}
}