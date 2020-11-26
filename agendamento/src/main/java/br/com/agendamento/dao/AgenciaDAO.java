package br.com.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Agencia;




public interface AgenciaDAO extends CrudRepository<Agencia,Integer>{

	public Agencia findById(int id);
	
}
