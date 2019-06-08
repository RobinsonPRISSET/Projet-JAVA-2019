
import java.sql.SQLException;
/**import java.util.ArrayList;**/
import ResssourceProjetJava.Connexion;
import static connexionjm.ConnexionJM.connecterDB;
import java.sql.*;
/**import java.util.Scanner;**/
import java.util.*;

/**
 *
 * @author bilni
 */
public class connexionbdd {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> champs = new ArrayList();
        ArrayList<String> requete = new ArrayList();
    
        
        
        
        
        Connexion connexion;
/**Renvoyer les titre des tables**/
        try {
            connexion = new Connexion("donnee_ecole", "root", "");
            champs = connexion.remplirChampsTable("personne");
        } 
        
        
        catch(SQLException | ClassNotFoundException e2) {
            System.out.println("Erreur connexion BDD");
        }
        
        
        for(int i=0; i<champs.size(); i++){
            System.out.println(champs.get(i));
        }
        
/**Renvoyer données d'une table**/
        try {
       
            connexion = new Connexion("donnee_ecole", "root", "");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une table :");
            String str = sc.nextLine();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Veuillez saisir un id : ");
            String str1 = sc1.nextLine();
            
            requete = connexion.remplirChampsRequete("SELECT * FROM str WHERE id=str1");
        }    
        
        
        catch(SQLException | ClassNotFoundException e2) {
            System.out.println("Erreur connexion BDD");
        }
        
        
        
        for(int j=0; j<requete.size(); j++){
            System.out.println(requete.get(j));
        }
        
        
        
/**entrer des données dans une table**/
        
        try {
            connexion = new Connexion("donnee_ecole", "root", "");
            
            connexion.executeUpdate("INSERT INTO niveau (id,nom) VALUES (02,'CE1')");
            
            System.out.println("Données ajoutées!");
        }
             
        
        catch(SQLException | ClassNotFoundException e2) {
            System.out.println("Erreur connexion BDD");
        }
        

/**supprimer des données dans une table**/
        try {
            connexion = new Connexion("donnee_ecole", "root", "");
            
            connexion.executeUpdate("DELETE FROM niveau WHERE id=1 ");
            
            System.out.println("Données Supprimées!");
        }
             
        
        catch(SQLException | ClassNotFoundException e2) {
            System.out.println("Erreur connexion BDD");
        }
        
        
/**Mettre à jours des données dans une table**/  
        try {
            connexion = new Connexion("donnee_ecole", "root", "");
            
            connexion.executeUpdate("UPDATE niveau SET nom='CM2' WHERE id=2 ");
            
            System.out.println("Données Supprimées!");
        }
             
        
        catch(SQLException | ClassNotFoundException e2) {
            System.out.println("Erreur connexion BDD");
        }
        
        
        
     }
}
        
    
  
