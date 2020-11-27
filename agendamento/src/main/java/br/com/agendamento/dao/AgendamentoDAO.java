package br.com.agendamento.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Agencia;
import br.com.agendamento.model.Agendamento;

public interface AgendamentoDAO  extends CrudRepository<Agendamento,Integer> {

	public List<Agendamento> findByAgencia(Agencia agencia);
	
	public List<Agendamento> findByAgenciaAndDataAgendamento(Agencia agencia, LocalDate data);
	
	public List<Agendamento> findByAgenciaAndDataAgendamentoAndNomeCliente(Agencia agencia, LocalDate data, String cliente);
	
	public List<Agendamento> findByAgenciaAndNomeCliente(Agencia agencia, String cliente);
	
	public List<Agendamento> findByDataAgendamento(LocalDate data);
	
	public List<Agendamento> findByDataAgendamentoAndNomeCliente(LocalDate data, String cliente);
	
	public List<Agendamento> findByNomeCliente( String cliente);
	
}
