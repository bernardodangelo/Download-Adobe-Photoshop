
public interface FormatadorNome {
	
	String formatarNome(String nome, String sobrenome);
	
	}

class NomeInformal implements FormatadorNome {
    public String formatarNome(String nome, String sobrenome) {
        return nome;
    }
}

class NomeRespeitoso implements FormatadorNome {
	
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

class NomeComTitulo implements FormatadorNome{
	private String titulo;
	
	public NomeComTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome; 
	}
}

