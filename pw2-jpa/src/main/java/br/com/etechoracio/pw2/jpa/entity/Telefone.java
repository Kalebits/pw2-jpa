package br.com.etechoracio.pw2.jpa.entity;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Telefone {

	@Id
	@Column(name = "ID_TELEFONE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TX_AREA")
	private String area;
	
	@Column(name = "TX_NUMERO")
	private String numero;
	
}
