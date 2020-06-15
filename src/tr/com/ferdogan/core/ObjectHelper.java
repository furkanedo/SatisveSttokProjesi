package tr.com.ferdogan.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import tr.com.ferdogan.interfaces.Corelnterfaces;

public class ObjectHelper extends CoreFields implements Corelnterfaces{
	
	private Connection connection;


	static {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				 System.out.println("Error  : "+ e);
				e.printStackTrace();
			}
		}
	

	public Connection getConnection() {
		
		 try {
			 
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satisvestok", "root", "");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return connection;
	}


	
}