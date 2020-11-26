package br.com.agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.GerenteDAO;
import br.com.agendamento.model.Gerente;



@RestController
@CrossOrigin("*")
public class GerenteController {

			@Autowired
			private GerenteDAO dao;
			
			@PostMapping("/login")
			public ResponseEntity<Gerente> logar(@RequestBody Gerente objeto){
				Gerente resposta = new Gerente();
				if (objeto.getEmail().indexOf("@") > 0) {
					resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
				} else {
					resposta = dao.findByRacfAndSenha(objeto.getEmail(), objeto.getSenha());
				}
				if(resposta == null) {
					return ResponseEntity.status(404).build();
				}
				
				return ResponseEntity.ok(resposta);
			} 
}
