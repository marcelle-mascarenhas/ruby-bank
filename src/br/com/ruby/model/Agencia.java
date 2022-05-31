package br.com.ruby.model;

public class Agencia {
	protected String numeroAg;

	public Agencia() {
		super();
		this.numeroAg = numeroAg;
	}

	public String getNumeroAg() {
		return numeroAg;
	}

	public void setNumeroAg(String numeroAg) {
		this.numeroAg = numeroAg;
	}

	@Override
	public String toString() {
		return "Agencia [numeroAg=" + numeroAg + "]";
	}

}
