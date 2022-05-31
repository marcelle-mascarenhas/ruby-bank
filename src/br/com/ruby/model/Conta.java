package br.com.ruby.model;

public abstract class Conta extends Agencia {
	private String numeroConta;
	private float saldo;
	private boolean status;
	private String dataAbertura;

	static final float TAXA_ADM = 0.02f;

	public Conta(String numeroAg, String numeroConta, String dataAbertura) {
		super(numeroAg);
		this.numeroConta = numeroConta;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta [numeroAg=" + numeroAg + "; numeroConta=" + numeroConta + ", "
				+ "saldo=" + saldo + ", status="
				+ status + ", dataAbertura=" + dataAbertura + "]";
	}

	// se saldo > 0, valor é depositado
	public void depositar(float valorDeposito) {
		if (this.status == true && valorDeposito > 0) {
			this.saldo = saldo + valorDeposito;
		}
	}

	// desativando conta
	public void desativarConta() {
		this.status = false;
	}

	// saque (retirando o dinheiro da conta e calculando o saldo atual)
	public void sacar(float valorSaque) {
		if (this.saldo >= valorSaque && valorSaque> 0 && this.status == true) {
			this.saldo = this.saldo - valorSaque;
		}
	}

	// saldo atual
	public float getSaldo() {
		return this.saldo;
	}

	// transferencia
	public abstract void transferencia(Conta contaDestino, float valorTransferido);
}
