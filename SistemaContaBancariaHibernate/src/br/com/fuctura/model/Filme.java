package br.com.fuctura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_FILME")
@NamedQueries({
	@NamedQuery(name = "Filme.findyByClassificacao",
			query = "select f from Filme f where f.classificacao = :class")
})
public class Filme {
    
	@Id
	private String linkYT;
	@Column(length = 100)
	private String nome;
	private double duracao;
	private int classificacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public String getLinkYT() {
		return linkYT;
	}
	public void setLinkYT(String linkYT) {
		this.linkYT = linkYT;
	}
	
	
	
	
	
	
}
