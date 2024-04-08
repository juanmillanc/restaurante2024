package Negocio;

import javax.swing.JOptionPane;

public class cls_validar_cliente {
    private boolean val = false;
    private String msn;

    public void validarDatosEntrada(String id, String nombre, String contacto, String correo) {
        if (id.equals("") || nombre.equals("") || contacto.equals("") || correo.equals("")) {
            this.msn = "Debe ingresar todos los datos";
        } else {
            this.val = true;
            msn = "El cliente " + nombre + " ha sido registrado con exito";
        }
    }

    public String getmsn() {
        return this.msn;
    }

    public boolean getVal() {
        return this.val;
    }
}
