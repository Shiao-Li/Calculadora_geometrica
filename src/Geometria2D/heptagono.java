package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class heptagono {
    private double lado, apotema;
    private Scanner sc = new Scanner(System.in);
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado: ");
            this.lado = sc.nextFloat();
            System.out.print("Ingrese el valor del apotema: ");
            this.apotema = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }
    public void areaHeptagono(){
        double areaHeptagono= (7*apotema*lado)/2;
        System.out.println("El area del decagono es: "+areaHeptagono);
    }
    public void perimetroHeptagono(){
        double perimetroHeptagono = (7*lado);
        System.out.println("El perimetro del eneagono es: " + perimetroHeptagono);
    }
}
