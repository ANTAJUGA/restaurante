
package Logica;

public class Usuario {
    private int id;
    private String user;
    private String pass;
    private int tipo_id;
    private int empleado_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }
    public void cargar_datos(String user,String pass,int tipo_id,int empleado_id){
        this.setUser(user);
        this.setPass(pass);
        this.setTipo_id(tipo_id);
        this.setEmpleado_id(empleado_id);
    }
}
