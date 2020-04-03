
package Persistencia;
import Logica.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {
    ConexionSQL conn=new ConexionSQL();
    public static PreparedStatement sentencia_preparada;//PARA PREPARAR LAS SENTENCIAS
    private DefaultTableModel DT;//UN DATA TABLE PARA CONSULTA DE TABLAS
    private ResultSet RS;//SIRVE  PARA OBTENER EL RESULTADO DE LA CONSULTA
    //METODO DE BUSQUEDA DE USUARIO EN LA BASE DE DATOS
    public boolean buscarUsuario(String usuario,String clave) throws SQLException {
        boolean buscar = false;
        Usuario u = new Usuario();
        u.setUser(usuario);
        u.setPass(clave);
        String sentencia_buscar = ("SELECT *FROM usuario WHERE user= '"+u.getUser()+"' and pass='" + u.getPass()+"'");
        try {
            conn.conectar();//creamos la conexion
            //creamos le sentencia para guardar los datos
            sentencia_preparada = conn.conectar().prepareStatement(sentencia_buscar);
            RS = sentencia_preparada.executeQuery();
            buscar = RS.next();
            conn.commi();
        } catch (SQLException e) {
            conn.roll();
            System.out.println(e);
        } finally {
            conn.desconectar();
            sentencia_preparada.close();
        }
        return buscar;
    }
}
