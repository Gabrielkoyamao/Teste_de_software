package modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOStub implements UsuarioDAO {
	
	public int contInserir;
	public int contBuscar;
	public UsuarioDAOStub() {
		this.contInserir = 0;
		this.contBuscar = 0;
	}
	
	@Override
	public Usuario inserir(Usuario u) {
		++this.contInserir;
		switch(u.getNomeUsuario()) {
		case "fabricio":
			u.setId(new Long(1));
			break;
		case "rony":
			u.setId(new Long(2));
			break;
		default:
			return null;
		}
		return u;
	}
	
	@Override
	public List<Usuario> buscar(Usuario u) {
		++this.contBuscar;
		List<Usuario> usuarios = new ArrayList();
		List<Usuario> usuariosAchados = new ArrayList();
		Usuario uNovo = new Usuario();
		uNovo.setId(new Long(1));
		uNovo.setNomeUsuario("fabricio");
		uNovo.setSenha("xyz");
		usuarios.add(uNovo);
		for (Usuario ubd : usuarios) {
			if(ubd.getNomeUsuario().equals(u.getNomeUsuario())) {
				usuariosAchados.add(ubd);
			}
		}
		return usuariosAchados;
	}
}
