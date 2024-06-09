
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaCliente extends javax.swing.JFrame {
    
    ClienteDAO cd = new ClienteDAO();
    Cliente c = new Cliente();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    
    public VistaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }
    
    void listar(){
    List<Cliente> lista = cd.listar();
    modelo=(DefaultTableModel)jtable.getModel();
    Object[]ob=new Object[5];
    for(int i=0;i<lista.size();i++){
    ob[0]=lista.get(i).getId();
    ob[1]=lista.get(i).getDni();
    ob[2]=lista.get(i).getNombres();
    ob[3]=lista.get(i).getTelefono();
    ob[4]=lista.get(i).getDirec();
    modelo.addRow(ob);
    
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnatras = new javax.swing.JButton();
        btnsalir1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnanadir = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jtxttele_cl = new javax.swing.JTextField();
        jtxtdnicliente = new javax.swing.JTextField();
        jtxtnombres_cl = new javax.swing.JTextField();
        jtxtdireccion_cl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DEL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 23));

        btnatras.setText("ATRAS");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 120, 40));

        btnsalir1.setText("SALIR");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 20));

        btnanadir.setText("AÑADIR");
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnanadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 190, 60));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 40));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 130, 40));
        jPanel1.add(jtxttele_cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 190, 40));

        jtxtdnicliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdniclienteActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtdnicliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 40));
        jPanel1.add(jtxtnombres_cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 40));
        jPanel1.add(jtxtdireccion_cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 40));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Nombres", "Direccion", "Telefono"
            }
        ));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 450, 300));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setText("DNI: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRES COMPLETOS: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel11.setText("TELÉFONO: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 30));

        btnnuevo.setText("NEW");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtdniclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdniclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdniclienteActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        dispose();
        Principal principal = new Principal();
        principal.setVisible(true);

        
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirActionPerformed
        anadir();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnanadirActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
        int fila=jtable.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(this,"SELECCIONA UNA FILA");
        }
        else{
            id=Integer.parseInt(jtable.getValueAt(fila,0).toString());
            String dni = jtable.getValueAt(fila,1).toString();
            String nombres = jtable.getValueAt(fila,2).toString();
            String telefono = jtable.getValueAt(fila,3).toString();
            String direccion = jtable.getValueAt(fila,4).toString();

            jtxtdnicliente.setText(dni);
            jtxtnombres_cl.setText(nombres);
            jtxttele_cl.setText(telefono);
            jtxtdireccion_cl.setText(direccion);
        }


    }//GEN-LAST:event_jtableMouseClicked

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalir1ActionPerformed

    void anadir(){
        String dni=jtxtdnicliente.getText();
        String nombre= jtxtnombres_cl.getText();
        String telefono=jtxttele_cl.getText();
        String direccion=jtxtdireccion_cl.getText();
        
        Object[] ob=new Object[4];
        ob[0]=dni;
        ob[1]=nombre;
        ob[2]= telefono;
        ob[3]= direccion;
        cd.add(ob);
    }
    
    void actualizar(){
        int fila = jtable.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(this, "SELECCIONA UNA FILA");
        }else{
        String dni=jtxtdnicliente.getText();
        String nombre= jtxtnombres_cl.getText();
        String telefono=jtxttele_cl.getText();
        String direccion=jtxtdireccion_cl.getText();
        
        Object[] ob=new Object[5];
        ob[0]=dni;
        ob[1]=nombre;
        ob[2]= telefono;
        ob[3]= direccion;
        ob[4]= id;
        cd.update(ob);
        
        } 
    }
    
    void eliminar(){
        int fila= jtable.getSelectedRow();
        int iis=Integer.parseInt(jtable.getValueAt(fila, 0).toString());
        if(fila==-1){ 
        JOptionPane.showMessageDialog(this, "SELECCIONA Fila");
        }
        else{cd.delete(iis);
        }
    }
    
   void nuevo(){
    jtxtdnicliente.setText("");
    jtxtnombres_cl.setText("");
    jtxttele_cl.setText("");
    jtxtdireccion_cl.setText("");
    jtxtdnicliente.requestFocus();
          
    }
   
   void limpiartabla(){
   for(int i=0; i<modelo.getRowCount();i++){
   modelo.removeRow(i);
   i=i-1;
   }
   }
    
    
    
    
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
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnanadir;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField jtxtdireccion_cl;
    private javax.swing.JTextField jtxtdnicliente;
    private javax.swing.JTextField jtxtnombres_cl;
    private javax.swing.JTextField jtxttele_cl;
    // End of variables declaration//GEN-END:variables
}
