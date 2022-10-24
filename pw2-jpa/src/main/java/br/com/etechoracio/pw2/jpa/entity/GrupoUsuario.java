package br.com.etechoracio.pw2.jpa.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "TBL_GRUPO_USUARIO")
public class GrupoUsuario {

	@Id
	@Column(name = "ID_GRUPO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "TX_NOME")
	private String txNome;
	
	@Column(name = "DT_INICIO_VIGENCIA")
	private LocalDateTime dtInicioVig;
	
	@Column(name = "DT_FIM_VIGENCIA")
	private LocalDateTime dtFimVig;
	
}
