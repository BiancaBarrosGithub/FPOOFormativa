package FormativaUsuario;

public class ObjetoUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "Bella", 123, "adm", "bella.123");
		
		System.out.println("Id: " + usuario.getId());
		System.out.println("Nome:" + usuario.getNome());
		System.out.println("Password:" + usuario.getPassword());
		System.out.println("Permissao: " + usuario.getPermissao());
		System.out.println("Usuario: " + usuario.getUsuario());
			
	}
}
