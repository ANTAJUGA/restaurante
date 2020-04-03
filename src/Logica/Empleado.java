
package Logica;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String fin;
    private int trabajo_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public int getTrabajo_id() {
        return trabajo_id;
    }

    public void setTrabajo_id(int trabajo_id) {
        this.trabajo_id = trabajo_id;
    }
    public void cargar_datos(String nombre,String apellido,String telefono,String fin,int trabajo_id){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        this.setFin(fin);
        this.setTrabajo_id(trabajo_id);
    }
}
