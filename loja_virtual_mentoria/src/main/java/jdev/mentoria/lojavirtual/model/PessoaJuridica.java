package jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pessoa_juridica")
@Getter
@Setter
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 20)
	private String cnpj;
	
	@Column(name = "inscricao_estadual", nullable = false, length = 20)
	private String inscricaoEstadual;
	
	@Column(name = "inscricao_municipal", length = 20)
	private String inscricaoMunicipal;
	
	@Column(nullable = false, length = 60)
	private String fantasia;
	
	@Column(nullable = false, length = 60)
	private String razao;
	
	@Column(nullable = false, length = 60)
	private String categoria;

}
