package src;

public class Fraccion {
    private int Numerador1;
    private int Denominador1;

    private int Numerador2;
    private int Denominador2;

    private int NumRes;
    private int DenRes;

    public static void main(String[] args) {
        Fraccion F1 = new Fraccion(1, 2, 3, 5);

        F1.Sumar();
        F1.MostrarResultado();
        F1.Multiplicar();
        F1.MostrarResultado();
    }

    public Fraccion(int Num1, int Den1, int Num2, int Den2) {
        this.Numerador1 = Num1;
        this.Denominador1 = Den1;
        this.Numerador2 = Num2;
        this.Denominador2 = Den2;
    }

    public void Sumar() {
        NumRes = Denominador2 * Numerador1 + Denominador1 * Numerador2;
        DenRes = Denominador1 * Denominador2;

    }

    public void Restar() {
        NumRes = Denominador2 * Numerador1 - Denominador1 * Numerador2;
        DenRes = Denominador1 * Denominador2;
    }

    public void Dividir() {
        DenRes = Numerador2 * Denominador1;
        NumRes = Numerador1 * Denominador2;
    }

    public void Multiplicar() {
        DenRes = Denominador1 * Denominador2;
        NumRes = Numerador1 * Numerador2;
    }

    public void MostrarResultado() {
        System.out.println(NumRes + "/" + DenRes);
    }

}
