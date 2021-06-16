package src;

public class Cuadrado {
    int Lado;
    private int Area;
    private int Perimetro;

    public Cuadrado(int Lado) {
        this.Lado = Lado;
    }

    public void CalcularArea() {
        Area = Lado * Lado;
    }

    public void CalcularPerimetro() {
        Perimetro = 4 * Lado;
    }

    public void setLado(int lado){
        this.Lado = lado;
    }

    public int getLado(){

        return Lado;
    }

    

}
