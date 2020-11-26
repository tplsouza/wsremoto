package br.com.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.AgendamentoDAO;
import br.com.agendamento.model.Agencia;
import br.com.agendamento.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {

		@Autowired
		private AgendamentoDAO dao;
		
		@PostMapping("/novoagendamento")
		public ResponseEntity<Agendamento> gravar(@RequestBody Agendamento objeto){
			try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
			} catch(Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(403).build();
			}
			
		}
		
		@PostMapping("/relatorioporagencia")
		public ResponseEntity<List<Agendamento>> getAgendamentoAgencia(@RequestBody Agendamento objeto){
			List<Agendamento> lista = dao.findByAgencia(objeto.getAgencia());
			if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
			return ResponseEntity.ok(lista);
		}
		
		@PostMapping("/relatorioporagenciadata")
		public ResponseEntity<List<Agendamento>> getAgendamentoAgenciaData(@RequestBody Agendamento objeto){
			List<Agendamento> lista = dao.findByAgenciaAndDataAgendamento(objeto.getAgencia(),objeto.getDataAgendamento());
			if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
			return ResponseEntity.ok(lista);
		}
		
		@PostMapping("/relatorioporagenciadatacliente")
		public ResponseEntity<List<Agendamento>> getAgendamentoAgenciaDataCliente(@RequestBody Agendamento objeto){
			List<Agendamento> lista = dao.findByAgenciaAndDataAgendamentoAndNomeCliente(objeto.getAgencia(),objeto.getDataAgendamento(),objeto.getNomeCliente());
			if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
			return ResponseEntity.ok(lista);
		}
		
		@PostMapping("/relatorioporagenciacliente")
		public ResponseEntity<List<Agendamento>> getAgendamentoAgenciaCliente(@RequestBody Agendamento objeto){
			List<Agendamento> lista = dao.findByAgenciaAndNomeCliente(objeto.getAgencia(),objeto.getNomeCliente());
			if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
			return ResponseEntity.ok(lista);
		}
		
		@PostMapping("/relatorioporcliente")
		public ResponseEntity<List<Agendamento>> getAgendamentoCliente(@RequestBody Agendamento objeto){
			List<Agendamento> lista = dao.findByNomeCliente(objeto.getNomeCliente());
			if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				}
			return ResponseEntity.ok(lista);
		}
		
		@GetMapping("/relatoriopor")
		public ResponseEntity<List<Agendamento>> getAll(){
			List<Agendamento> lista = (List<Agendamento>)	dao.findAll();
			if (lista.size()==0) {
				return ResponseEntity.status(404).build();
			} 
			return ResponseEntity.ok(lista);
		}
		
		
}