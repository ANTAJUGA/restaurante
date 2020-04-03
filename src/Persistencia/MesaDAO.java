/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import Logica.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrador
 */
public class MesaDAO {
    //creamos el objeto de la clase ConexionBD
    public static PreparedStatement sentencia_preparada;//para executar la consulta
    private DefaultTableModel DT;
    private ResultSet RS;//SIRVE PARA OBTENER EL RESULTADO DE LA CONSULTA
    ConexionSQL conn = new ConexionSQL();
    public int ocupar_mesa(int n) throws SQLException {
        int resultado = 0;
        Mesa m= new Mesa();
        m.setId(n);
        String sentencia_actualizar = ("UPDATE mesa SET disponible = 1 WHERE id = " +m.getId() );
        try {
            conn.conectar();//creamos la conexion
            //creamos le sentencia para guardar los datos
            sentencia_preparada = conn.conectar().prepareStatement(sentencia_actualizar);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conn.commi();//ejecutamos todas las sentencias en uno solo disparo
        } catch (SQLException e) {
            conn.roll();//SI OCURRE UN ERROR CANCELAMOS TODAS LAS SENTENCIAS
            System.out.println(e);
        } finally {//finalizamos todo
            if (sentencia_preparada == null) {//
                sentencia_preparada.close();//cerramos la sentencia
            }
            conn.desconectar();//cerramos la conexion
        }
        return resultado;
    }
    public int desocupar_mesa(int n) throws SQLException {
        int resultado = 0;
        Mesa m= new Mesa();
        m.setId(n);
        String sentencia_actualizar = ("UPDATE mesa SET disponible = 0 WHERE id = " +m.getId() );
        try {
            conn.conectar();//creamos la conexion
            //creamos le sentencia para guardar los datos
            sentencia_preparada = conn.conectar().prepareStatement(sentencia_actualizar);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conn.commi();//ejecutamos todas las sentencias en uno solo disparo
        } catch (SQLException e) {
            conn.roll();//SI OCURRE UN ERROR CANCELAMOS TODAS LAS SENTENCIAS
            System.out.println(e);
        } finally {//finalizamos todo
            if (sentencia_preparada == null) {//
                sentencia_preparada.close();//cerramos la sentencia
            }
            conn.desconectar();//cerramos la conexion
        }
        return resultado;
    }
    public int[] cargar() throws SQLException {
        int[] n = new int[15];
        int i = 0;
        Mesa m=new Mesa();
        String sentencia_listar = ("select disponible from  mesa");
        //String sentencia_buscar = ("SELECT id FROM persona WHERE dni=" + u.getCedula());
        try {
            conn.conectar();//creamos la conexion
            //creamos le sentencia para guardar los datos
            sentencia_preparada = conn.conectar().prepareStatement(sentencia_listar);
            RS = sentencia_preparada.executeQuery();
            while (RS.next()) {
                m.setDisponible(RS.getInt("disponible"));
                n[i] = m.getDisponible();
                i++;
            }
            conn.commi();
        } catch (SQLException e) {
            conn.roll();
            System.out.println(e);
        } finally {
            conn.desconectar();
            sentencia_preparada.close();
        }
        return n;
    }
}
