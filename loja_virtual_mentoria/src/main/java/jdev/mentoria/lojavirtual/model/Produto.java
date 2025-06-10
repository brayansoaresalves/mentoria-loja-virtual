package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", initialValue = 1, allocationSize = 1)
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	
	@Column(length = 10, nullable = false)
	private String unidade;
	
	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(columnDefinition = "text", nullable = false)
	private String descricao;
	
	@Column(precision = 9, scale = 4, nullable = false)
	private BigDecimal peso;
	
	@Column(precision = 9, scale = 4, nullable = false)
	private BigDecimal largura;
	
	@Column(precision = 9, scale = 4, nullable = false)
	private BigDecimal altura;
	
	@Column(precision = 9, scale = 4, nullable = false)
	private BigDecimal profundidade;
	
	@Column(precision = 9, scale = 4, nullable = false)
	private BigDecimal valorVenda = BigDecimal.ZERO;
	
	@Column(nullable = false)
	private Integer quantidadeEstoque = 0;
	
	private Integer quantidadeAlertaEstoque = 0;
	
	private String linkYoutube;
	
	private Boolean alertaQuantidadeEstoque = Boolean.FALSE;
	
	private Integer quantidadeCliques = 0;
	
	@Column(nullable = false)
	private Boolean ativo = Boolean.TRUE;
	
}
