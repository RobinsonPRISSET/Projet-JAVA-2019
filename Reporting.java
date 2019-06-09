package RessourceProjetJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.data.general.DefaultPieDataset;
import static projet_java.connexion1.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robinson
 */
public class Reporting {
    
    private Connection conn;
    private Statement stmt;
    private ResultSet rset;
    
    public static Connection connecterDB() {
       
        try {
            // chargement driver "com.mysql.jdbc.Driver"
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Diver correct");
        
            // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
            String url = "jdbc:mysql://localhost:3306/donne_ecole";
            String user = "root";
            String password = "";
        
            //création d'une connexion JDBC à la base 
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion bien établie");
            return conn;
        }
        
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     *
     */
    public Reporting(){
        
        try {
            String query = "INSERT INTO evaluation VALUES (1,1,1,'qvbdskjvdsv')";
            String query1 = "INSERT INTO evaluation VALUES (2,2,2,'CDKVS V/')";
            String query2 = "INSERT INTO evaluation VALUES (3,3,3,'qvbMS Ddskjvdsv')";
            String query3 = "SELECT AVG note FROM evaluation";
            conn=connecterDB();
            stmt=conn.createStatement();
            stmt.executeUpdate(query);
        }
        
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
    

