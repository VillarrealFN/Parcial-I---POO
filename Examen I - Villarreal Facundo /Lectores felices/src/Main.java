import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String nombre = "";
        String autor = "";

        Libro libroUno = new Libro( nombre, autor, true, null);



        String[] menu = {"Buscador de libros", "Estado del libro", "Alquilar Libro", "Devolver", "Salir"};

        int opcion;


        do {
            opcion = JOptionPane.showOptionDialog(null, "Lectores felices", "Seleccione una opcion"
                    , 0, 0, null, menu, menu[0]);

            switch (opcion){
                case 0:
                    nombre = libroUno.validarNombre("Ingrese nombre del libro");
                    autor = libroUno.validarNombre("Ingrese nombre del autor del libro");
                    libroUno.setNombre(nombre);
                    libroUno.setAutor(autor);
                    JOptionPane.showMessageDialog(null, libroUno);
                    break;

                case 1:
                    libroUno.estadoLibro();
                    break;

                case 2:
                    libroUno.prestar();
                    break;

                case 3:
                    libroUno.devolver();
                    break;

                case 4:
                    break;
            }
        } while(opcion !=4);
    }


}