
package Persistencia;
import java.sql.*;/// el asterisco sirva para importar todos los opciones....

public class ConexionSQL {
    public static String url="jdbc:mysql://localhost/dbrestaurante";
    public static String usuario="root";
    public static String clave="";
    public static String driver="com.mysql.jdbc.Driver";
    static Connection conexion;
    public Connection conectar(){
     try{
         Class.forName(driver);
         conexion=DriverManager.getConnection(url, usuario, clave);
         conexion.setAutoCommit(false);
         System.out.println("Conexion exitosa");
     }catch(ClassNotFoundException | SQLException e){
         System.out.println(e);
     
     }   
        
      return conexion;
    }

public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            
        }
    }

    public void roll() {
        try {
            conexion.rollback();
        } catch (SQLException ex) {

        }
    }

    public void commi() {
        try {
            conexion.commit();
        } catch (SQLException ex) {

        }
    }
    
}
