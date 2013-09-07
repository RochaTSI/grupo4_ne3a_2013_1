/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sigmav.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import sigmav.entity.Veiculo;
import sigmav.hibernate.HDaoVeiculo;
import sigmav.hibernate.em.HDaoVeiculowEM;
import sigmav.hibernate.HibernatePOG;

/**
 *
 * @author meritor
 */
public class VeiVis extends javax.swing.JDialog {

    /**
     * Creates new form VeiCad
     */
    
    java.awt.Frame parent;
    boolean modal;
    HDaoVeiculo daoInterno;
    Veiculo veiculo;
    Session sessionInt;
    
    public VeiVis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Sigmav - Veiculos:");
        setLocationRelativeTo(null);
        
        this.parent = parent;
        this.modal = modal;
        
    }
    
    public VeiVis(java.awt.Frame parent, boolean modal, Veiculo veiculoExterno, Session sessionExt) {
        super(parent, modal);
        initComponents();
        setTitle("Sigmav - Veiculos:");
        setLocationRelativeTo(null);
        
        this.parent = parent;
        this.modal = modal;
        
        this.sessionInt = sessionExt;
        this.daoInterno = new HDaoVeiculo();
        this.veiculo = veiculoExterno;
        
        jTextFieldAnoModelo.setText(this.veiculo.getAnoModelo());
        jTextFieldCombustivel.setText(this.veiculo.getCombustivel());
        jTextFieldIdVeiculo.setText(String.valueOf(this.veiculo.getId()));
        jTextFieldKmCompra.setText(this.veiculo.getKmCompra());        
        jTextFieldMarca.setText(this.veiculo.getMarca());        
        jTextFieldModelo.setText(this.veiculo.getModelo());
        jTextFieldPlaca.setText(this.veiculo.getPlaca());
        jTextFieldResponsavel.setText(this.veiculo.getResponsavel());
        jTextFieldVersao.setText(this.veiculo.getVersao());
                        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdVeiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldVersao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAnoModelo = new javax.swing.JTextField();
        jTextFieldKmCompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCombustivel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonFechar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Visualizar");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(205, 289));
        jPanel1.setMinimumSize(new java.awt.Dimension(205, 289));
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 289));

        jLabel2.setText("Código do veículo:");

        jTextFieldIdVeiculo.setEditable(false);
        jTextFieldIdVeiculo.setBackground(new java.awt.Color(192, 192, 192));

        jLabel4.setText("Marca:");

        jTextFieldMarca.setEditable(false);
        jTextFieldMarca.setBackground(new java.awt.Color(192, 192, 192));

        jTextFieldVersao.setEditable(false);
        jTextFieldVersao.setBackground(new java.awt.Color(192, 192, 192));

        jLabel5.setText("Versão:");

        jLabel8.setText("Ano/Modelo:");

        jTextFieldAnoModelo.setEditable(false);
        jTextFieldAnoModelo.setBackground(new java.awt.Color(192, 192, 192));

        jTextFieldKmCompra.setEditable(false);
        jTextFieldKmCompra.setBackground(new java.awt.Color(192, 192, 192));

        jLabel11.setText("Km compra:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldIdVeiculo)
            .addComponent(jTextFieldMarca)
            .addComponent(jTextFieldVersao)
            .addComponent(jTextFieldAnoModelo)
            .addComponent(jTextFieldKmCompra)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKmCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Placa:");

        jTextFieldPlaca.setEditable(false);
        jTextFieldPlaca.setBackground(new java.awt.Color(192, 192, 192));

        jLabel6.setText("Modelo:");

        jTextFieldModelo.setEditable(false);
        jTextFieldModelo.setBackground(new java.awt.Color(192, 192, 192));

        jLabel7.setText("Combustível:");

        jTextFieldCombustivel.setEditable(false);
        jTextFieldCombustivel.setBackground(new java.awt.Color(192, 192, 192));

        jLabel9.setText("Responsável:");

        jTextFieldResponsavel.setEditable(false);
        jTextFieldResponsavel.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldPlaca)
            .addComponent(jTextFieldModelo)
            .addComponent(jTextFieldCombustivel)
            .addComponent(jTextFieldResponsavel)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jButtonFechar.setText("Fechar");
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.setToolTipText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFechar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
        int auxs = JOptionPane.showConfirmDialog(parent, "Deseja remover este veiculo?", "Remover", 0, 3, null);
        
        if(auxs == 0){
            try {
                // TODO add your handling code here:                
                daoInterno.delete(this.veiculo, sessionInt);
                this.sessionInt.flush();                
                
            } catch (SQLException ex) {
                Logger.getLogger(FornVis.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                JOptionPane.showMessageDialog(null,"Veiculo removido com sucesso.","Remover",1, null);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Operação cancelada.","Remover",1, null);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        alteraVeiculo();
        
        jTextFieldAnoModelo.setText(this.veiculo.getAnoModelo());
        jTextFieldCombustivel.setText(this.veiculo.getCombustivel());
        jTextFieldIdVeiculo.setText(String.valueOf(this.veiculo.getId()));
        jTextFieldKmCompra.setText(this.veiculo.getKmCompra());        
        jTextFieldMarca.setText(this.veiculo.getMarca());        
        jTextFieldModelo.setText(this.veiculo.getModelo());
        jTextFieldPlaca.setText(this.veiculo.getPlaca());
        jTextFieldResponsavel.setText(this.veiculo.getResponsavel());
        jTextFieldVersao.setText(this.veiculo.getVersao());
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(VeiVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VeiVis dialog = new VeiVis(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
     private void alteraVeiculo(){
        VeiCad tVeiCad = new VeiCad(this.parent, this.modal, this.veiculo, 2, sessionInt);
        tVeiCad.setLocationRelativeTo(this);
        tVeiCad.setResizable(false);
        tVeiCad.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAnoModelo;
    private javax.swing.JTextField jTextFieldCombustivel;
    private javax.swing.JTextField jTextFieldIdVeiculo;
    private javax.swing.JTextField jTextFieldKmCompra;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JTextField jTextFieldVersao;
    // End of variables declaration//GEN-END:variables
}
