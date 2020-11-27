package br.com.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.AgenciaDAO;
import br.com.agendamento.model.Agencia;


@RestController
@CrossOrigin("*")
public class AgenciaController {




			@Autowired
			private AgenciaDAO dao;
			
			
			@GetMapping("/agencias")
			public ResponseEntity<List<Agencia>> getAll(){
				List<Agencia> lista = (List<Agencia>)	dao.findAll();
				if (lista.size()==0) {
					return ResponseEntity.status(404).build();
				} 
				return ResponseEntity.ok(lista);
			}
			
			@PostMapping("/agenciaid")
			public ResponseEntity<Agencia> getAgenciaId(@RequestBody Agencia objeto){
				Agencia agencia = dao.findById(objeto.getId());

				return ResponseEntity.ok(agencia);
			}
			
			@PostMapping("/agencianome")
			public ResponseEntity<Agencia> getAgenciaNome(@RequestBody Agencia objeto){
				Agencia agencia = dao.findByNomeAgencia(objeto.getNomeAgencia());

				return ResponseEntity.ok(agencia);
			}


	}


