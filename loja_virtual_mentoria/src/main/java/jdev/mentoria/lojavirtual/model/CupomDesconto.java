package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Data
@SequenceGenerator(name = "seq_cupom_desconto", sequenceName = "seq_cupom_desconto", initialValue = 1, allocationSize = 1)
public class CupomDesconto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desconto")
	private Long id;
	
	@Column(name = "codigo_descricao", nullable = false)
	private String codigoDescricao;
	
	@Column(name = "valor_real", precision = 9, scale = 4)
	private BigDecimal valorReal;
	
	@Column(name = "valor_porcentagem", precision = 9, scale = 4)
	private BigDecimal valorPorcentagem;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_validade", nullable = false)
	private LocalDate dataValidade;

}
