package aula4;

public class ObjectUsuario {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		usuario1.setId(01);
		usuario1.setNome("Gabriela");
		usuario1.setSenha("erocook6");
		usuario1.setPermissao("permissão para assistir");
		usuario1.setUsuario("Visitante");
		
		usuario2.setId(02);
		usuario2.setNome("Matheus");
		usuario2.setSenha("pinguimperneta");
		usuario2.setPermissao("permissao para participar");
		usuario2.setUsuario("Administrador");
		
		System.out.println("--------USUÁRIO1--------");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getSenha());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		System.out.println("--------USUÁRIO2--------");
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getSenha());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());
		System.out.println("------------------------");
	}

}
