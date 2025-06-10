package jdev.mentoria.lojavirtual.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pessoa_fisica")	
@Getter
@Setter
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 20)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;

}
