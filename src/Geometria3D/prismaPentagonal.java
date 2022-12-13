package Geometria3D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prismaPentagonal {
    private Scanner sc = new Scanner(System.in);
    private double ladoPentagono;
    private double apotema;
    private double altura;
    private double perimetroPentagono;
    private double areaBase;
    private double volumen;
    private double areaSuperficial;
    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del lado: ");
            this.ladoPentagono = sc.nextFloat();
            System.out.print("Ingrese el valor del apotema: ");
            this.apotema = sc.nextFloat();
            System.out.print("Ingrese el valor de la altura: ");
            this.altura = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void calcularAreaSuperficial(){
        areaSuperficial = 5 * ladoPentagono * (altura + apotema);
        System.out.println("El area superficial del prisma pentagonal es: " + areaSuperficial);
    }

    public void calcularVolumen(){
        areaBase = (5 * ladoPentagono * apotema)/2;
        volumen = areaBase * altura;
        System.out.println("El volumen del prisma pentagonal cubo es: " + volumen);
    }
}
