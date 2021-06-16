package src;

public class Contador {

    String NombreContador;
    int Contador;

    public Contador() {
        this.NombreContador = "";
        this.Contador = 0;
    }

    public Contador(String Nombre) {
        this.NombreContador = Nombre;
    }

    public Contador(Contador contador){
        this.NombreContador = contador.getNombre();
        this.Contador = contador.getContador();
    }

    public void Aumentar() {
        Contador++;
    }

    public void Disminuir() {
        Contador--;
    }

    public int getContador() {
        return Contador;
    }

    public String getNombre() {
        return NombreContador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public void setNombre(String Nombre) {
        this.NombreContador = Nombre;
    }
}
