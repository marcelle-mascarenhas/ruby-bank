package br.com.ruby.model;

import br.com.ruby.controller.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgenciaDAO {
	
	  /**
     * CRUD
     * C: CREATE
     * R: READ
     * U: UPDATE
     * D: DELETE
     */
	
  public void save(Agencia agencia) {
	  String sql = "INSERT into agencias (numeroAg) VALUES (?)";
	  DbConnection conn = null;
	  PreparedStatement pstm = null;
	  
	  try {
		  //criar uma conexão com o banco de dados
		  conn = DbConnection.getInstance();	
		  //criamos um prepareStatement para executar uma query
		  pstm = (PreparedStatement) ((Connection) conn).prepareStatement(sql);
		  pstm.setString(1, agencia.getNumeroAg());
		  //executar a query
		  pstm.execute();
		  
	  		
	  }
		  catch (SQLException ex) {
	            ex.printStackTrace();
	        }

  }
}


	