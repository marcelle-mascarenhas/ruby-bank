package br.com.ruby.model;

public class ContaCorrente extends Conta implements Pix {

	static final float TAXA_MANUTENCAO = 0.01f;

	public ContaCorrente(String numeroAg, String numeroConta, String dataAbertura) {
		super(numeroAg, numeroConta, dataAbertura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	  public void cadastrarChave() {
	    //selecionar tipo de chave que deseja cadastrar;
	    //inserir valor da chave de acordo com o tipo escolhido;
	    //salvar
	    
	  }

	  @Override
	  public void exibirChavesCadastradas() {
	    // Buscar se existem chaves cadastradas, se sim, retornar tipos e valores das chaves
	    
	  }

	  @Override
	  public void gerarChaveAleatoria() {
	    // random de 32 dígitos contendo números e letras
	    
	  }

	  @Override
	  public void transferir() {
	    //inserir valor que deseja pagar;
	    //inserir chave da conta destino ou seleciona opcao ler QR CODE para acessar camera do dispositivo;
	    //insere senha para concluir transação
	  }

	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		if (contaDestino instanceof ContaPoupanca) {
			this.sacar(valorTransferido + (valorTransferido * Conta.TAXA_ADM));
			contaDestino.depositar(valorTransferido);
		} else if (contaDestino instanceof ContaCorrente) {
			this.sacar(valorTransferido + (valorTransferido * Conta.TAXA_ADM));
			contaDestino.depositar(valorTransferido);
		} else {
			this.sacar(valorTransferido + (valorTransferido * Conta.TAXA_ADM));
			contaDestino.depositar(valorTransferido);
		}

	}

}