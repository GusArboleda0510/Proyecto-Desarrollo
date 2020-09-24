/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Alejandra Becerra
 */
public class Entrada_Salida extends javax.swing.JFrame {

    /**
     * Creates new form Entrada_Salida
     */
    String usaurio;
    public Entrada_Salida(String u) {
        this.usaurio=u;
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLNovedad = new javax.swing.JButton();
        jLCerrar = new javax.swing.JButton();
        jLRegistro = new javax.swing.JButton();
        jLabelReporte = new javax.swing.JLabel();
        jlFondo1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondorojo2.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(175, 50, 75));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FUNCIONARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 346, 58));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSalida.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaSalida(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 237, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgEntrada.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuhaEntrada(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 70));

        jLNovedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgNovedad.png"))); // NOI18N
        jLNovedad.setBorderPainted(false);
        jLNovedad.setContentAreaFilled(false);
        jLNovedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaNovedad(evt);
            }
        });
        jPanel1.add(jLNovedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 230, 80));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgCerrar2.png"))); // NOI18N
        jLCerrar.setBorderPainted(false);
        jLCerrar.setContentAreaFilled(false);
        jLCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuchaCerrar(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 200, -1));

        jLRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgPersonas.png"))); // NOI18N
        jLRegistro.setBorderPainted(false);
        jLRegistro.setContentAreaFilled(false);
        jLRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLRegistroEscuchaPersona(evt);
            }
        });
        jPanel1.add(jLRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 237, 80));

        jLabelReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgReporte.png"))); // NOI18N
        jLabelReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelReporteMousePressed(evt);
            }
        });
        jPanel1.add(jLabelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 60));

        jlFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRegistro.jpg"))); // NOI18N
        jPanel1.add(jlFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EscuhaEntrada(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuhaEntrada
        new RegistroEntrada();
    }//GEN-LAST:event_EscuhaEntrada

    private void EscuchaSalida(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaSalida
        new RegistroSalida();
    }//GEN-LAST:event_EscuchaSalida

    private void EscuchaNovedad(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaNovedad
        new Novedad(usaurio);
    }//GEN-LAST:event_EscuchaNovedad

    private void EscuchaCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuchaCerrar
        dispose();
    }//GEN-LAST:event_EscuchaCerrar

    private void jLRegistroEscuchaPersona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLRegistroEscuchaPersona
        new MenuPersonas(null, true);
    }//GEN-LAST:event_jLRegistroEscuchaPersona

    private void jLabelReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReporteMousePressed
        new Reporte();
    }//GEN-LAST:event_jLabelReporteMousePressed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jLCerrar;
    private javax.swing.JButton jLNovedad;
    private javax.swing.JButton jLRegistro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFondo1;
    // End of variables declaration//GEN-END:variables
}
