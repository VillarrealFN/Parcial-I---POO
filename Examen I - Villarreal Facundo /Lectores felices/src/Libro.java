import javax.swing.*;

public class Libro {

    private String nombre;
    private String autor;
    private boolean estado;
    private String lector;


    public Libro(String nombre, String autor, boolean estado, String lector){
        this.nombre=nombre;
        this.autor=autor;
        this.estado=true;
        this.lector=null;
    }


    public String getNombre(){return this.nombre;}
    public String setNombre(String nombre){return this.nombre= this.nombre;}

    public String getAutor(){return this.autor;}
    public String setAutor(String autor){return this.autor= this.autor;}

    public void prestar() {
        if (estado) {
            String nombreLector = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona que toma el libro:");
            if (nombreLector != null && !nombreLector.isEmpty()) {
                estado = false;
                lector = nombreLector;
                JOptionPane.showMessageDialog(null, "El libro ha sido prestado a " + nombreLector);
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresó un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El libro no está disponible. Prestado a " + lector);
        }}

    public void devolver() {
        if (!estado) {
            estado = true;
            JOptionPane.showMessageDialog(null, lector + " ha devuelto el libro.");
            lector = null;
        } else {
            JOptionPane.showMessageDialog(null, "El libro ya está disponible.");
        }
    }
    public boolean estadoLibro() {
        if (estado) {
            JOptionPane.showMessageDialog(null, "El libro está disponible.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El libro está prestado a " + lector);
            return false;
        }
    }

    public String mostrarEstado(boolean estado) {
        return estado ? "Disponible" : "No disponible, prestado a "+lector;
    }

    public String validarNombre(String mensaje){
        String validar = JOptionPane.showInputDialog(null, mensaje);
        while (validar.isEmpty()){
            validar = JOptionPane.showInputDialog(null, "Ingrese nuevamente un nombre valido");
        }
        return validar;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", estado=" + this.mostrarEstado(this.estado) +
                '}';
    }
}
