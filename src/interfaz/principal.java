/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author lveloza1
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    double v[];
    double v1[];
    double s[];
    double r[];
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cmdBorrar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmdResta = new javax.swing.JButton();
        cmdSuma = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 2, 18)); // NOI18N
        jLabel1.setText("Ejercicio 3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitudes");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 150));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 80, 40));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 220, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdResta.setText("Resta de los Vectores");
        cmdResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaActionPerformed(evt);
            }
        });
        jPanel5.add(cmdResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 40));

        cmdSuma.setText("Suma de los Vectores");
        cmdSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumaActionPerformed(evt);
            }
        });
        jPanel5.add(cmdSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 40));

        cmdAutomatico.setText("Llenado Automático");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel5.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 40));

        cmdManual.setText("Llenado Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel5.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 40));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel5.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 200, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }   
      else if(Integer.parseInt(txtLongitud.getText().trim())==0){
      JOptionPane.showMessageDialog(this,"La longitud no puede ser 0","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      txtLongitud.selectAll();
   }
      else{
          longitud=Integer.parseInt(txtLongitud.getText().trim());
          v=new double[longitud];
          v1=new double[longitud];
          JOptionPane.showMessageDialog(this,"Los vectores han sido creados exitosamente");
          
          
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
double n, n1;
  if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      
   }
  else{
   for (int i=0; i<v.length; i++){
  n=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese el elemento número "+(i+1)+" de V"));
  v[i]=n;
   } 
   for (int j = 0; j <v.length; j++) {
  n1=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese el elemento número "+(j+1)+" de V1"));
   v1[j]=n1;   
          
      }
     
   }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();    
        }
else{
   txtResultado.append("Elementos de V: \n");
    for (int i=0 ; i<v.length ; i++){
    txtResultado.append(v[i]+"\n");
        }
    txtResultado.append("Elementos de V1: \n");
    for (int j = 0; j <v.length; j++) {
    txtResultado.append(v1[j]+"\n");
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
double n, f, g;
    if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
    else{
        f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el limite del llenado automatico "));
           while (f<v.length){
            JOptionPane.showMessageDialog(this, "El número no puede ser menor que "+v.length);
            f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el limite del llenado automatico "));
           }
        for (int i = 0; i < v.length; i++) {
            
        n=(int)(Math.random()*f + 1);  
        v[i]=n;
        }
        for (int i = 0; i < v.length; i++) {
            
        g=(int)(Math.random()*f + 1);  
        v1[i]=g;
        }
      JOptionPane.showMessageDialog(this,"Vectores llenados con éxito");  
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtLongitud.setText(" ");
    txtResultado.setText(" ");
    v=null;
    v1=null;
    s=null;
    r=null;
    txtLongitud.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumaActionPerformed
int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
    else{
   longitud=Integer.parseInt(txtLongitud.getText().trim()); 
   s=new double[longitud]; 
            for (int i = 0; i < v.length; i++) {
             s[i]=(v[i]+v1[i]);   
            }
            for (int i = 0; i < s.length; i++) {
          txtResultado.append("Suma de la posicion "+i+" = "+s[i]+"\n");
         
            }
        
            
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSumaActionPerformed

    private void cmdRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaActionPerformed
int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud para los vectores","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
    else{
   longitud=Integer.parseInt(txtLongitud.getText().trim()); 
   r=new double[longitud]; 
            for (int i = 0; i < v.length; i++) {
             r[i]=(v[i]-v1[i]);   
            }
            for (int i = 0; i < r.length; i++) {
          txtResultado.append("Resta de la posicion "+i+" = "+r[i]+"\n");
         
            }
        
            
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdRestaActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongitudKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdResta;
    private javax.swing.JButton cmdSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
