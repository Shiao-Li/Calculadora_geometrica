package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class circulo {
    private double lado, radio, base, altura;
    private Scanner sc = new Scanner(System.in);
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado: ");
            this.lado = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void areaCirculo(){

    }



}
