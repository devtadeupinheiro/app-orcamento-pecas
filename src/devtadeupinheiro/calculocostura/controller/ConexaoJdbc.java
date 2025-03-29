package devtadeupinheiro.calculocostura.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJdbc {
	
	private Connection con = null;
	
	private String nomeHost = null;
	private String usuario = null;
	private String senha = null;
	private String url = null;
	private String jdbcDriver = null;
	private String nomeBanco = null;
	private String prefixBanco = null;
	private String portaBanco = null;
	private String outrasConfiguracoes = null;
	
	public ConexaoJdbc () {
		
		nomeHost = "localhost";
		usuario = "postgres";
		senha = "Eusei2202@";
		jdbcDriver = "org.postgresql.Driver";
		nomeBanco = "app-orcamento";
		prefixBanco = "jdbc:postgresql://";
		portaBanco = "5432/";
		
		url = prefixBanco + nomeHost + ":" + portaBanco + nomeBanco;
		
	}

	
	/*
	 * Verifica se a conex�o � nula, se n�o for, ele torna ela nula e chama novamente a si pr�prio (m�todo recursivo).
	 */
	
	public Connection getConnection() {
		
		try {
			
			if (con == null) {
				
				Class.forName(jdbcDriver);
				con = DriverManager.getConnection(url, usuario, senha);
				
			} else if (con.isClosed()){
				
				con = null;
				return getConnection();
				
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			//Colocar sistema de log
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			//colocar sistema de log
			
		}
		
		return con;
	}
	
	public void closeConnection () {
		
		if (con != null)  {
			
			try {
				
				con.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
				//Colocar sistema de log
			}
			
		}
		
	}
}
