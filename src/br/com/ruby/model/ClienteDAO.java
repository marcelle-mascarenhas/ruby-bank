package br.com.ruby.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.ruby.controller.DbConnection;

public class ClienteDAO {
    
	  /**
     * CRUD
     * C: CREATE
     * R: READ
     * U: UPDATE
     * D: DELETE
     */
	
  public void save(Cliente cliente) {
	  String sql = "INSERT into cliente (nome, telefone, dataNasci, email, renda, endereco) VALUES (?,?,?,?,?,?)";

	    
	  try {
		   Connection connection;
		PreparedStatement pstm = connection.prepareStatement(sql);
		  pstm.setString(1, cliente.getNome());
		  pstm.setString(2, cliente.getTelefone());
		  pstm.setString(3, cliente.getDataNasci());
		  pstm.setString(4, cliente.getEmail());
		  pstm.setString(5, cliente.getRenda());
		 
		  
		  //executar a query
		  pstm.execute();
		  pstm.close();
		  
	  		
	  }
		  catch (SQLException ex) {
	            ex.printStackTrace();
	        }

  }
}

