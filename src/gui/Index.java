package gui;

public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        pnl_body = new javax.swing.JPanel();
        btn_longitud = new javax.swing.JButton();
        btn_tiempo = new javax.swing.JButton();
        btn_temperatura = new javax.swing.JButton();
        btn_area = new javax.swing.JButton();
        btn_volumen = new javax.swing.JButton();
        btn_masa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Unidades");
        setMaximumSize(new java.awt.Dimension(320, 480));
        setName("Frm_Index"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(320, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 480));
        getContentPane().setLayout(null);

        pnl_header.setBackground(new java.awt.Color(69, 25, 82));
        pnl_header.setMaximumSize(new java.awt.Dimension(320, 100));
        pnl_header.setMinimumSize(new java.awt.Dimension(320, 100));
        pnl_header.setPreferredSize(new java.awt.Dimension(320, 100));
        pnl_header.setLayout(null);

        lbl_title.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Conversor de unidades");
        pnl_header.add(lbl_title);
        lbl_title.setBounds(15, 30, 290, 40);

        btn_close.setBackground(new java.awt.Color(245, 9, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setAlignmentX(0.5F);
        btn_close.setBorder(null);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusPainted(false);
        btn_close.setFocusable(false);
        btn_close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_close.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_close.setMaximumSize(new java.awt.Dimension(25, 25));
        btn_close.setMinimumSize(new java.awt.Dimension(25, 25));
        btn_close.setPreferredSize(new java.awt.Dimension(25, 25));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        pnl_header.add(btn_close);
        btn_close.setBounds(295, 0, 25, 25);

        getContentPane().add(pnl_header);
        pnl_header.setBounds(0, 0, 320, 100);

        pnl_body.setBackground(new java.awt.Color(255, 255, 255));
        pnl_body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 25, 82), 3));
        pnl_body.setMaximumSize(new java.awt.Dimension(320, 400));
        pnl_body.setMinimumSize(new java.awt.Dimension(320, 400));
        pnl_body.setLayout(null);

        btn_longitud.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_longitud.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_longitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/meter.png"))); // NOI18N
        btn_longitud.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 2, true), "Longitud", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_longitud.setFocusPainted(false);
        btn_longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_longitudActionPerformed(evt);
            }
        });
        pnl_body.add(btn_longitud);
        btn_longitud.setBounds(40, 20, 100, 100);

        btn_tiempo.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_tiempo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/time.png"))); // NOI18N
        btn_tiempo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 2, true), "Tiempo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_tiempo.setFocusPainted(false);
        btn_tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tiempoActionPerformed(evt);
            }
        });
        pnl_body.add(btn_tiempo);
        btn_tiempo.setBounds(40, 140, 100, 100);

        btn_temperatura.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_temperatura.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_temperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/temperature.png"))); // NOI18N
        btn_temperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 2, true), "Temperatura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_temperatura.setFocusPainted(false);
        btn_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temperaturaActionPerformed(evt);
            }
        });
        pnl_body.add(btn_temperatura);
        btn_temperatura.setBounds(180, 140, 100, 100);

        btn_area.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_area.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/area.png"))); // NOI18N
        btn_area.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true), "Area", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_area.setFocusPainted(false);
        btn_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_areaActionPerformed(evt);
            }
        });
        pnl_body.add(btn_area);
        btn_area.setBounds(40, 260, 100, 100);

        btn_volumen.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_volumen.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_volumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/volume.png"))); // NOI18N
        btn_volumen.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 2, true), "Volumen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_volumen.setFocusPainted(false);
        btn_volumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volumenActionPerformed(evt);
            }
        });
        pnl_body.add(btn_volumen);
        btn_volumen.setBounds(180, 260, 100, 100);

        btn_masa.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btn_masa.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_masa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mass.png"))); // NOI18N
        btn_masa.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true), "Masa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 1, 14))); // NOI18N
        btn_masa.setFocusPainted(false);
        btn_masa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masaActionPerformed(evt);
            }
        });
        pnl_body.add(btn_masa);
        btn_masa.setBounds(180, 20, 100, 100);

        getContentPane().add(pnl_body);
        pnl_body.setBounds(0, 100, 320, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_longitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_longitudActionPerformed
        Longitud frame = new Longitud();
        frame.show();
        this.dispose();
    }//GEN-LAST:event_btn_longitudActionPerformed

    private void btn_masaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masaActionPerformed
        Masa masa = new Masa();
        masa.show();
        this.dispose();
    }//GEN-LAST:event_btn_masaActionPerformed

    private void btn_tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tiempoActionPerformed
        Tiempo tiempo = new Tiempo();
        tiempo.show();
        this.dispose();
    }//GEN-LAST:event_btn_tiempoActionPerformed

    private void btn_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temperaturaActionPerformed
        Temperatura temperatura = new Temperatura();
        temperatura.show();
        this.dispose();
    }//GEN-LAST:event_btn_temperaturaActionPerformed

    private void btn_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_areaActionPerformed
        Area area = new Area();
        area.show();
        this.dispose();
    }//GEN-LAST:event_btn_areaActionPerformed

    private void btn_volumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volumenActionPerformed
        Volumen volumen = new Volumen();
        volumen.show();
        this.dispose();
    }//GEN-LAST:event_btn_volumenActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_area;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_longitud;
    private javax.swing.JButton btn_masa;
    private javax.swing.JButton btn_temperatura;
    private javax.swing.JButton btn_tiempo;
    private javax.swing.JButton btn_volumen;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_header;
    // End of variables declaration//GEN-END:variables
}