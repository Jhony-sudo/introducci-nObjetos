package src;
import java.util.Random;
import java.util.Scanner;
public class Bono {
    //Constantes
    private static char SEXO_DEFECTO = 'M';
    private static int PESO_IDEAL = -1;
    private static int POR_DEBAJO = 0;
    private static int SOBREPESO =  1;
    Random r = new Random();

    private String Nombre;
    private int Edad;
    private int Dni;
    private char Sexo = SEXO_DEFECTO;
    private double Peso;
    private float Altura;

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String Nombree;
        int Edad;
        char Sexo;
        double Pesoo;
        float Alturaa;

        leer.nextLine();
        System.out.println("Ingrese el nombre");
        Nombree  = leer.nextLine();
        System.out.println("Ingrese la edad");
        Edad = leer.nextInt();
        System.out.println("Ingrese el sexo");
        Sexo = leer.next();
        System.out.println("Ingrese el peso");
        Pesoo = leer.nextDouble();
        System.out.println("Ingrese la altura");
        Alturaa = leer.nextFloat();

        Bono Persona1 = new Bono();
        Bono Persona2 = new Bono();
        Bono Persona3 = new Bono();

    }

    public Bono(){

    }

    public Bono(String Nom,int Edad,char sexo){
        this.Nombre = Nom;
        thos.Edad = Edad;
        this.Sexo = sexo;

    }

    public Bono(String Nom,int Edad,char sexo,int dni,double peso,float Altura){
        this.Nombre = Nom;
        thos.Edad = Edad;
        this.Sexo = sexo;
        this.Peso = peso;
        this.Altura = Altura;
        this.Dni = dni;

    }

    public int CalcularIMC(){
        int Imc;
        int Estado;
        Imc = Peso/Altura*Altura;
        if(Imc<20){
            Estado = PESO_IDEAL;
        }
        if(Imc>=20 & Imc<=25){
            Estado = POR_DEBAJO;
        }
        if(Imc>25){
            Estado = SOBREPESO;
        }

        return Estado;
    }

    public boolean EsMayor(){
        boolean EsMayor;
        if(Edad >= 18){
            EsMayor = true;
        }
        else{
            EsMayor = false;
        }

        return EsMayor;

    }

    public void ComprobarSexo(char sexo){
        if(sexo== 'M' || sexo == 'F'){

        }
        else{
            System.out.println("El sexo introducido no es correcto");
        }

    }

    public void toStringg(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Sexo: " + Sexo);
        System.out.println("DNI: " + Dni);
        System.out.println("Altura: " + Altura);
        System.out.println("Peso: " + Peso);
    }

    public int GenerarDni(){
        int id = r.nextInt(100)+10000000;
        return id;

    }

    public void setSexo(char sexo){
        this.Sexo = sexo;
    }

    public void setNombre(String Nom){
        this.Nombre = Nom;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public void setAltura(float Altura){
        this.Altura = Altura;
    }

    public void setPeso(double peso){
        this.Peso = peso;
    }


}
