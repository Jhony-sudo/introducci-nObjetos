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
    private char Sexo;
    private double Peso;
    private double Altura;

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String Nombree;
        int Edad;
        char Sexo;
        double Pesoo;
        double Alturaa;

        leer.nextLine();
        System.out.println("Ingrese el nombre");
        Nombree  = leer.nextLine();
        System.out.println("Ingrese la edad");
        Edad = leer.nextInt();
        System.out.println("Ingrese el sexo");
        Sexo = leer.next().charAt(0);
        System.out.println("Ingrese el peso");
        Pesoo = leer.nextDouble();
        System.out.println("Ingrese la altura");
        Alturaa = leer.nextFloat();

        Bono Persona1 = new Bono(Nombree,Edad,Sexo,Pesoo,Alturaa);
        Bono Persona2 = new Bono(Nombree,Edad,Sexo);
        Bono Persona3 = new Bono();
        Persona3.setAltura(1.75);
        Persona3.setEdad(24);
        Persona3.setSexo('M');
        Persona3.setPeso(90);
        Persona3.setNombre("Carlos");

        System.out.println("Comprobando Peso Ideal");
        Persona1.CalcularIMC();
        Persona2.CalcularIMC();
        Persona3.CalcularIMC();

        System.out.println("\nComprobando mayor de edad");
        Persona1.EsMayor();
        Persona2.EsMayor();
        Persona3.EsMayor();

        System.out.println("\nMostrando Datos de las 3 personas");
        Persona1.toStringg();
        Persona2.toStringg();
        Persona3.toStringg();


    }

    public Bono(){
        this.Nombre = "";
        this.Edad = 0;
        this.Sexo = SEXO_DEFECTO;
        this.Peso = 0;
        this.Altura = 0;
        this.Dni = 0;
    }

    public Bono(String Nom,int Edad,char sexo){
        this.Nombre = Nom;
        this.Edad = Edad;
        this.Sexo = sexo;
        this.Peso = 1;
        this.Altura = 1;
        this.Dni = 0;
    }

    public Bono(String Nom,int Edad,char sexo,double peso,double Altura){
        this.Nombre = Nom;
        this.Edad = Edad;
        this.Sexo = sexo;
        this.Peso = peso;
        this.Altura = Altura;
        this.Dni = GenerarDni();

    }

    public int CalcularIMC(){
        int Imc;
        int Estado = 0;
        Imc = (int)Peso/(int)Altura*(int)Altura;
        if(Imc<20){
            Estado = PESO_IDEAL;
            System.out.println(Nombre + "tu peso es: Peso Ideal");
        }
        if(Imc>=20 & Imc<=25){
            Estado = POR_DEBAJO;
            System.out.println(Nombre + " Tu Peso esta por debajo del ideal");
        }
        if(Imc>25){
            Estado = SOBREPESO;
            System.out.println(Nombre + " tienes sobre peso, haz ejercicio");
        }

        return Estado;
    }

    public boolean EsMayor(){
        boolean EsMayor;
        if(Edad >= 18){
            EsMayor = true;
            System.out.println(Nombre + " Es mayor de edad");
        }
        else{
            EsMayor = false;
            System.out.println(Nombre + " No es mayor de edad");
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

    public void setAltura(double Altura){
        this.Altura = Altura;
    }

    public void setPeso(double peso){
        this.Peso = peso;
    }


}
