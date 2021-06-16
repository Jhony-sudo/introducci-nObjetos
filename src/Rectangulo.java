package src;

public class Rectangulo {

    private int Base;
    private int Altura;
    private int Area;
    private int Perimetro;

    public static void main(String[] args) {
        Rectangulo Rec = new Rectangulo(5, 5);
        Rec.CalcularArea();
        Rec.CalcularPerimetro();
        System.out.println("El area es de  " + Rec.getArea());
        System.out.println("El perimetro es de " + Rec.getPerimetro());
    }

    public Rectangulo(int base, int altura) {
        if (base != altura) {
            this.Base = base;
            this.Altura = altura;
        } else {
            System.out.println("Los datos ingresados no deben de ser iguales");
        }

    }

    public void CalcularArea() {

        Area = Base * Altura;
    }

    public void CalcularPerimetro() {
        Perimetro = 2 * Base + 2 * Altura;
    }

    public int getArea() {
        return Area;
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setAncho(int anch){
        this.Base = anch;
    }

}
