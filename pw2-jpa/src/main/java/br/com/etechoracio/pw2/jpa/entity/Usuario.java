package br.com.etechoracio.pw2.jpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Usuario {

	@Id
	@Column(name = "ID_GRUPO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "TX_NOME")
	private String Tx_Nome;
	
	@Column(name = "TX_SENHA")
	private String Tx_Senha;
	
	
	@Column(name = "DT_INATIVACAO")
	private LocalDateTime Dt_Inativacao;
	
	@ManyToMany
	@JoinTable(name = "TBL_GRUPO_USUARIO", joinColumns = {@JoinColumn(name = "ID_USUARIO")}, inverseJoinColumns = {@JoinColumn(name = "ID_GRUPO_USUARIO")})
	private List<GrupoUsuario> grupoUsuarios;
	
}
