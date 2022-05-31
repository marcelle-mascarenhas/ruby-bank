package br.com.ruby.model;

public class Cliente {

	   private String nome;
	   private String telefone;
	   private String dataNasci;
	   private String email;
	   private String renda;
	   private Endereco endereco;
	   
	    // construtor
	  
//nome
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome; 
	    }
	    
	    
//telefone
	    
	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }
	    
//Data de Nascimento
	    
	    public String getDataNasci() {
	        return dataNasci;
	    }

	    public void setDataNasci(String data) {
	        this.dataNasci = data;
	    }


//email
	    
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

//renda
	    public String getRenda() {
	        return renda;
	    }

	    public void setRenda(String renda) {
	        this.renda = renda;
	    }
//endereço
	    
	    public Endereco getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(Endereco endereco) {
	        this.endereco = endereco;
	        
	    }

		@Override
		public String toString() {
			return "Cliente [nome=" + nome + ", telefone=" + telefone + 
					", dataNasci=" + dataNasci + ", email=" + email
					+ ", renda=" + renda + ", endereco=" + endereco + "]";
		}
	    
   
}
	