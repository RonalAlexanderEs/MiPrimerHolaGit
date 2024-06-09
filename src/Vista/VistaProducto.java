package Vista;
import javax.swing.JOptionPane;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaProducto extends javax.swing.JFrame {
    ProductoDAO cd = new ProductoDAO();
    Producto p = new Producto();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    public VistaProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }
    
    void listar(){
    List<Producto> lista = cd.listar();
    modelo=(DefaultTableModel)jtable.getModel();
    Object[]ob=new Object[5];
    for(int i=0;i<lista.size();i++){
    ob[0]=lista.get(i).getIdproducto();
    ob[1]=lista.get(i).getCodproducto();
    ob[2]=lista.get(i).getNomproducto();
    ob[3]=lista.get(i).getPrecioproducto();
    ob[4]=lista.get(i).getStock();
    modelo.addRow(ob);
    
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnanadir = new javax.swing.JButton();
        txtpprod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnprod = new javax.swing.JTextField();
        txtcprod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsprod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 584, -1));

        btnnuevo.setText("NEW");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 40));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Producto", "Cod_Producto", "Nom_Producto", "Precio Producto", "Stock", ""
            }
        ));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 690, 230));

        btneliminar.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 130, 40));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 110, 40));

        btnanadir.setText("AÑADIR");
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnanadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 110, 40));

        txtpprod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO UNITARIO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtpprod.setDragEnabled(true);
        jPanel1.add(txtpprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 230, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NOMBRE DEL PRODUCTO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 210, 40));

        txtnprod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtnprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 230, 40));

        txtcprod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtcprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcprodActionPerformed(evt);
            }
        });
        jPanel1.add(txtcprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DEL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 23));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CÓDIGO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 40));

        txtsprod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCK:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtsprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsprodActionPerformed(evt);
            }
        });
        jPanel1.add(txtsprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGEL CAMPOS\\Downloads\\xd.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 70, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMÁGEN:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, 130));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 160, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTO");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGEL CAMPOS\\Downloads\\logo2.png")); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 210, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 770, 120));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, 780, 20));

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 90, 40));

        btnatras.setText("ATRAS");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            String codproducto = jtable.getValueAt(fila,1).toString();
            String nomproducto = jtable.getValueAt(fila,2).toString();
            double precioproducto = Double.parseDouble(jtable.getValueAt(fila,3).toString());
            int stock = Integer.parseInt(jtable.getValueAt(fila,4).toString());

            txtcprod.setText(codproducto);
            txtnprod.setText(nomproducto);
            txtpprod.setText(String.valueOf(precioproducto));
            txtsprod.setText(String.valueOf(stock));
        }

    }//GEN-LAST:event_jtableMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirActionPerformed
        anadir();
        limpiartabla();
        listar();
    }//GEN-LAST:event_btnanadirActionPerformed

    private void txtcprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcprodActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        dispose();
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_btnatrasActionPerformed

    private void txtsprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsprodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    void anadir(){
        String codproducto=txtcprod.getText();
        String nomproducto= txtnprod.getText();
        double precioproducto=Double.parseDouble(txtpprod.getText());
        int stock=Integer.parseInt(txtsprod.getText());
        
        Object[] ob=new Object[4];
        ob[0]=codproducto;
        ob[1]=nomproducto;
        ob[2]= precioproducto;
        ob[3]= stock;
        cd.add(ob);
    }
    
    void actualizar(){
        int fila = jtable.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(this, "SELECCIONA UNA FILA");
        }else{
        String codproducto=txtcprod.getText();
        String nomproducto= txtnprod.getText();
        double precioproducto=Double.parseDouble(txtpprod.getText());
        int stock=Integer.parseInt(txtsprod.getText());
        
        Object[] ob=new Object[5];
        ob[0]=codproducto;
        ob[1]=nomproducto;
        ob[2]= precioproducto;
        ob[3]= stock;
        ob[4]=id;
        cd.update(ob);
        
        } 
    }
    
    
    void eliminar(){
        int fila= jtable.getSelectedRow();
        int is=Integer.parseInt(jtable.getValueAt(fila, 0).toString());
        if(fila==-1){
        JOptionPane.showMessageDialog(this, "Selecciona Fila");
        }else{cd.delete(is);}
    }
    
    
    void nuevo(){
    txtcprod.setText("");
    txtnprod.setText("");
    txtpprod.setText("");
    txtsprod.setText("");
    txtcprod.requestFocus();
       
       
    }
    
    
    void limpiartabla(){
   for(int i=0; i<modelo.getRowCount();i++){
   modelo.removeRow(i);
   i=i-1;
   }
   }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnanadir;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField txtcprod;
    private javax.swing.JTextField txtnprod;
    private javax.swing.JTextField txtpprod;
    private javax.swing.JTextField txtsprod;
    // End of variables declaration//GEN-END:variables
}
