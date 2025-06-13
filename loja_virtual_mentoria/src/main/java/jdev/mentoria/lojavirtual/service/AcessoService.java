package jdev.mentoria.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	@Transactional
	public Acesso salvar(Acesso acesso) {
		return acessoRepository.save(acesso);
	}
	
	@Transactional
	public void deletar(Acesso acesso) {
		acessoRepository.delete(acesso);
	}

}
