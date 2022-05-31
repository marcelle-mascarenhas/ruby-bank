package br.com.ruby.model;




public class Main {


	public static void main(String[] args) {
		
		AgenciaDAO agenciaDAO = new AgenciaDAO();
		
		Agencia agencia = new Agencia();
		
		agencia.setNumeroAg("345");

		agenciaDAO.save(agencia);
		
	

	}
	

}

