package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hexagono {
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
    public void areaHexagonoo(){
        double areaHexagonoo= (3*apotema*lado);
        System.out.println("El area del decagono es: "+areaHexagonoo);
    }
    public void perimetroHexagono(){
        double perimetroHexagono = (6*lado);
        System.out.println("El perimetro del eneagono es: " + perimetroHexagono);
    }
}
