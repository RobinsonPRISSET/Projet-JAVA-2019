package connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pierre-Louis
 */
public class Myconnection {
    private static Connection con;

	public Myconnection(String user, String password) throws SQLException
	{
            try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/donnee_ecole", user, password); /*on récupère l'username et le wordpass permettant une connexion à la base de donnée*/
	} catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
            
        }

	public static Connection getConnection(){
		return con;

	}
}
    
    /*
    public static Connection getConnection()
    {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/donnee_ecole","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
        
    } */   


