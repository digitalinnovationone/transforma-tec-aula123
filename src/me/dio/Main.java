package me.dio;

import me.dio.entidades.Contato;
import me.dio.entidades.Telefone;
import me.dio.entidades.Usuario;

public class Main {

	/**
	 * Onde vamos criar nossos objetos para cen�rios de teste.
	 */
	public static void main(String[] args) {
		Usuario venilton = new Usuario();
		venilton.setEmail("venilton@dio.me");
		venilton.setSenha("123456");
		
		Contato contatoJoao = new Contato();
		contatoJoao.setNome("Jo�o Silva");
		contatoJoao.getEmails().add("joao.silva@tranforma.tec");
		
		Contato contatoCassiano = new Contato();
		contatoCassiano.setNome("Cassiano");
		contatoCassiano.getTelefones().add(new Telefone(16, 999887766L));
		contatoCassiano.getTelefones().add(new Telefone(50, 999887755L));
		contatoCassiano.getEmails().add("cassiano@dio.me");
		contatoCassiano.getGrupos().add("DIO");
		
		venilton.getContatos().add(contatoJoao);
		venilton.getContatos().add(contatoCassiano);
		
		// Estrutura de repeti��o tradicional (foreach)
		for (Contato contato : venilton.getContatos()) {
			System.out.println(contato.getNome());
			for (Telefone telefone : contato.getTelefones()) {
				System.out.println(telefone.toString());
			}
		}

		// Estrutura de repeti��o com Stream API do Java
		venilton.getContatos().stream().forEach(contato -> {
			System.out.println(contato.getNome());
			contato.getTelefones().stream().map(Telefone::toString).forEach(System.out::println);
		});
	}

}
