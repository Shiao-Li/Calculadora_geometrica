import Geometria3D.*;

import java.util.Scanner;

public class principal {
    static private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;

        //Captura de datos
        System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        dato2 = sc.nextDouble();
        cilindro figuraCilindro = new cilindro(dato1, dato2);
        //Impresion de datos
        figuraCilindro.calcularAreaSuperficial();
        System.out.println("El area superficial del cilindro es: " + figuraCilindro.getAreaSuperficial());
        figuraCilindro.calcularVolumen();
        System.out.println("El volumen del cilindro es: " + figuraCilindro.getVolumen());


    }
}

/*


 */