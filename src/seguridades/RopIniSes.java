/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seguridades;

import javax.swing.JOptionPane;

/**
 *
 * @author prof_tes_a
 */
public class RopIniSes extends javax.swing.JFrame {

    /**
     * Creates new form RopIniSes
     */
    public RopIniSes() {
        initComponents();
        txtUsr.setText(getUsuario());
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
        txtUsr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        butAce = new javax.swing.JButton();
        pwdCla = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.gif"))); // NOI18N

        jLabel2.setText("Usuario:");

        txtUsr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsrFocusGained(evt);
            }
        });
        txtUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsrKeyPressed(evt);
            }
        });

        jLabel3.setText("Clave:");

        butAce.setMnemonic('A');
        butAce.setText("Aceptar");
        butAce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAceActionPerformed(evt);
            }
        });

        pwdCla.setEchoChar('@');
        pwdCla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdClaFocusGained(evt);
            }
        });
        pwdCla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdClaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butAce, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(pwdCla))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(pwdCla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(butAce, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butAceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAceActionPerformed
        String strUsr, strCla;
        strUsr=txtUsr.getText();
        strUsr=txtUsr.getText();
        strUsr=txtUsr.getText();
        
        strCla=String.valueOf(pwdCla.getPassword());
        if (strUsr.length()>=3)
        {
            if (strCla.equals(strUsr) || strCla.length()<3)
            {
                JOptionPane.showMessageDialog(this, "Clave incorrecta.\nLa clave debe ser diferente al usuario.\nDebe tener al menos 3 caracteres.");
                pwdCla.selectAll();
                pwdCla.requestFocus();
            }
            else
            {
                RopPanPri objPanPri=new RopPanPri();
                objPanPri.setUsuarioBarraEstado(strUsr);
                objPanPri.setVisible(true);
                setUsuario();
                if (!guardarLog())
                    javax.swing.JOptionPane.showMessageDialog(this, "Problemas con el archivo de Log.");
                this.dispose();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Usuario incorrecto.\nEl usuario debe tener al menos 3 caracteres.");
            txtUsr.selectAll();
            txtUsr.requestFocus();
        }
    }//GEN-LAST:event_butAceActionPerformed

    private void txtUsrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsrFocusGained
        txtUsr.selectAll();
    }//GEN-LAST:event_txtUsrFocusGained

    private void pwdClaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdClaFocusGained
        pwdCla.selectAll();
    }//GEN-LAST:event_pwdClaFocusGained

    private void txtUsrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsrKeyPressed
        //Si se presiona la tecla ENTER pasar al siguiente control.
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        {
            //pwdCla.requestFocus();
            txtUsr.transferFocus();
        }
    }//GEN-LAST:event_txtUsrKeyPressed

    private void pwdClaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdClaKeyPressed
        //Si se presiona la tecla ENTER pasar al siguiente control.
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        {
            butAceActionPerformed(null);
        }
    }//GEN-LAST:event_pwdClaKeyPressed

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
            java.util.logging.Logger.getLogger(RopIniSes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RopIniSes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RopIniSes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RopIniSes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RopIniSes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pwdCla;
    private javax.swing.JTextField txtUsr;
    // End of variables declaration//GEN-END:variables

    private boolean setUsuario()
    {
        boolean blnRes=true;
        try
        {
            //Leer el archivo de propiedades.
            java.util.Properties proArc=new java.util.Properties();
            java.io.FileInputStream fis=new java.io.FileInputStream("RopUsrSis.properties");
            proArc.load(fis);
            fis.close();
            //Actualizar el archivo de propiedades.
            java.io.FileOutputStream fos=new java.io.FileOutputStream("RopUsrSis.properties");
            proArc.put("Usuario", txtUsr.getText());
            proArc.store(fos, null);
            fos.close();
            proArc=null;
        }
        catch (java.io.FileNotFoundException e)
        {
            blnRes=false;
        }
        catch (java.io.IOException e)
        {
            blnRes=false;
        }
        catch (Exception e)
        {
            blnRes=false;
        }
        return blnRes;
    }
    
    private String getUsuario()
    {
        String strRes="";
        try
        {
            //Leer archivo de configuración "ZafUsrSis.properties".
            java.util.Properties proArc=new java.util.Properties();
            java.io.FileInputStream fis=new java.io.FileInputStream("RopUsrSis.properties");
            proArc.load(fis);
            fis.close();
            //Leer las propiedades.
            strRes=proArc.getProperty("Usuario");
            proArc=null;
        }
        catch (java.io.IOException e)
        {
            strRes="";
        }
        catch (Exception e)
        {
            strRes="";
        }
        return strRes;
    }
    
    private boolean guardarLog()
    {
        boolean blnRes=true;
        java.text.SimpleDateFormat objSimDatFor;
        objSimDatFor=new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try
        {
            java.io.FileWriter objFilWri=new java.io.FileWriter("RopTESLog.txt", true);
            java.io.BufferedWriter objBufWri=new java.io.BufferedWriter(objFilWri);
            java.io.PrintWriter objPriWri=new java.io.PrintWriter(objBufWri);
            objPriWri.print("Fecha de ingreso: " + objSimDatFor.format(new java.util.Date()));
            objPriWri.println();
            objPriWri.print("Usuario: " + txtUsr.getText());
            objPriWri.println();
            objPriWri.println();
            objPriWri.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
    
}
