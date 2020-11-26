package br.com.agendamento.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Agencia;
import br.com.agendamento.model.Agendamento;

public interface AgendamentoDAO  extends CrudRepository<Agendamento,Integer> {

	public List<Agendamento> findByAgencia(Agencia agencia);
	
	public List<Agendamento> findByAgenciaAndDataAgendamento(Agencia agencia, Date data);
	
	public List<Agendamento> findByAgenciaAndDataAgendamentoAndNomeCliente(Agencia agencia, Date data, String cliente);
	
	public List<Agendamento> findByAgenciaAndNomeCliente(Agencia agencia, String cliente);
	
	public List<Agendamento> findByDataAgendamento(Date data);
	
	public List<Agendamento> findByDataAgendamentoAndNomeCliente(Date data, String cliente);
	
	public List<Agendamento> findByNomeCliente( String cliente);
	
}
