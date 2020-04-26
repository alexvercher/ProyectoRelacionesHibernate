package es.pildoras.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionJDBC {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/bbdd_pruebashibernate?useSSL=false";
		String usuario = "root";
		String pass = "";
		
			System.out.println("Intentando conectar " + jdbcURL);
			try {
			Connection miConexion = DriverManager.getConnection(jdbcURL, usuario, pass);
			System.out.println("Conexión establecida");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
