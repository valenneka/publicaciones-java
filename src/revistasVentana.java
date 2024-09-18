
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author valen
 */
public class revistasVentana extends javax.swing.JDialog {

    
    ArrayList<revistas> lista = new ArrayList();

    public revistasVentana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prestadoCheck = new javax.swing.JCheckBox();
        tituloTxt = new javax.swing.JTextField();
        creacionTxt = new javax.swing.JTextField();
        tipoTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        verRevistasVentana = new javax.swing.JButton();
        modificarRevistasVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Revistas");

        jLabel2.setText("Titulo");

        jLabel3.setText("Año creacion");

        jLabel4.setText("Tipo");

        jLabel6.setText("Prestado");

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        verRevistasVentana.setText("VER REVISTAS");
        verRevistasVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRevistasVentanaActionPerformed(evt);
            }
        });

        modificarRevistasVentana.setText("MODIFICAR REVISTAS");
        modificarRevistasVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRevistasVentanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(creacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prestadoCheck)))
                                .addGap(73, 73, 73)
                                .addComponent(modificarRevistasVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(verRevistasVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(guardarBtn)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verRevistasVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(modificarRevistasVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(creacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prestadoCheck)
                            .addComponent(jLabel6))))
                .addGap(16, 16, 16)
                .addComponent(guardarBtn)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        try {
            revistas objeto = new revistas();
            objeto.setAnioCreacion(creacionTxt.getText());
            objeto.setTitulo(tituloTxt.getText());
            objeto.setTipo(tipoTxt.getText());
            objeto.setPrestada(prestadoCheck.isSelected());
            lista.add(objeto);
            JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en el ingreso de algun dato!");
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void verRevistasVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRevistasVentanaActionPerformed
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isPrestada() == true) {
                String texto = "Titulo: " + lista.get(i).getTitulo() + "\nTipo: " + lista.get(i).getTipo() + "\nAño de Creacion: " + lista.get(i).getAnioCreacion() + "\nPrestado: Si";
                JOptionPane.showMessageDialog(null, texto);
            } else {
                String texto = "Titulo: " + lista.get(i).getTitulo() + "\nTipo: " + lista.get(i).getTipo() + "\nAño de Creacion: " + lista.get(i).getAnioCreacion() + "\nPrestado: No";
                JOptionPane.showMessageDialog(null, texto);
            }
        }

    }//GEN-LAST:event_verRevistasVentanaActionPerformed

    private void modificarRevistasVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRevistasVentanaActionPerformed
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (tituloTxt.getText().equals(lista.get(i).getTitulo())) {
                lista.get(i).setAnioCreacion(creacionTxt.getText());
                lista.get(i).setTitulo(tituloTxt.getText());
                lista.get(i).setTipo(tipoTxt.getText());
                lista.get(i).setPrestada(prestadoCheck.isSelected());
                JOptionPane.showMessageDialog(null, "Los datos fueron modificados correctamente!");

            } else {
                JOptionPane.showMessageDialog(null, "Esa revista no existe!");
            }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en el ingreso de algun dato!");
        }
    }//GEN-LAST:event_modificarRevistasVentanaActionPerformed

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
            java.util.logging.Logger.getLogger(librosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(librosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(librosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(librosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                librosVentana dialog = new librosVentana(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creacionTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton modificarRevistasVentana;
    private javax.swing.JCheckBox prestadoCheck;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JTextField tituloTxt;
    private javax.swing.JButton verRevistasVentana;
    // End of variables declaration//GEN-END:variables
}
