package br.com.ruby.model;

public class ClientePessoaJuridica extends Cliente {
	
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String CNPJ) {
        this.cnpj = CNPJ;
    }
}

