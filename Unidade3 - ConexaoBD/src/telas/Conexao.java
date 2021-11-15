package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection con;
	private final static String URL = "jdbc:mysql://127.0.0.1:3307/acesso?useTimezone=true&serverTimezone=UTC";
	private final static String USUARIO = "uniasselvi";
	private final static String SENHA = "uniasselvi01";
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	public static Connection conectar() {
		
		System.out.println("Conectando com o banco de dados...");
		
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			System.err.println("Erro ao acessar o banco: " + e);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao carregar o driver " + e);
			e.printStackTrace();
		}
		return con;
		
	}

	
}
