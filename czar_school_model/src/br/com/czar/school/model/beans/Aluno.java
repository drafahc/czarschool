package br.com.czar.school.model.beans;

import java.util.List;

public class Aluno extends ClassePersistente {
	private static final long serialVersionUID = 2330296224856624384L;
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones;
	private HistoricoEscolar historicoEscolar;
	private Religiao religiao;
	private Etnia etnia;

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public HistoricoEscolar getHistoricoEscolar() {
		return historicoEscolar;
	}

	public Religiao getReligiao() {
		return religiao;
	}

	public Etnia getEtnia() {
		return etnia;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void setHistoricoEscolar(HistoricoEscolar historicoEscolar) {
		this.historicoEscolar = historicoEscolar;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}
}
