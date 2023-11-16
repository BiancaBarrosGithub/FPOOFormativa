package PessoaFormativa;

public class Principal {

	public static void main(String[] args) {
		Fisica pessoa = new Fisica("Helena", "123.498.569-09", "123.4567.854");
		
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Cpf:" + pessoa.getCpf());
		System.out.println("rg:" + pessoa.getRg());
		
	}
}
