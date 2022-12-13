package Geometria3D;

import java.util.InputMismatchException;
import java.util.Scanner;
public class cilindro {
    private Scanner sc = new Scanner(System.in);
    private double radio;
    private double altura;
    private double volumen;
    private double areaSuperficial;

    public void capturarDatos(){
        try{
            System.out.print("Ingrese el valor del radio: ");
            this.radio = sc.nextFloat();
            System.out.print("Ingrese el valor de la altura: ");
            this.altura = sc.nextFloat();
        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
    }

    public void calcularAreaSuperficial(){
        areaSuperficial = 2 * Math.PI * radio * (altura + radio);
        System.out.println("El area superficial del cubo es: " + areaSuperficial);
    }

    public void calcularVolumen(){
        volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cubo es: " + volumen);
    }

}
