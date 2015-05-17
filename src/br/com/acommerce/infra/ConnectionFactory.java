package br.com.acommerce.infra;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3307/acommerce", "root", "1234");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
