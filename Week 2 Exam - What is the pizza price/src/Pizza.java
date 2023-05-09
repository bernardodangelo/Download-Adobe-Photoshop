import java.util.HashMap;

public class Pizza {
	private HashMap<String, Integer> ingredientes;
	private static HashMap<String, Integer> ingredientesUtilizados = new HashMap<>();
	
	public Pizza() {
	    ingredientes = new HashMap<>();
	}

	public void adicionaIngrediente(String ingrediente) {
	    ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
	    contabilizaIngrediente(ingrediente);
	}

	private static void contabilizaIngrediente(String ingrediente) {
	    ingredientesUtilizados.put(ingrediente, ingredientesUtilizados.getOrDefault(ingrediente, 0) + 1);
	}

	public int getPreco() {
	    int numIngredientes = ingredientes.values().stream().mapToInt(Integer::intValue).sum();
	    if (numIngredientes <= 2) {
	        return 15;
	    } else if (numIngredientes <= 5) {
	        return 20;
	    } else {
	        return 23;
	    }
	}

	public HashMap<String, Integer> getIngredientes() {
	    return ingredientes;
	}

	public static HashMap<String, Integer> getIngredientesUtilizados() {
	    return ingredientesUtilizados;
	}
}