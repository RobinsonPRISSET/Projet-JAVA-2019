/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;


import java.sql.*;
import java.util.*;
import java.sql.SQLException;
import ResssourceProjetJava.Connexion;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Quentin
 */


public class essai {
    
 static Connection cnx;
 static Statement st;
 static ResultSet rst;
    
     public static Connection  connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver correct");
            String url="jdbc:mysql://localhost:3306/donnee_ecole";
            String user="root";
            String password="";
           Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établié");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
   
    public static void AjouterPersonne(String selection, String id,String nom,String prénom,String type){
        try{
            
            String query="INSERT INTO "+selection+" VALUES('"+id+"','"+nom+"','"+prénom+"','"+type+"') ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    
    public static void AjouterTrimestre(String selection, String id,String numéro,String début,String fin){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+numéro+"','"+début+"','"+fin+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    
    
    public static void AjouterNiveau(String selection, String id,String nom){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+nom+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterClasse(String selection, String id,String nom){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+nom+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterDiscipline(String selection, String id,String nom){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+nom+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterEnseignement(String selection, String id){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+")";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterInscription(String selection, String id){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+")";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterBulletin(String selection, String id,String appréciation){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+appréciation+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterDetailBultin(String selection, String id,String appréciation){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+appréciation+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterEvaluation(String selection, String id,String note,String appréciation){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+note+"','"+appréciation+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterEcole(String selection, String id,String nom){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+",'"+nom+"')";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void AjouterAnneeScolaire(String selection, String id){
        try{
            
            String query="INSERT INTO "+selection+" VALUES("+id+")";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void ModifierPersonne(String selection, String id,String nom,String prénom,String type){
       try{
           String query="UPDATE "+selection+" SET nom='"+nom+"', prénom='"+prénom+"', type='"+type+"' WHERE id='"+id+"'";
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Donnéés bien modifiées");
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       
     }
    
    
    public static void ModifierTrimestre(String selection, String id,String numéro,String début,String fin){
        try{
            
            String query="UPDATE "+selection+" SET numéro='"+numéro+"',début='"+début+"',fin='"+fin+"'WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    
    
    public static void ModifierNiveau(String selection, String id,String nom){
        try{
            
            String query="UPDATE "+selection+" SET nom='"+nom+"'WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierClasse(String selection, String id,String nom){
        try{
            
            String query="UPDATE "+selection+" SET nom='"+nom+"'WHERE id='"+id+"' ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierDiscipline(String selection, String id,String nom){
        try{
            
            String query="UPDATE "+selection+" SET='"+nom+"'WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierEnseignement(String selection, String id){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" WHERE id='"+id+"' ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierInscription(String selection, String id){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierBulletin(String selection, String id,String appréciation){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" appréciation='"+appréciation+"'WHERE id='"+id+"' ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierDetailBultin(String selection, String id,String appréciation){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" appréciation='"+appréciation+"'WHERE id='"+id+"' ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierEvaluation(String selection, String id,String note,String appréciation){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" note='"+note+"' appréciation='"+appréciation+"'WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierEcole(String selection, String id,String nom){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" nom='"+nom+"'WHERE id='"+id+"' ";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    public static void ModifierAnneeScolaire(String selection, String id){
        try{
            
            String query="UPDATE "+selection+" SET id="+id+" WHERE id='"+id+"'";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Données bien ajoutées !");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
       
       
       
       
    public static void SupprimerParID(String selection, String id){
        try{
           String query="DELETE FROM "+selection+" WHERE id="+id+""; 
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Personne bien supprimé");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
       
     }
    
    
    
     
      public static void recherche(String selection){
        try{
           String query="SELECT * FROM "+selection+" "; 
           cnx=connecterDB();
           st=cnx.createStatement();
           rst= st.executeQuery(query);
          
           PreparedStatement ps=cnx.prepareStatement(query );
           /**rst.last();
           int nbrRow = rst.getRow();
           if(nbrRow!=0){
               System.out.println("Produit trouve");
           }else{
                System.out.println("Produit non trouve");
           }**/
          while(rst.next())
          {
          System.out.print(rst.getString("id")+"\t");
          System.out.print(rst.getString("nom")+"\t");
          System.out.print(rst.getString("prénom")+"\t");
          System.out.print(rst.getString("type")+"\t");
          System.out.println();
          }
          
          
          /**ps.setString(1, JfieldText1.getText());
          rst=ps.executeQuery();
          Jtable1.setModel(DbUtils.resultSetToTableModel(rst));**/
           
          
          
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
     
   

     
     
    
}
