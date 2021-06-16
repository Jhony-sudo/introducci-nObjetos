package src;

public class Principal {
    public static void main(String[] args) {
        Principal p = new Principal();

    }

        

    public Principal() {
        //Primeras variables 
        Circulo circulo = new Circulo(5);
        Contador co = new Contador();
        Cuadrado cua = new Cuadrado(10);
        Fraccion Fracc = new Fraccion(1, 2, 1, 10);
        Libro Libro1 = new Libro("HarryPotter", 1);
        Rectangulo r = new Rectangulo(4,3);
        
        //Segundas variables
        Rectangulo r2 = r;
        Contador co2 = co;
        Cuadrado Cu2 = cua;
        Fraccion Fracc2 = Fracc;
        Libro Libro2 = Libro1;
        Circulo Circulo2 = circulo;

        //Modificaciones
        r2.setAncho(5);
        r2.CalcularArea();
        r2.CalcularPerimetro();
        System.out.println("Rectangulo");
        System.out.println("Rectangulo area " + r.getArea());
        System.out.println("Rectangulo Perimetro" + r.getPerimetro());

        System.out.println("\nLibro");
        Libro2.setNombre("El se;or de los anillos");
        Libro1.MostrarInformacion();

        
        System.out.println("\nContador");
        co2.setContador(5);
        co2.Aumentar();
        System.out.println(co.getContador());

        
        System.out.println("\nCirculo");
        Circulo2.CalcularArea();
        System.out.println("El area es de" + circulo.getArea());
        
        System.out.println("\nFraccion");
        Fracc2.Multiplicar();
        Fracc.MostrarResultado();

        System.out.println("\nCuadrado");
        Cu2.setLado(10);
        System.out.println("El lado del cuadrado es de " + cua.getLado());

    }

}
