package br.com.etechoracio.jpa.enums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AgenteAutuador {

	@Id
	@Column(name = "ID_AGENTE_AUTUADOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_FONE")
	private String telefone;
	
	@Column(name = "TP_AGENTE")
	@Enumerated(EnumType.STRING)
	private TipoAgenteEnum tipo;
	
	@Column(name = "ST_AGENTE")
	@Enumerated(EnumType.STRING)
	private StatusAgenteEnum status;
	
	
}
