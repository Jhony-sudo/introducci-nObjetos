package src;

public class Circulo {

    private int Radio;
    private double Perimetro;
    private Double Area;
    static double PI = 3.1416;

    public Circulo(int radio) {
        this.Radio = radio;
    }

    public void CalcularArea() {
        Area = 2 * PI * Radio * Radio;
    }

    public void CalcularPerimetro() {
        Perimetro = 2 * PI * Radio;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public double getArea() {
        return Area;
    }

    public int getRadio() {
        return Radio;
    }

    public void setRadio(int radio) {
        this.Radio = radio;
    }

}
