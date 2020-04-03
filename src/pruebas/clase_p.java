
package pruebas;
import Persistencia.*;
import java.sql.SQLException;
public class clase_p {

    public static void main(String[] args) throws SQLException {
        ConexionSQL con = new ConexionSQL();
        UsuarioDAO u=new UsuarioDAO();
        MesaDAO m=new MesaDAO();
        /*if(u.buscarUsuario("LINBER","12345")==true){
            System.out.println("USUARIO ENCONTRADO");
        }
        else{
            System.out.println("USUARIO NO EXISTE");
        }*/
        //m.ocupar_mesa(3);//SIRVE PARA OCUPAR UNA MESA DEL SISTEMA
        
        int []cargar=m.cargar();//carga los datos disponible de la mesa
        for(int i=0;i<15;i++){
            System.out.println(cargar[i]);
        }
        
    }
}
