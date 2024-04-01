package Datos;

public class cls_clientes {

    private String idStr;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private int estadoInt;//0:inactivo y 1:activoo

    public cls_clientes(String id, String nombre, String contacto, String correo) {
        this.idStr = id;
        this.nombreStr = nombre;
        this.contactoStr = contacto;
        this.correoStr = correo;
        this.estadoInt = 0;
    }

    public int getEstado() {
        return this.estadoInt;
    }

    public void setEstado(int e) {
        this.estadoInt = e;
    }

    public String getIdStr() {
        return idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    
    
    
    
    

}
