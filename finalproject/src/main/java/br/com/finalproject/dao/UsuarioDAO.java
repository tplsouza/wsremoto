package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	
}
