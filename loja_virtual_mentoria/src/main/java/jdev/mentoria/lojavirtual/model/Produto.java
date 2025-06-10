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
	
	private String unidade;
	
	private String nome;
	
	@Column(columnDefinition = "text", length = 2000)
	private String descricao;
	
	private BigDecimal peso;
	
	private BigDecimal largura;
	
	private BigDecimal altura;
	
	private BigDecimal profundidade;
	
	private BigDecimal valorVenda = BigDecimal.ZERO;
	
	private Integer quantidadeEstoque = 0;
	
	private Integer quantidadeAlertaEstoque = 0;
	
	private String linkYoutube;
	
	private Boolean alertaQuantidadeEstoque = Boolean.FALSE;
	
	private Integer quantidadeCliques = 0;
	
	private Boolean ativo = Boolean.TRUE;
	
}
