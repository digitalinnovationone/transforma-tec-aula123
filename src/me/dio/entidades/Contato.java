package me.dio.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade destinada à modelagem dos dados de Contato de um {@link Usuario}.
 * 
 * @author falvojr
 */
public class Contato {

	private String nome;
	private List<Telefone> telefones = new ArrayList<>();
	private List<String> emails = new ArrayList<>();
	private List<String> grupos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}

}
