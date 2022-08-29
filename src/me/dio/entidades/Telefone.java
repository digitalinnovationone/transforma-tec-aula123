package me.dio.entidades;

/**
 * Entidade sugerida para armazenar os dados telefonicos de um {@link Contato}.
 * 
 * @author falvojr
 */
public class Telefone {
	
	private int ddi = 55;
	private int ddd;
	private long numero;

	public Telefone() {
		super();
	}
	
	public Telefone(int ddd, long numero) {
		this();
		this.ddd = ddd;
		this.numero = numero;
	}

	public Telefone(int ddi, int ddd, long numero) {
		this(ddd, numero);
		this.ddi = ddi;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.format("+%d (%d) %d", this.ddi, this.ddd, this.numero);
	}
}
