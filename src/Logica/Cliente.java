
package Logica;

public class Cliente {
    
    private int id;
    private String nombre;
    private String ciudad;
    private String nit;
    private String telefono;
    private String estatus;
    private int usuario_id;

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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
   public void cargar_datos(String nombre,String ciudad,String nit,String telefono,String estatus,int usuario_id){
       this.setNombre(nombre);
       this.setCiudad(ciudad);
       this.setNit(nit);
       this.setTelefono(telefono);
       this.setEstatus(estatus);
       this.setUsuario_id(usuario_id);
   }
}
