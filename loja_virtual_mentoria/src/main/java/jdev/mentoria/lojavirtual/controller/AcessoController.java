package jdev.mentoria.lojavirtual.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.repository.AcessoRepository;
import jdev.mentoria.lojavirtual.service.AcessoService;

@RestController
@RequestMapping("/acessos")
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	@PostMapping
	public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso){
		Acesso novoAcesso = acessoService.salvar(acesso);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(novoAcesso);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletarAcesso(@PathVariable Long id){
		Optional<Acesso> acessoFiltrado = acessoRepository.findById(id);
		
		if (acessoFiltrado.isPresent()) {
			acessoService.deletar(acessoFiltrado.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}

}
