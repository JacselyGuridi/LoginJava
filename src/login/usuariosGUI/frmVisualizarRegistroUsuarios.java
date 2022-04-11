
package login.usuariosGUI;

import login.usuariosDAL.conexionDB;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.usuariosBL.loginBL;

public class frmVisualizarRegistroUsuarios extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    
    frmRegistroUsuarios oRegistroUsuarios = new frmRegistroUsuarios();
    loginBL oLogin = new loginBL();
    
    public frmVisualizarRegistroUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        String[] titulos = {"Usuario","Nombre","Apellido","Telefono","Correo"};
        
        modelo = new DefaultTableModel(null, titulos);
        tblUsuariosRegistrados.setModel(modelo);
        
        this.mostrarDatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuariosRegistrados = new javax.swing.JTable();
        lblUsuariosRegistrados = new javax.swing.JLabel();
        btnCerrarseccion = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblUsuariosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuariosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosRegistradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuariosRegistrados);

        lblUsuariosRegistrados.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        lblUsuariosRegistrados.setText("Usuarios Registrados");

        btnCerrarseccion.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        btnCerrarseccion.setText("Cerrar Seccion");
        btnCerrarseccion.setToolTipText("");
        btnCerrarseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarseccionActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuariosRegistrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrarseccion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuariosRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrarseccion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        oRegistroUsuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblUsuariosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosRegistradosMouseClicked
        
        oRegistroUsuarios.show();
        dispose();
        
        if(evt.getClickCount()==1){
            JTable receptor = (JTable)evt.getSource(); 
            
            this.oRegistroUsuarios.setTxtNombreUsuarioText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            this.oRegistroUsuarios.setTxtNombreText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            this.oRegistroUsuarios.setTxtApellidoText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            this.oRegistroUsuarios.setTxtNumeroTelefonoText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            this.oRegistroUsuarios.setTxtCorreoElectronicoText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            
        }
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_tblUsuariosRegistradosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        conexionDB objConexion = new conexionDB();
        oRegistroUsuarios.recuperarDatosGUI();
        
        oLogin = oRegistroUsuarios.recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("DELETE FROM Usuarios WHERE Usuario =%d", oLogin.getUsuario());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        conexionDB objConexion = new conexionDB();
        
        oRegistroUsuarios.recuperarDatosGUI();
        
        oLogin = oRegistroUsuarios.recuperarDatosGUI();
        //loginBL oLogin = recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("UPDATE Usuarios SET Usuario ='%s', Nombre='%s', Apellido='%s', Telefono='%s',Correo='%s')"
        + "WHERE Usuario =%d", oLogin.getUsuario(), oLogin.getNombre(), oLogin.getNombre(), oLogin.getApellido(), oLogin.getTelefono(), oLogin.getCorreo());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        
        this.mostrarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarseccionActionPerformed
        // TODO add your handling code here:
        
        frmLoginUsuario oLoginUsuario = new frmLoginUsuario();
        oLoginUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarseccionActionPerformed
    
    public void mostrarDatos(){
        
        while(modelo.getRowCount()>0){
        
        modelo.removeRow(0);
        
        }
        
        conexionDB objConexion = new conexionDB();
        
        try {
            ResultSet resultado = objConexion.consultarRegisttos("SELECT*FROM Usuarios");
            
            while (resultado.next()) {
                System.out.println(resultado.getString("Usuario"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Apellido"));
                System.out.println(resultado.getString("Telefono"));
                System.out.println(resultado.getString("Correo"));
                
                Object[] oUsuario= {resultado.getString("Usuario"),resultado.getString("Nombre"),resultado.getString("Apellido"),resultado.getString("Telefono"),resultado.getString("Correo")};
                    
                modelo.addRow(oUsuario);
            }
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVisualizarRegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrarseccion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuariosRegistrados;
    private javax.swing.JTable tblUsuariosRegistrados;
    // End of variables declaration//GEN-END:variables
}
