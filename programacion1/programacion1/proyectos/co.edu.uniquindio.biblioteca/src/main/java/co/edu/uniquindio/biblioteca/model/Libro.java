package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String nombre;
    private String id;
    private String autor;
    private String editorial;
    private String año;
    public Libro(String nombre, String id, String autor, String editorial, String año) {
        this.nombre=nombre;
        this.id=id;
        this.autor=autor;
        this.editorial=editorial;
        this.año=año;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getId(){ return id; }
    public void setId(String id){ this.id=id;}
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor=autor; }
    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial=editorial;}
    public String getAño() { return año; }
    public void setAño(String año){ this.año=año; }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", año='" + año + '\'' +
                '}';
    }
}
