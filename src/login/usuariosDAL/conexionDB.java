
package login.usuariosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class conexionDB {
    String strConexionDB = "jdbc:sqlite:C:/Users/JACSELY/Documents/JAVA PROJECTS/DB LOGIN/login.s3db";
    Connection conn = null;
    
    public conexionDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = (Connection) DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");   
        } catch (Exception e) {
            
            System.out.println("Error de conexion ");
        }  
    }
    public int  ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            
            System.out.println(e);
            return 0;
        }
    }
    public ResultSet consultarRegisttos(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
        }
    }  
}
