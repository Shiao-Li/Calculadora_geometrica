import Geometria3D.*;
import Geometria2D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class principal {
    static private DecimalFormat df = new DecimalFormat(".00");
    static private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        double dato5;
        //Captura de datos
        /*System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        dato2 = sc.nextDouble();
        cono figuraCono = new cono(dato1, dato2);
        //Impresion de datos
        figuraCono.calcularAreaSuperficial();
        System.out.println("El area superficial del cono es: " + df.format(figuraCono.getAreaSuperficial()));
        figuraCono.calcularVolumen();
        System.out.println("El volumen del cono es: " + df.format(figuraCono.getVolumen()));*/

        /*System.out.println("CIRCULO");
        System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        circulo figuraCirculo = new circulo(dato1);
        figuraCirculo.areaCirculo();
        System.out.println("El area del circulo es: " +df.format(figuraCirculo.getAreaCirculo()));
        figuraCirculo.perimetroCirculo();
        System.out.println("El perimetro de la circulo es: " +df.format(figuraCirculo.getPerimetroCirculo()));*/

        /*System.out.println("CUADRADO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        cuadrado figuraCuadrado = new cuadrado(dato1);
        figuraCuadrado.areaCuadrado();
        System.out.println("El area del cuadrado es: " +df.format(figuraCuadrado.getAreaCuadrado()));
        figuraCuadrado.perimetroCuadrado();
        System.out.println("El perimetro de la cuadrado es: " +df.format(figuraCuadrado.getPerimetroCuadrado()));*/

        /*System.out.println("DECAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        decagono figuraDecagono = new decagono(dato1, dato2);
        figuraDecagono.areaDecagono();
        System.out.println("El area del decagono es: "+ df.format(figuraDecagono.getAreaDecagono()));
        figuraDecagono.perimetroDecagano();
        System.out.println("El perimetro del decagon es: " + df.format(figuraDecagono.getPerimetroDecagono()));*/

        /*System.out.println("ENEAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        eneagono figuraEneagono = new eneagono(dato1, dato2);
        figuraEneagono.areaEneagono();
        System.out.println("El area del eneagono es: "+ df.format(figuraEneagono.getAreaEneagono()));
        figuraEneagono.perimetroEneagono();
        System.out.println("El perimetro del eneagono es: " + df.format(figuraEneagono.getPerimetroEneagono()));*/

       /* System.out.println("HEPTAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        heptagono figuraHeptagono = new heptagono(dato1, dato2);
        figuraHeptagono.areaHeptagono();
        System.out.println("El area del heptagono es: "+ df.format(figuraHeptagono.getAreaHeptagono()));
        figuraHeptagono.perimetroHeptagono();
        System.out.println("El perimetro del heptagono es: " + df.format(figuraHeptagono.getPerimetroHeptagono())); */

        /*System.out.println("Hexagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        hexagono figuraHexagono = new hexagono(dato1, dato2);
        figuraHexagono.areaHexagonoo();
        System.out.println("El area del hexagono es: "+ df.format(figuraHexagono.getAreaHexagono()));
        figuraHexagono.perimetroHexagono();
        System.out.println("El perimetro del hexagono es: " + df.format(figuraHexagono.getPerimetroHexagono()));*/

        /*System.out.println("Octagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        octagono figuraoctagono = new octagono(dato1, dato2);
        figuraoctagono.areaOctagono();
        System.out.println("El area del Octagono es: "+ df.format(figuraoctagono.getAreaOctagono()));
        figuraoctagono.perimetroOctagono();
        System.out.println("El perimetro del Octagono es: " + df.format(figuraoctagono.getPerimetroOctagono()));*/

        /*System.out.println("Pentagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        pentagono figuraPentagono = new pentagono(dato1, dato2);
        figuraPentagono.areaPentagono();
        System.out.println("El area del pentagono es: "+ df.format(figuraPentagono.getAreaPentagono()));
        figuraPentagono.perimetroPentagono();
        System.out.println("El perimetro del pentagono es: " + df.format(figuraPentagono.getPerimetroPentagono()));*/

        /*System.out.println("Trapecio");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la base Mayor: ");
        dato2 = sc.nextDouble();
        System.out.print("Ingrese el valor de la base Menor: ");
        dato3 = sc.nextDouble();
        trapecio figuraTrapecio = new trapecio(dato1, dato2, dato3);
        figuraTrapecio.areaTrapecio();
        System.out.println("El area del trapecio es: "+ df.format(figuraTrapecio.getAreaTrapecio()));
        figuraTrapecio.perimetroTrAapecio();
        System.out.println("El perimetro del trapecio es: " + df.format(figuraTrapecio.getPerimetroTrapecio()));*/

        /*System.out.println("Triangulo");
        System.out.print("Ingrese el valor del lado (a): ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del lado (b): ");
        dato2 = sc.nextDouble();
        System.out.print("Ingrese el valor del lado (c): ");
        dato3 = sc.nextDouble();
        System.out.print("Ingrese el valor de la base: ");
        dato4 = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        dato5 = sc.nextDouble();
        triangulo figuraTriangulo = new triangulo(dato1, dato2, dato3,dato4, dato5);
        figuraTriangulo.areaTriangulo();
        System.out.println("El area del trapecio es: "+ df.format(figuraTriangulo.getAreaTriangulo()));
        figuraTriangulo.perimetroTriangulo();
        System.out.println("El perimetro del trapecio es: " + df.format(figuraTriangulo.getPerimetroTriangulo()));*/

    }
}

/*
        System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        dato2 = sc.nextDouble();
        cilindro figuraCilindro = new cilindro(dato1, dato2);
        //Impresion de datos
        figuraCilindro.calcularAreaSuperficial();
        System.out.println("El area superficial del cilindro es: " + df.format(figuraCilindro.getAreaSuperficial()));
        figuraCilindro.calcularVolumen();
        System.out.println("El volumen del cilindro es: " + df.format(figuraCilindro.getVolumen()));
 */