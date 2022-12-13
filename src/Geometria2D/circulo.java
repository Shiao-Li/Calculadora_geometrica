package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class circulo {
    private double lado, radio, base, altura;
    private Scanner sc = new Scanner(System.in);
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del radio: ");
            this.radio = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void areaCirculo(){
        double areaCirculo = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area del cirulo es: " + areaCirculo);
    }
    public void perimetroCirculo(){
        double perimetroCirculo = 2 * Math.PI * radio;
        System.out.println("El perimetro del cirulo es: " + perimetroCirculo);
    }

}
