package views;

import views.*;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.chambre;
import models.user;

public class Gestion_Chambres_add extends javax.swing.JFrame
{
    Index old_layout;
    Gestion_Chambres back_layout;
    boolean mode_edit = false;
    chambre element_array = null;
    
    public Gestion_Chambres_add(Index old_layout, Gestion_Chambres back_layout) {
        initComponents();
        
        this.old_layout = old_layout;
        this.back_layout = back_layout;
        
        this.mode_edit = false;
        
        element_array = new chambre();
        
        /*
        user_type.addItem("admin");
        user_type.addItem("client");
        */
    }
    
    public Gestion_Chambres_add(Index old_layout, Gestion_Chambres back_layout, boolean mode_edit, String utilisateur_id) {
        initComponents();
        
        this.old_layout = old_layout;
        this.back_layout = back_layout;
        
        this.mode_edit = mode_edit;
        this.Button_add_new_student.setText("Modifier");
        
        element_array = old_layout.db_.getchambreBychambreId(Integer.parseInt(utilisateur_id));
        
        this.chambre_nom.setText(element_array.getChambre_nom());
        this.chambre_nbr_personne.setText(element_array.getChambre_nbr_personne());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_add_new_student = new javax.swing.JButton();
        chambre_nbr_personne = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chambre_nom = new javax.swing.JTextField();
        error_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion Hotels");

        Button_add_new_student.setText("Ajouté Nouveau");
        Button_add_new_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_studentActionPerformed(evt);
            }
        });

        jLabel2.setText("nbr personne");

        jLabel5.setText("Nom");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chambre_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chambre_nbr_personne, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(Button_add_new_student)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(chambre_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(chambre_nbr_personne, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_add_new_student)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_add_new_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_new_studentActionPerformed
        if( this.chambre_nbr_personne.getText().equals("") )
        {
            this.error_message.setText("error...ecrire le nom de l'utilisateur");
        }
        else
        {
            
            
            if( this.mode_edit )
            {
                element_array.setChambre_nom(this.chambre_nom.getText());
                element_array.setChambre_nbr_personne(this.chambre_nbr_personne.getText());
                
                old_layout.db_.edit_chambre(element_array);
            }
            else
            {
                chambre new_chambre = new chambre();
                new_chambre.setChambre_id(old_layout.db_.list_chambre().size() + 1);
                new_chambre.setChambre_nom(this.chambre_nom.getText());
                new_chambre.setChambre_nbr_personne(this.chambre_nbr_personne.getText());
                
                old_layout.db_.ajouter_chambre(new_chambre);
            }
            
            back_layout.refresh_table();

            this.setVisible(false);
        }
    }//GEN-LAST:event_Button_add_new_studentActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion_Chambres_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Chambres_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Chambres_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Chambres_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Chambres_add(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_new_student;
    private javax.swing.JTextField chambre_nbr_personne;
    private javax.swing.JTextField chambre_nom;
    private javax.swing.JLabel error_message;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
