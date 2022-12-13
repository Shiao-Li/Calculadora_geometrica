package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuadrado {
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
}
