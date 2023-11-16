package FormativaUsuario;

public class PessoaFormativa {
	private String nome; //No lugar do public, tem que colocar o private
	private int idade;
	
	
	public PessoaFormativa(String nome, int idade) { // Adicionar os métodos construtores
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;  //this é usado para dizer que: este nome é igual ao nome
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
