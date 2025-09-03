package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Cliente> listaClientes = new ArrayList();
    private ArrayList<Empleado> listaEmpleados = new ArrayList();
    private ArrayList<Libro> listaLibros = new ArrayList();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList();

    Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
