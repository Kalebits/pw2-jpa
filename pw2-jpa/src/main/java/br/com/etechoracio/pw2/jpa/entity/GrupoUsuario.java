package br.com.etechoracio.pw2.jpa.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GrupoUsuario {

	@Id
	@Column(name = "ID_GRUPO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "TX_NOME")
	private String Tx_Nome;
	
	@Column(name = "DT_INICIO_VIGENCIA")
	private LocalDateTime Dt_Inicio_Vig;
	
	@Column(name = "DT_FIM_VIGENCIA")
	private LocalDateTime Dt_Fim_Vig;
	
}
