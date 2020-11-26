package br.com.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Gerente;


public interface GerenteDAO extends CrudRepository<Gerente,Integer>{

	public Gerente findByEmailAndSenha(String email, String senha);
	public Gerente findByRacfAndSenha(String racf, String senha);
}
