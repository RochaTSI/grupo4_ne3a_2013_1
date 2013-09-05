/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sigmav.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sigmav.entity.Consumo;
import sigmav.entity.Fornecedor;
import sigmav.entity.Veiculo;
//import sigmav.hibernate.HDaoConsumo;
import sigmav.hibernate.HDaoVeiculo;

/**
 *
 * @author meritor
 */


public class ConsVis extends javax.swing.JDialog {

    /**
     * Creates new form ConsCad
     */
    java.awt.Frame parent;
    boolean modal;
    HDaoVeiculo daoInternoV;
    Veiculo veiculoInterno;
    Consumo consumo;
    Fornecedor localAbasticento;
    
    public ConsVis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Sigmav - Consumo:");
        setLocationRelativeTo(null);
        
        this.parent = parent;
        this.modal = modal;
    }

    public ConsVis(java.awt.Frame parent, boolean modal, Consumo consumoExterno, Veiculo veiculoExterno) {
        super(parent, modal);
        initComponents();
        setTitle("Sigmav - Consumo:");
        setLocationRelativeTo(null);
        
        
        this.parent = parent;
        this.modal = modal;
        
        this.daoInternoV = new HDaoVeiculo();
        this.consumo = consumoExterno;
        this.localAbasticento = consumoExterno.getLocal();
        this.veiculoInterno = veiculoExterno;
        
        jTextFieldCombustivel.setText(this.consumo.getCombustivel());
        jTextFieldDataAbastecimento.setText(this.consumo.getDataAbastecimento().toString());
        jTextFieldLitros.setText(String.valueOf(this.consumo.getLitros()));
        jTextFieldLocalAbastecimento.setText(this.localAbasticento.getNome());            
        jTextFieldPrecoLitro.setText(String.valueOf(this.consumo.getPreco()));
        jTextFieldQuilometragem.setText(String.valueOf(this.consumo.getQuilometragem()));
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuilometragem = new javax.swing.JTextField();
        jTextFieldDataAbastecimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLitros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrecoLitro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCombustivel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLocalAbastecimento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonFechar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Visualizar");

        jLabel2.setText("Quilometragem:");

        jTextFieldQuilometragem.setEditable(false);
        jTextFieldQuilometragem.setBackground(new java.awt.Color(192, 192, 192));
        jTextFieldQuilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuilometragemActionPerformed(evt);
            }
        });

        jTextFieldDataAbastecimento.setEditable(false);
        jTextFieldDataAbastecimento.setBackground(new java.awt.Color(192, 192, 192));
        jTextFieldDataAbastecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataAbastecimentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data abastecimento:");

        jTextFieldLitros.setEditable(false);
        jTextFieldLitros.setBackground(new java.awt.Color(192, 192, 192));
        jTextFieldLitros.setMaximumSize(new java.awt.Dimension(129, 27));
        jTextFieldLitros.setMinimumSize(new java.awt.Dimension(129, 27));
        jTextFieldLitros.setPreferredSize(new java.awt.Dimension(129, 27));
        jTextFieldLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLitrosActionPerformed(evt);
            }
        });

        jLabel4.setText("Litros:");

        jTextFieldPrecoLitro.setEditable(false);
        jTextFieldPrecoLitro.setBackground(new java.awt.Color(192, 192, 192));
        jTextFieldPrecoLitro.setMaximumSize(new java.awt.Dimension(129, 27));
        jTextFieldPrecoLitro.setMinimumSize(new java.awt.Dimension(129, 27));
        jTextFieldPrecoLitro.setPreferredSize(new java.awt.Dimension(129, 27));
        jTextFieldPrecoLitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoLitroActionPerformed(evt);
            }
        });

        jLabel5.setText("Preço por litro:");

        jTextFieldCombustivel.setEditable(false);
        jTextFieldCombustivel.setBackground(new java.awt.Color(192, 192, 192));
        jTextFieldCombustivel.setMaximumSize(new java.awt.Dimension(129, 27));
        jTextFieldCombustivel.setMinimumSize(new java.awt.Dimension(129, 27));
        jTextFieldCombustivel.setPreferredSize(new java.awt.Dimension(129, 27));
        jTextFieldCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCombustivelActionPerformed(evt);
            }
        });

        jLabel6.setText("Combustível:");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel7.setText("Local abastecimento:");

        jLabel8.setText("Nome:");

        jTextFieldLocalAbastecimento.setEditable(false);
        jTextFieldLocalAbastecimento.setBackground(new java.awt.Color(192, 192, 192));

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLocalAbastecimento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDataAbastecimento)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldLitros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrecoLitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDataAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldPrecoLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLocalAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonEditar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuilometragemActionPerformed

    private void jTextFieldDataAbastecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataAbastecimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataAbastecimentoActionPerformed

    private void jTextFieldLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLitrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLitrosActionPerformed

    private void jTextFieldPrecoLitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoLitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoLitroActionPerformed

    private void jTextFieldCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCombustivelActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
        int auxs = JOptionPane.showConfirmDialog(parent, "Deseja remover este abastecimento?", "Remover", 0, 3, null);
        
        if(auxs == 0){
            try {
                // TODO add your handling code here:
                for(int i= 0; i == this.veiculoInterno.getConsumo().size() ;i++){
                    Consumo tempo = this.veiculoInterno.getConsumo().get(i);
                    if(tempo.getId() == this.consumo.getId()){
                        this.veiculoInterno.getConsumo().remove(i);
                    }
                    
                }               
               daoInternoV.persist(this.veiculoInterno);
            } catch (SQLException ex) {
                Logger.getLogger(FornVis.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                JOptionPane.showMessageDialog(null,"Abastecimento removido com sucesso.","Remover",1, null);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Operação cancelada.","Remover",1, null);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        //this.consumo = null;
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        alteraConsumo();
        
        jTextFieldCombustivel.setText(this.consumo.getCombustivel());
        jTextFieldDataAbastecimento.setText(this.consumo.getDataAbastecimento().toString());
        jTextFieldLitros.setText(String.valueOf(this.consumo.getLitros()));
        jTextFieldLocalAbastecimento.setText(this.localAbasticento.getNome());            
        jTextFieldPrecoLitro.setText(String.valueOf(this.consumo.getPreco()));
        jTextFieldQuilometragem.setText(String.valueOf(this.consumo.getQuilometragem()));
        
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
            java.util.logging.Logger.getLogger(ConsVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsVis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsVis dialog = new ConsVis(new javax.swing.JFrame(), true);
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
    
    
    private void alteraConsumo(){
        ConsCad tConsCad = new ConsCad(this.parent, this.modal, this.veiculoInterno,this.consumo);
        tConsCad.setLocationRelativeTo(this);
        tConsCad.setResizable(false);
        tConsCad.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCombustivel;
    private javax.swing.JTextField jTextFieldDataAbastecimento;
    private javax.swing.JTextField jTextFieldLitros;
    private javax.swing.JTextField jTextFieldLocalAbastecimento;
    private javax.swing.JTextField jTextFieldPrecoLitro;
    private javax.swing.JTextField jTextFieldQuilometragem;
    // End of variables declaration//GEN-END:variables
}
