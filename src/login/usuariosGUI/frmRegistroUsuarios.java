
package login.usuariosGUI;

import java.sql.ResultSet;
import javax.swing.JTable;
import login.usuariosBL.loginBL;
import login.usuariosDAL.conexionDB;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmRegistroUsuarios extends javax.swing.JFrame {

    public frmRegistroUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBLRegistrate = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblNumeroTelefono = new javax.swing.JLabel();
        txtNumeroTelefono = new javax.swing.JTextField();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblConfirmarContraseña = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        pfContraseña = new javax.swing.JPasswordField();
        pfConfirmarContraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        LBLRegistrate.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        LBLRegistrate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLRegistrate.setText("REGISTRATE");

        lblNombreUsuario.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de Usuario");

        lblNombre.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblApellido.setText("Apellido");

        lblNumeroTelefono.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblNumeroTelefono.setText("Numero de Telefono");

        lblCorreoElectronico.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblCorreoElectronico.setText("Correo Electronico");

        lblContraseña.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblContraseña.setText("Contraseña");

        lblConfirmarContraseña.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        lblConfirmarContraseña.setText("Confirmar Contraseña");

        btnRegistrarse.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sitka Small", 3, 12)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombreUsuario)
                        .addComponent(lblNombre)
                        .addComponent(lblApellido)
                        .addComponent(lblNumeroTelefono)
                        .addComponent(lblCorreoElectronico)
                        .addComponent(lblContraseña)
                        .addComponent(lblConfirmarContraseña)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido)
                        .addComponent(txtNumeroTelefono)
                        .addComponent(txtCorreoElectronico)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(LBLRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pfContraseña)
                        .addComponent(pfConfirmarContraseña))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarse)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LBLRegistrate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirmarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarse)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
       
        frmVisualizarRegistroUsuarios oVizualizarregistroUsuarios = new frmVisualizarRegistroUsuarios();
        
        if(txtNombreUsuario==(null)|| txtNombre==(null)|| txtApellido==(null)|| txtNumeroTelefono==(null)|| pfContraseña ==(null)|| pfConfirmarContraseña==(null)){
            
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
        else{
            JOptionPane.showMessageDialog(this, "Usted se ha registrado");
        }
        
        if( pfContraseña != pfConfirmarContraseña){
            
            JOptionPane.showMessageDialog(this, "La contraseña no coincide");
        }

        conexionDB objConexion = new conexionDB();
            
        objConexion.ejecutarSentenciaSQL("INSERT INTO Usuarios (Usuario,Nombre, Apellido, Telefono, Correo) VALUES ('ros19','Rosa','Casanova','809-505-9865','rosacasanova@gmail.com')");
           
        loginBL oLogin = recuperarDatosGUI();
        
        String strSentenciaInsert = String.format("INSERT INTO Usuarios (Usuario, Nombre, Apellido, Telefono,Correo)"
        + "VALUES ('%s', '%s', '%s', '%s','%s')", oLogin.getUsuario(), oLogin.getNombre(), oLogin.getNombre(), oLogin.getApellido(), oLogin.getTelefono(), oLogin.getCorreo());
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        try {
            ResultSet resultado = objConexion.consultarRegisttos("SELECT*FROM Usuarios");
            
            while (resultado.next()) {
                System.out.println(resultado.getString("Usuario"));
                System.out.println(resultado.getString("Nombre"));
                System.out.println(resultado.getString("Apellido"));
                System.out.println(resultado.getString("Telefono"));
                System.out.println(resultado.getString("Correo"));
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        oVizualizarregistroUsuarios.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmLoginUsuario oLoginUsuario = new frmLoginUsuario();
        oLoginUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroUsuarios().setVisible(true);
            }
        });
    }
        
    public loginBL recuperarDatosGUI(){
        loginBL oLogin = new loginBL();
        
        
        oLogin.setUsuario(txtNombreUsuario.getText());
        oLogin.setNombre(txtNombre.getText());
        oLogin.setApellido(txtApellido.getText());
        oLogin.setTelefono(txtNumeroTelefono.getText());
        oLogin.setCorreo(txtCorreoElectronico.getText());
        
        return oLogin;
    }
    
    public void limpiar(){
        txtNombreUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumeroTelefono.setText("");
        txtCorreoElectronico.setText("");
 
    }

    public void setTxtNombreUsuarioText(String text) {
        this.txtNombreUsuario.setText(text);
    }
    public void setTxtNombreText(String text) {
        this.txtNombre.setText(text);
    }
    public void setTxtApellidoText(String text) {
        this.txtApellido.setText(text);
    }
    public void setTxtNumeroTelefonoText(String text) {
        this.txtNumeroTelefono.setText(text);
    }
    public void setTxtCorreoElectronicoText(String text) {
        this.txtCorreoElectronico.setText(text);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLRegistrate;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmarContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JPasswordField pfConfirmarContraseña;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
