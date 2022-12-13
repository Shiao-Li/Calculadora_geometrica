package Geometria3D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ortoedro {
    private Scanner sc = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    private double areaSuperficial;
    private double volumen;

    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado 1: ");
            this.lado1 = sc.nextFloat();
            System.out.print("Ingrese el valor del lado 2: ");
            this.lado2 = sc.nextFloat();
            System.out.print("Ingrese el valor del lado 3: ");
            this.lado3 = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void calcularAreaSuperficial(){
        areaSuperficial = 2 * (lado1*lado2 + lado1*lado3 + lado2*lado3);
        System.out.println("El area superficial del cubo es: " + areaSuperficial);
    }

    public void calcularVolumen(){
        volumen = lado1*lado2*lado3;
        System.out.println("El volumen del cubo es: " + volumen);
    }

}
