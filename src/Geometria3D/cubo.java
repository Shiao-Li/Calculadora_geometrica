package Geometria3D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cubo {
    private Scanner sc = new Scanner(System.in);
    private double lado;
    private double volumen;
    private double areaSuperficial;
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado: ");
            this.lado = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void calcularAreaSuperficial(){
        areaSuperficial = 6 * Math.pow(lado, 2);
        System.out.println("El area superficial del cubo es: " + areaSuperficial);
    }

    public void calcularVolumen(){
        volumen = Math.pow(lado,3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

}
