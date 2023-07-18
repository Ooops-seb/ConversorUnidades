/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import classes.VolumenConverter;
import javax.swing.JOptionPane;

/**
 *
 * @author seb_3
 */
public class Volumen extends javax.swing.JFrame {

    /**
     * Creates new form Longitud
     */
    public Volumen() {
        initComponents();
        setLocationRelativeTo(null);
        String titulo = this.getClass().getSimpleName();
        lbl_title.setText(titulo);
        cBox_UnidadOrigen.addItem("");
        for(String elemento : VolumenConverter.Unidades){
            cBox_UnidadOrigen.addItem(elemento);
        }
        cBox_UnidadDestino.addItem("");
        for(String elemento : VolumenConverter.Unidades){
            cBox_UnidadDestino.addItem(elemento);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_body = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        pnl_result = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_ValorConvertido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_EquivalenciaDestino = new javax.swing.JLabel();
        lbl_valorAConvertir = new javax.swing.JLabel();
        lbl_EquivalenciaOrigen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ValorAConvertir = new javax.swing.JTextField();
        cBox_UnidadOrigen = new javax.swing.JComboBox<>();
        cBox_UnidadDestino = new javax.swing.JComboBox<>();
        btn_convertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Longitud");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(320, 480));
        setSize(new java.awt.Dimension(320, 480));
        getContentPane().setLayout(null);

        pnl_body.setBackground(java.awt.SystemColor.controlLtHighlight);
        pnl_body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 3));
        pnl_body.setMaximumSize(new java.awt.Dimension(320, 480));
        pnl_body.setMinimumSize(new java.awt.Dimension(320, 480));
        pnl_body.setPreferredSize(new java.awt.Dimension(320, 480));
        pnl_body.setLayout(null);

        btn_back.setBackground(new java.awt.Color(255, 153, 51));
        btn_back.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("<");
        btn_back.setAlignmentX(0.5F);
        btn_back.setBorder(null);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setFocusPainted(false);
        btn_back.setFocusable(false);
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_back.setMaximumSize(new java.awt.Dimension(25, 25));
        btn_back.setMinimumSize(new java.awt.Dimension(25, 25));
        btn_back.setPreferredSize(new java.awt.Dimension(25, 25));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pnl_body.add(btn_back);
        btn_back.setBounds(0, 0, 25, 25);

        lbl_title.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl_body.add(lbl_title);
        lbl_title.setBounds(0, 30, 320, 40);

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Convertir:");
        jLabel3.setAlignmentX(0.5F);
        pnl_body.add(jLabel3);
        jLabel3.setBounds(40, 120, 70, 19);

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("De:");
        pnl_body.add(jLabel4);
        jLabel4.setBounds(40, 160, 30, 19);

        btn_limpiar.setBackground(new java.awt.Color(255, 204, 51));
        btn_limpiar.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        btn_limpiar.setForeground(java.awt.SystemColor.textHighlightText);
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.setFocusPainted(false);
        btn_limpiar.setFocusable(false);
        btn_limpiar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        pnl_body.add(btn_limpiar);
        btn_limpiar.setBounds(135, 285, 50, 20);

        pnl_result.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledSelectedBackground"));
        pnl_result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnl_result.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setText("Resultado");
        pnl_result.add(jLabel5);
        jLabel5.setBounds(80, 10, 100, 28);

        lbl_ValorConvertido.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lbl_ValorConvertido.setForeground(new java.awt.Color(51, 204, 0));
        lbl_ValorConvertido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ValorConvertido.setText("DATO");
        lbl_ValorConvertido.setToolTipText("");
        lbl_ValorConvertido.setAlignmentX(0.5F);
        pnl_result.add(lbl_ValorConvertido);
        lbl_ValorConvertido.setBounds(140, 50, 120, 28);

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("=");
        jLabel8.setAlignmentX(0.5F);
        pnl_result.add(jLabel8);
        jLabel8.setBounds(125, 50, 10, 22);

        lbl_EquivalenciaDestino.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lbl_EquivalenciaDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EquivalenciaDestino.setText("Unidades");
        lbl_EquivalenciaDestino.setAlignmentX(0.5F);
        pnl_result.add(lbl_EquivalenciaDestino);
        lbl_EquivalenciaDestino.setBounds(130, 90, 130, 19);

        lbl_valorAConvertir.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lbl_valorAConvertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_valorAConvertir.setText("DATO");
        lbl_valorAConvertir.setToolTipText("");
        lbl_valorAConvertir.setAlignmentX(0.5F);
        pnl_result.add(lbl_valorAConvertir);
        lbl_valorAConvertir.setBounds(0, 50, 120, 28);

        lbl_EquivalenciaOrigen.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lbl_EquivalenciaOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EquivalenciaOrigen.setText("Unidades");
        lbl_EquivalenciaOrigen.setAlignmentX(0.5F);
        pnl_result.add(lbl_EquivalenciaOrigen);
        lbl_EquivalenciaOrigen.setBounds(0, 90, 130, 19);

        pnl_body.add(pnl_result);
        pnl_result.setBounds(30, 320, 260, 120);
        pnl_result.hide();

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("A:");
        pnl_body.add(jLabel2);
        jLabel2.setBounds(40, 200, 30, 19);

        txt_ValorAConvertir.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_ValorAConvertir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ValorAConvertir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txt_ValorAConvertir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnl_body.add(txt_ValorAConvertir);
        txt_ValorAConvertir.setBounds(130, 117, 150, 25);

        cBox_UnidadOrigen.setBackground(new java.awt.Color(254, 254, 254));
        cBox_UnidadOrigen.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cBox_UnidadOrigen.setBorder(null);
        cBox_UnidadOrigen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cBox_UnidadOrigen.setFocusable(false);
        cBox_UnidadOrigen.setLightWeightPopupEnabled(false);
        pnl_body.add(cBox_UnidadOrigen);
        cBox_UnidadOrigen.setBounds(130, 155, 150, 25);

        cBox_UnidadDestino.setBackground(new java.awt.Color(254, 254, 254));
        cBox_UnidadDestino.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cBox_UnidadDestino.setBorder(null);
        cBox_UnidadDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cBox_UnidadDestino.setFocusable(false);
        cBox_UnidadDestino.setLightWeightPopupEnabled(false);
        pnl_body.add(cBox_UnidadDestino);
        cBox_UnidadDestino.setBounds(130, 193, 150, 25);

        btn_convertir.setBackground(new java.awt.Color(102, 204, 0));
        btn_convertir.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_convertir.setForeground(java.awt.SystemColor.textHighlightText);
        btn_convertir.setText("Convertir");
        btn_convertir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_convertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_convertir.setFocusPainted(false);
        btn_convertir.setFocusable(false);
        btn_convertir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convertirActionPerformed(evt);
            }
        });
        pnl_body.add(btn_convertir);
        btn_convertir.setBounds(110, 250, 100, 30);

        getContentPane().add(pnl_body);
        pnl_body.setBounds(0, 0, 320, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Index main =  new Index();
        main.show();
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        this.dispose();
        Volumen main = new Volumen();
        main.show();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convertirActionPerformed
        try {
            if(txt_ValorAConvertir.getText().isEmpty()){
                throw new IllegalArgumentException("El campo está vacío");
            }
            double valor =  Double.parseDouble(txt_ValorAConvertir.getText());
            String unidadOrigen = cBox_UnidadOrigen.getSelectedItem().toString();
            String unidadFinal = cBox_UnidadDestino.getSelectedItem().toString();
            VolumenConverter conversor = new VolumenConverter(unidadOrigen, unidadFinal);

            conversor.convertirUnidades(valor);

            lbl_valorAConvertir.setText(Double.toString(conversor.valorOrigen));
            lbl_ValorConvertido.setText(Double.toString(Math.round(conversor.valorFinal)));

            lbl_EquivalenciaOrigen.setText(conversor.unidadOrigen);
            lbl_EquivalenciaDestino.setText(conversor.unidadFinal);

            pnl_result.show();
        }        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de número inválido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException | ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_convertirActionPerformed

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
            java.util.logging.Logger.getLogger(Volumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_convertir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cBox_UnidadDestino;
    private javax.swing.JComboBox<String> cBox_UnidadOrigen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_EquivalenciaDestino;
    private javax.swing.JLabel lbl_EquivalenciaOrigen;
    private javax.swing.JLabel lbl_ValorConvertido;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_valorAConvertir;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_result;
    private javax.swing.JTextField txt_ValorAConvertir;
    // End of variables declaration//GEN-END:variables
}
