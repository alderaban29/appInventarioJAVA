/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import javax.swing.JOptionPane;
import modelo.Usuario;
import shared.FrmMensajeSistema;


public class FrmIngresoAlternativo extends javax.swing.JFrame {

    /**
     * Creates new form FrmIngresoAlternativo
     */
    public FrmIngresoAlternativo() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario_1 = new javax.swing.JTextField();
        txt_palabra_secreta = new javax.swing.JPasswordField();
        jButton_VerificarPalabraSecreta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nueva_contraseña = new javax.swing.JPasswordField();
        confirmar_nueva_contraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N

        txt_usuario_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuario_1ActionPerformed(evt);
            }
        });
        txt_usuario_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuario_1KeyPressed(evt);
            }
        });

        txt_palabra_secreta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_palabra_secreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_palabra_secretaActionPerformed(evt);
            }
        });
        txt_palabra_secreta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_palabra_secretaKeyPressed(evt);
            }
        });

        jButton_VerificarPalabraSecreta.setBackground(new java.awt.Color(51, 153, 255));
        jButton_VerificarPalabraSecreta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_VerificarPalabraSecreta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_VerificarPalabraSecreta.setText("Verificar");
        jButton_VerificarPalabraSecreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VerificarPalabraSecretaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cod. Recuperación");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Confirmar Contraseña");

        nueva_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueva_contraseñaActionPerformed(evt);
            }
        });

        confirmar_nueva_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_nueva_contraseñaActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmar_nueva_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txt_usuario_1)
                    .addComponent(txt_palabra_secreta)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(nueva_contraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_VerificarPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_usuario_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_palabra_secreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmar_nueva_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton_VerificarPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuario_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuario_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuario_1ActionPerformed

    private void txt_usuario_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuario_1KeyPressed
        //METODO U ACCION PARA QUE AL DAR ENTER CAMBIE DE CAMPO DE INGRESO DE DATOS
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_palabra_secreta.requestFocus();
        }
    }//GEN-LAST:event_txt_usuario_1KeyPressed

    private void txt_palabra_secretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_palabra_secretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_palabra_secretaActionPerformed

    private void txt_palabra_secretaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_palabra_secretaKeyPressed
        //METODO U ACCION PARA QUE AL DAR ENTER INICIE SESION
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //this.Login();
        }
    }//GEN-LAST:event_txt_palabra_secretaKeyPressed

    private void jButton_VerificarPalabraSecretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VerificarPalabraSecretaActionPerformed
        this.AccesoAlternativo();
        //new CambiarContraseña(txt_usuario_1.getText());
    }//GEN-LAST:event_jButton_VerificarPalabraSecretaActionPerformed

    private void nueva_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nueva_contraseñaActionPerformed

    private void confirmar_nueva_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_nueva_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmar_nueva_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIngresoAlternativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoAlternativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoAlternativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoAlternativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresoAlternativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmar_nueva_contraseña;
    private javax.swing.JButton jButton_VerificarPalabraSecreta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nueva_contraseña;
    private javax.swing.JPasswordField txt_palabra_secreta;
    private javax.swing.JTextField txt_usuario_1;
    // End of variables declaration//GEN-END:variables

    private void AccesoAlternativo() {

        //Ctrl_Usuario obj = new Ctrl_Usuario();
        //obj.ValidarUsuario();
        if (!txt_usuario_1.getText().isEmpty() && !txt_palabra_secreta.getText().isEmpty() && !nueva_contraseña.getText().isEmpty() && !confirmar_nueva_contraseña.getText().isEmpty()) {
            //user = "";
            if (nueva_contraseña.getText().trim().equals(confirmar_nueva_contraseña.getText().trim())) {
                Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
                Usuario usuario = new Usuario();
                usuario.setUsuario(txt_usuario_1.getText().trim());
                usuario.setPalabra_secreta(txt_palabra_secreta.getText().trim());
                usuario.setPassword(nueva_contraseña.getText().trim());
                /*
            if (controlUsuario.loginUser(usuario)) {
                //JOptionPane.showMessageDialog(null, "Login Correcto...");
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
                this.dispose();
            } else {
                //JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrectos");
                FrmMensajeSistema obj = new FrmMensajeSistema();
                obj.mensajeCamposIncorrectos();
            }
                 */
                boolean consulta = controlUsuario.verificarPalabraSecreta(usuario.getUsuario(), usuario.getPalabra_secreta());

                //FrmMenu menu = new FrmMenu();
                //menu.setVisible(true);
                //System.out.println(contraseña);
                if (consulta) {
                    //CambiarContraseña CambiarContraseña = new CambiarContraseña();
                    //FrmLogin.close();
                    //CambiarContraseña.setVisible(true);
                    controlUsuario.actualizarContraseña(usuario.getPassword(), usuario.getUsuario());
                    this.dispose();
                    
                    FrmLogin FrmLogin = new FrmLogin();
                    FrmLogin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado, verificar usuario o Código de recuperación");
                    //JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
                    FrmMensajeSistema obj = new FrmMensajeSistema();
                    //obj.mensajeCamposVacios();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado, contraseñas distintas");
                //JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado, digitar todos los campos");

        }
    }
}
