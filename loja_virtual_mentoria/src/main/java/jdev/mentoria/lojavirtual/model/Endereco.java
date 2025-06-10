package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jdev.mentoria.lojavirtual.enums.TipoEndereco;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", initialValue = 1, allocationSize = 1)
@Data
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
	private Long id;
	
	@Column(nullable = false, length = 60)
	private String logradouro;
	
	@Column(nullable = false, length = 20)
	private String numero;

	@Column(nullable = false, length = 60)
	private String bairro;
	
	@Column(nullable = false, length = 20)
	private String cep;
	
	private String complemento;
	
	@Column(nullable = false, length = 2)
	private String uf;

	@Column(nullable = false, length = 60)
	private String cidade;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private TipoEndereco tipoEndereco;

}
