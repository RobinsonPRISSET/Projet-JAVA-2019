/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;



import ResssourceProjetJava.Connexion;
import java.sql.*;
import javax.swing.*;
import java.lang.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author Quentin
 */
public class maj extends javax.swing.JFrame {

    /**
     * Creates new form maj
     */
    public maj() {
        initComponents();
        setTitle("Gestion d'une Ecole");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        evaluation = new javax.swing.JTextField();
        niveau = new javax.swing.JTextField();
        bulletin = new javax.swing.JTextField();
        classe = new javax.swing.JTextField();
        discipline = new javax.swing.JTextField();
        personne = new javax.swing.JTextField();
        enseignement = new javax.swing.JTextField();
        inscription = new javax.swing.JTextField();
        détailbulletin = new javax.swing.JTextField();
        trimestre = new javax.swing.JTextField();
        annéescolaire = new javax.swing.JTextField();
        ecole = new javax.swing.JTextField();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Page de Mise à Jour");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(610, 740, 178, 25);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton1.setText("Retour page principale");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(1130, 730, 233, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Sélectionner une table:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 270, 207, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecole", "Année Scolaire", "Trimestre", "Niveau", "Classe", "Discipline", "Personne", "Enseignement", "Inscription", "Bulletin", "Détail Bulletin", "Evaluation" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(310, 270, 159, 28);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton2.setText("Rechercher");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(540, 270, 131, 33);

        jTextField1.setText("Id");
        jTextField1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextField1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 370, 124, 26);

        jTextField2.setText("Numéro");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(540, 370, 154, 26);

        jTextField3.setText("Début");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 410, 154, 26);

        jTextField4.setText("Fin");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(540, 440, 154, 26);

        jTextField5.setText("Nom");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(410, 370, 129, 26);

        jTextField6.setText("Prénom");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(410, 410, 129, 26);

        jTextField8.setText("Appréciation");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(410, 470, 129, 26);

        jTextField9.setText("Note");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(540, 470, 154, 26);

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton3.setText("Ajouter");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(470, 550, 97, 33);

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton4.setText("Supprimer");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(620, 550, 123, 33);

        jToggleButton5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton5.setText("Modifier");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(800, 550, 103, 33);

        jTextField7.setText("Type");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(410, 440, 129, 26);

        jLabel2.setText("Suppression et modification par Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 760, 244, 20);

        evaluation.setText("Id.Evaluation");
        getContentPane().add(evaluation);
        evaluation.setBounds(1080, 440, 127, 26);

        niveau.setText("Id.Niveau");
        niveau.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                niveauAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(niveau);
        niveau.setBounds(710, 410, 126, 26);

        bulletin.setText("Id.Bulletin");
        getContentPane().add(bulletin);
        bulletin.setBounds(940, 440, 127, 26);

        classe.setText("Id.Classe");
        classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeActionPerformed(evt);
            }
        });
        getContentPane().add(classe);
        classe.setBounds(840, 370, 93, 26);

        discipline.setText("Id.Discipline");
        getContentPane().add(discipline);
        discipline.setBounds(840, 440, 93, 26);

        personne.setText("Id.Personne");
        getContentPane().add(personne);
        personne.setBounds(840, 410, 93, 26);

        enseignement.setText("Id.Enseignement");
        enseignement.setToolTipText("");
        getContentPane().add(enseignement);
        enseignement.setBounds(1080, 370, 127, 26);

        inscription.setText("Id.Inscription");
        getContentPane().add(inscription);
        inscription.setBounds(940, 410, 127, 26);

        détailbulletin.setText("Id.DétailBulletin");
        getContentPane().add(détailbulletin);
        détailbulletin.setBounds(1080, 410, 127, 26);

        trimestre.setText("Id.Trimestre");
        trimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trimestreActionPerformed(evt);
            }
        });
        getContentPane().add(trimestre);
        trimestre.setBounds(940, 370, 127, 26);

        annéescolaire.setText("Id.AnnéeScolaire");
        annéescolaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annéescolaireActionPerformed(evt);
            }
        });
        getContentPane().add(annéescolaire);
        annéescolaire.setBounds(710, 440, 126, 26);

        ecole.setText("Id.Ecole");
        getContentPane().add(ecole);
        ecole.setBounds(710, 370, 126, 26);

        jToggleButton6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jToggleButton6.setText("Réinitialiser");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(1130, 680, 233, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_java/ece.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-30, 0, 1460, 790);

        setSize(new java.awt.Dimension(1402, 845));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
 principale2 f=new principale2();
f.setVisible(true);
this.hide(); 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            
            
            
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        String selection=jComboBox1.getSelectedItem().toString();
        
        
       
        
        
         if(selection=="Ecole")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);
            
            
            }
            if(selection=="Année Scolaire")
            {
            jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);
            }
            
            
            
            if(selection=="Trimestre")
            {
            jTextField7.setVisible(false);
            
            
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            
            trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            
            }
            
            
            if(selection=="Niveau")
            {
            jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}
            
            if(selection=="Classe")
            {
            jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
            trimestre.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            }
            if(selection=="Discipline")
            {
            jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}
            
            if(selection=="Personne")
            {
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
          
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}

            if(selection=="Enseignement")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}
            
            if(selection=="Inscription")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField8.setVisible(false);
            jTextField9.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
           
            discipline.setVisible(false);
            
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}
            
            if(selection=="Bulletin")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField9.setVisible(false);
             
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            bulletin.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);}
            
            if(selection=="Détail Bulletin")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
            jTextField9.setVisible(false); 
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            inscription.setVisible(false);
            détailbulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);
            }
            
            if(selection=="Evaluation")
            {jTextField7.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(false);
             trimestre.setVisible(false);
            niveau.setVisible(false);
            classe.setVisible(false);
            discipline.setVisible(false);
            personne.setVisible(false);
            enseignement.setVisible(false);
            inscription.setVisible(false);
            bulletin.setVisible(false);
            evaluation.setVisible(false);
            ecole.setVisible(false);
            annéescolaire.setVisible(false);
            }            
            
            
        
        
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        
        
      
            String selection=jComboBox1.getSelectedItem().toString();
            
            String text1=jTextField1.getText();
            String text2=jTextField2.getText();
            String text3=jTextField3.getText();
            String text4=jTextField4.getText();
            String text5=jTextField5.getText();
            String text6=jTextField6.getText();
            String text7=jTextField7.getText();
            String text8=jTextField8.getText();
            String text9=jTextField9.getText();
           
       
          
        if(selection=="Personne")
        {
            essai.AjouterPersonne(selection, text1, text5, text6, text7);
        }
        
        if(selection=="Trimestre")
        {
            essai.AjouterTrimestre( selection,  text1, text2, text3, text4);      
        }
     
        if(selection=="Niveau")
        {
            essai.AjouterNiveau(selection, text1, text5);
        }
        
        if(selection=="Classe")
        {
            essai.AjouterClasse( selection,  text1, text5) ;  
        }
        
        if(selection=="Discipline")
        {
            essai.AjouterDiscipline( selection,  text1, text5); 
        }
        
        if(selection=="Enseignement")
        {
            essai.AjouterEnseignement( selection,  text1);
        }
        
        if(selection=="Inscription")
        {
            essai.AjouterInscription( selection,  text1);        }
        
        if(selection=="Bulletin")
        {
            essai.AjouterBulletin( selection,  text1, text8);        }
        
        if(selection=="Détail Bulletin")
        {
            essai.AjouterDetailBultin( selection,  text1, text8) ; 
        }
        
        if(selection=="Evaluation")
        {
            essai.AjouterEvaluation( selection, text1, text9,text8); 
        }
        
        if(selection=="Ecole")
        {
            essai.AjouterEcole( selection,  text1, text5);
        }
        
        if(selection=="Année Scolaire")
        {
            essai.AjouterAnneeScolaire( selection,  text1);        
        }
        
     
        
        
        
       
        
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        
        String selection=jComboBox1.getSelectedItem().toString();
          
         String text1=jTextField1.getText();
            String text2=jTextField2.getText();
            String text3=jTextField3.getText();
            String text4=jTextField4.getText();
            String text5=jTextField5.getText();
            String text6=jTextField6.getText();
            String text7=jTextField7.getText();
            String text8=jTextField8.getText();
            String text9=jTextField9.getText();
            
    
        
        
         if(selection=="Personne")
        {
            essai.ModifierPersonne(selection, text1, text5, text6, text7);
        }
        
        if(selection=="Trimestre")
        {
            essai.ModifierTrimestre( selection,  text1, text2, text3, text4);      
        }
     
        if(selection=="Niveau")
        {
            essai.ModifierNiveau(selection, text1, text5);
        }
        
        if(selection=="Classe")
        {
            essai.ModifierClasse( selection,  text1, text5) ;  
        }
        
        if(selection=="Discipline")
        {
            essai.ModifierDiscipline( selection,  text1, text5); 
        }
        
        if(selection=="Enseignement")
        {
            essai.ModifierEnseignement( selection,  text1);
        }
        
        if(selection=="Inscription")
        {
            essai.ModifierInscription( selection,  text1);        }
        
        if(selection=="Bulletin")
        {
            essai.ModifierBulletin( selection,  text1, text8);        }
        
        if(selection=="Détail Bulletin")
        {
            essai.ModifierDetailBultin( selection,  text1, text8) ; 
        }
        
        if(selection=="Evaluation")
        {
            essai.ModifierEvaluation( selection, text1, text9,text8); 
        }
        
        if(selection=="Ecole")
        {
            essai.ModifierEcole( selection,  text1, text5);
        }
        
        if(selection=="Année Scolaire")
        {
            essai.ModifierAnneeScolaire( selection,  text1);        
        }
        
        
        
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextField1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1AncestorAdded

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        String selection=jComboBox1.getSelectedItem().toString();
            
            String text1=jTextField1.getText();
            String text8=jTextField5.getText();
            String text9=jTextField6.getText();
            String text2=jTextField7.getText();
           
            System.out.println(text1);
            System.out.println(text8);
            System.out.println(text9);
            System.out.println(text2);
          
        
       essai.SupprimerParID(selection, text1);
        
        
        
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void niveauAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_niveauAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauAncestorAdded

    private void classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classeActionPerformed

    private void trimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trimestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trimestreActionPerformed

    private void annéescolaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annéescolaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annéescolaireActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
         maj f=new maj();
f.setVisible(true);
this.hide(); 
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(maj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maj().setVisible(true);
                
            }
        });
        
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annéescolaire;
    private javax.swing.JTextField bulletin;
    private javax.swing.JTextField classe;
    private javax.swing.JTextField discipline;
    private javax.swing.JTextField détailbulletin;
    private javax.swing.JTextField ecole;
    private javax.swing.JTextField enseignement;
    private javax.swing.JTextField evaluation;
    private javax.swing.JTextField inscription;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JTextField niveau;
    private javax.swing.JTextField personne;
    private javax.swing.JTextField trimestre;
    // End of variables declaration//GEN-END:variables
}

