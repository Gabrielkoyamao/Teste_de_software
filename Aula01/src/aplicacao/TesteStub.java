package aplicacao;

import java.lang.reflect.Field;
import java.util.List;

import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.UsuarioDAOStub;

public class TesteStub {
	public static void main(String[] args) {
		
		UsuarioDAO udao = new UsuarioDAOStub();
		Usuario u = new Usuario();
		u.setNomeUsuario("fabricio");
		u = udao.inserir(u);
		for (int i = 0; i < 100; i++) {
			u = udao.inserir(u);			
		}
		List<Usuario> ulista = udao.buscar(u);
		System.out.println(u.getId());
		try {
			Field f = UsuarioDAOStub.class.getDeclaredField("contInserir");
			Field f2 = UsuarioDAOStub.class.getDeclaredField("contBuscar");
			System.out.println(f.get(udao));
			System.out.println(f2.get(udao));
		}catch(Exception e ) {
			System.out.println("Erro de acesso a campo");
		}
		
	}
}
