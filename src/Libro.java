package src;

public class Libro {
    private String Nombre;
    private int Identificador;
    private boolean Estado = true;

    public Libro() {

    }

    public Libro(String Nombre, int Id) {
        this.Nombre = Nombre;
        this.Identificador = Id;
    }

    public void Prestamo() {
        System.out.println("Se presto el libro" + Nombre);
        Estado = false;
    }

    public void Devolucion() {
        System.out.println("Se devolvio el libro " + Nombre);
        Estado = true;

    }

    public void MostrarInformacion() {
        String Prestado;
        if(Estado){
            Prestado = "Disponible";
        }
        else{
            Prestado = "No disponible";
        }
        System.out.println("Nombre del libro " + Nombre);
        System.out.println("Identificador: " + Identificador);
        System.out.println("Estado: " + Prestado);
    }

    public int getId() {
        return Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setId(int Id) {
        this.Identificador = Id;

    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
