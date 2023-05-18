
public class NomeRespeitoso implements FormatadorNome {
	
	private String genero;
	
	public NomeRespeitoso(String genero) {
		this.genero = genero;
	}
    
    public String formatarNome(String nome, String sobrenome) {
    	if(genero.equals("Masculino")) {
    		return "Sr. " + sobrenome;
    	}else if(genero.equals("Feminino")){
    		return "Sra. " + sobrenome;
    	}else {
    		return "Gênero inválido";
    	}
    }
    
}