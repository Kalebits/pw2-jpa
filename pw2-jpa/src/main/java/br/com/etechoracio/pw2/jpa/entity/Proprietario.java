package br.com.etechoracio.pw2.jpa.entity;


import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.etechoracio.jpa.enums.TipoPessoaEnum;
import lombok.Getter;
import lombok.Setter;

public class Proprietario {
	
	@Id
	@Column(name = "ID_PROPRIETARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TP_PROPRIETARIO")
	@Enumerated(EnumType.ORDINAL)
	private TipoPessoaEnum tipo;
	
	@Column(name = "TX_DOCUMENTO")
	private String documento;
	
	@OneToOne
	@JoinColumn(name = "ID_TELEFONE")
	private String telefone;
	
}
