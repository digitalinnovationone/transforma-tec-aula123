package me.dio.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade que representa os usuários da nossa Agenda de Contatos. 
 * Possui os dados de acesso (email e senha) e a lista de {@link Contato}.
 * 
 * @author falvojr
 */
public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private List<Contato> contatos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
