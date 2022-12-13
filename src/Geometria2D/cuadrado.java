package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuadrado {
    private double lado;
    private Scanner sc = new Scanner(System.in);
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado: ");
            this.lado = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }
    public void areaCuadrado(){
        double areaCuadrado = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: "+areaCuadrado);
    }
    public void perimetroCuadrado(){
        double perimetroCuadrado = 4 * lado;
        System.out.println("El perimetro del cuadrado es: "+perimetroCuadrado);
    }

}
