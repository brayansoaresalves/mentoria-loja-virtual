package jdev.mentoria.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jdev.mentoria.lojavirtual.model.Acesso;
import jdev.mentoria.lojavirtual.service.AcessoService;

@SpringBootTest
class LojaVirtualMentoriaApplicationTests {
	
	@Autowired
	private AcessoService acessoService;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testarCadastrarAcesso() {
		
		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_FINANCEIRO");
		
		acessoService.salvar(acesso);
		
	}

}
