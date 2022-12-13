package Geometria3D;
import java.util.InputMismatchException;
import java.util.Scanner;
public class cono {
    private Scanner sc = new Scanner(System.in);
    private double radio;
    private double altura;
    private double generatriz;
    private double areaSuperficial;
    private double volumen;
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
        generatriz = Math.sqrt(Math.pow(altura,2) + Math.pow(radio,2));
        areaSuperficial = Math.PI * radio * (radio + generatriz);
        System.out.println("El area superficial del cono es: " + areaSuperficial);
    }

    public void calcularVolumen(){
        volumen = (Math.PI * Math.pow(radio,2) * altura)/3;
        System.out.println("El volumen del cono es: " + volumen);
    }
}
