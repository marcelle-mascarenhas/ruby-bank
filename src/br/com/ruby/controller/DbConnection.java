package br.com.ruby.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static DbConnection instance;
	Connection connection;

	public DbConnection() {

		try {
			String user = "postgres";
			String password = "123456";
			String url = "jdbc:postgresql://localhost:5432/ruby-bank";
			this.connection = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public static DbConnection getInstance() {
		if (instance == null) {
			instance = new DbConnection();
		}

		return instance;
	}

}