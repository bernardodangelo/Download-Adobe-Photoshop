
public class NomeComTitulo implements FormatadorNome{
	private String titulo;
	
	public NomeComTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome; 
	}
	
}
