package br.com.etechoracio.pw2.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "TBL_VEICULO")
public class Veiculo {
		
	
	@Id
	@Column(name = "ID_VEICULO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TX_FABRICANTE")
	private String fabricante;
	
	@Column(name = "TX_MODELO")
	private String modelo;
	
	@Column(name = "NR_ANO_FABRICACAO")
	private Integer anoFabricacao;
	
	@Column(name = "NR_ANO_MODELO")
	private Integer anoModelo;
	
	@Column(name = "VLR_PRECO")
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Proprietario proprietario;
	
	
	
	@ManyToMany
	@JoinTable(name = "TBL_REL_VEICULO_ACESSORIO", joinColumns = {@JoinColumn(name = "ID_VEICULO")}, inverseJoinColumns = {@JoinColumn(name = "ID_ACESSORIO")})
	private List<Acessorio> acessorios;
	
}
