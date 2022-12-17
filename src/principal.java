import Geometria3D.*;
import Geometria2D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class principal {
    static private DecimalFormat df = new DecimalFormat(".00");
    static private Scanner sc = new Scanner(System.in);
    static private double dato1;
    static private double dato2;
    static private double dato3;
    static private double dato4;
    static private double dato5;
    public static void main(String[] args) {

        String opcionMenu;
        boolean opcionSalir;
        do {
            mostrarMenuPrincipal();
            System.out.print("Elija una opción: ");
            opcionMenu = sc.next().toUpperCase();
            opcionSalir = true;
            switch (opcionMenu){
                case "A":

                    break;
                case "B":
                    mostrarMenuFiguras3D();
                    System.out.print("Elija una opción: ");
                    opcionMenu = sc.next().toUpperCase();
                    opcionSalir = true;
                    switch (opcionMenu){
                        case "A":
                            capturarDatos2("radio", "altura");
                            cilindro figuraCilindro = new cilindro(dato1, dato2);
                            figuraCilindro.calcularAreaSuperficial();
                            figuraCilindro.calcularVolumen();
                            imprimirResultados(figuraCilindro.getAreaSuperficial(), figuraCilindro.getVolumen());
                            break;
                        case "B":
                            capturarDatos2("radio","altura");
                            cono figuraCono = new cono(dato1, dato2);
                            figuraCono.calcularAreaSuperficial();
                            figuraCono.calcularVolumen();
                            imprimirResultados(figuraCono.getAreaSuperficial(), figuraCono.getVolumen());
                            break;
                        case "C":
                            capturarDatos1("lado");
                            cubo figuraCubo = new cubo(dato1);
                            figuraCubo.calcularAreaSuperficial();
                            figuraCubo.calcularVolumen();
                            imprimirResultados(figuraCubo.getAreaSuperficial(), figuraCubo.getVolumen());
                            break;
                        case "D":
                            capturarDatos1("radio");
                            esfera figuraEsfera = new esfera(dato1);
                            figuraEsfera.calcularAreaSuperficial();
                            figuraEsfera.calcularVolumen();
                            imprimirResultados(figuraEsfera.getAreaSuperficial(), figuraEsfera.getVolumen());
                            break;
                        case "E":
                            capturarDatos1("lado");
                            octaedroRegular figuraOctaedro = new octaedroRegular(dato1);
                            figuraOctaedro.calcularAreaSuperficial();
                            figuraOctaedro.calcularVolumen();
                            imprimirResultados(figuraOctaedro.getAreaSuperficial(), figuraOctaedro.getVolumen());
                            break;
                        case "F":
                            capturarDatos3("lado a", "lado b", "lado c");
                            ortoedro figuraOrtoedro = new ortoedro(dato1, dato2, dato3);
                            figuraOrtoedro.calcularAreaSuperficial();
                            figuraOrtoedro.calcularVolumen();
                            imprimirResultados(figuraOrtoedro.getAreaSuperficial(), figuraOrtoedro.getVolumen());
                            break;
                        case "G":
                            capturarDatos2("lado", "altura");
                            piramideCuadrangular figuraPiramide = new piramideCuadrangular(dato1, dato2);
                            figuraPiramide.calcularAreaSuperficial();
                            figuraPiramide.calcularVolumen();
                            imprimirResultados(figuraPiramide.getAreaSuperficial(), figuraPiramide.getVolumen());
                            break;
                        case "H":
                            break;
                        case "I":
                            break;
                        case "J":
                            break;
                        case "K":
                            opcionSalir = false;
                            break;
                        default:
                            System.out.println("\nOPCION INGRESADA NO VALIDA");
                            break;
                    }
                    break;
                case "C":
                    opcionSalir = false;
                    break;
            }

        } while (opcionSalir);
    }
    /*
    try{

        } catch (InputMismatchException error) {
            System.err.printf("%nExcepcion (Ingreso incorrecto de datos): %s%n", error);
        }
     */
    private static void capturarDatos1(String palabra1){
        System.out.print("Ingrese el valor del dato (" + palabra1 + "): ");
        dato1 = sc.nextDouble();
    }
    private static void capturarDatos2(String palabra1, String palabra2){
        System.out.print("Ingrese el valor del dato (" + palabra1 + "): ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra2 + "): ");
        dato2 = sc.nextDouble();
    }
    private static void capturarDatos3(String palabra1, String palabra2, String palabra3){
        System.out.print("Ingrese el valor del dato (" + palabra1 + "): ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra2 + "): ");
        dato2 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra3 + "): ");
        dato3 = sc.nextDouble();
    }
    private static void imprimirResultados(double valor1, double valor2){
        System.out.println("\nResultados:");
        System.out.println("Área superficial: " + df.format(valor1));
        System.out.println("Volúmen: " + df.format(valor2));
    }
    private static void mostrarMenuPrincipal(){
        System.out.println("\n\t*** MENU ***");
        System.out.println("A. Figuras 2D");
        System.out.println("B. Figuras 3D");
        System.out.println("C. Salir");
    }
    private static void mostrarMenuFiguras3D(){
        System.out.println("\n\t*** MENU FIGURAS 3D ***");
        System.out.println("A. Cilindro");
        System.out.println("B. Cono");
        System.out.println("C. Cubo");
        System.out.println("D. Esfera");
        System.out.println("E. Octaedro Regular");
        System.out.println("F. Ortoedro");
        System.out.println("G. Pirámide");
        System.out.println("H. Prisma pentagonal");
        System.out.println("I. Tetraedro regular");
        System.out.println("J. Tronco de cono");
        System.out.println("K. Salir");
    }
}

        /*
        System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        dato2 = sc.nextDouble();
        cono figuraCono = new cono(dato1, dato2);
        //Impresion de datos
        figuraCono.calcularAreaSuperficial();
        System.out.println("El area superficial del cono es: " + df.format(figuraCono.getAreaSuperficial()));
        figuraCono.calcularVolumen();
        System.out.println("El volumen del cono es: " + df.format(figuraCono.getVolumen()));*/

        /*
        System.out.println("CIRCULO");
        System.out.print("Ingrese el valor del radio: ");
        dato1 = sc.nextDouble();
        circulo figuraCirculo = new circulo(dato1);
        figuraCirculo.areaCirculo();
        System.out.println("El area del circulo es: " +df.format(figuraCirculo.getAreaCirculo()));
        figuraCirculo.perimetroCirculo();
        System.out.println("El perimetro de la circulo es: " +df.format(figuraCirculo.getPerimetroCirculo()));*/

        /*
        System.out.println("CUADRADO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        cuadrado figuraCuadrado = new cuadrado(dato1);
        figuraCuadrado.areaCuadrado();
        System.out.println("El area del cuadrado es: " +df.format(figuraCuadrado.getAreaCuadrado()));
        figuraCuadrado.perimetroCuadrado();
        System.out.println("El perimetro de la cuadrado es: " +df.format(figuraCuadrado.getPerimetroCuadrado()));*/

        /*
        System.out.println("DECAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        decagono figuraDecagono = new decagono(dato1, dato2);
        figuraDecagono.areaDecagono();
        System.out.println("El area del decagono es: "+ df.format(figuraDecagono.getAreaDecagono()));
        figuraDecagono.perimetroDecagano();
        System.out.println("El perimetro del decagon es: " + df.format(figuraDecagono.getPerimetroDecagono()));*/

        /*
        System.out.println("ENEAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        eneagono figuraEneagono = new eneagono(dato1, dato2);
        figuraEneagono.areaEneagono();
        System.out.println("El area del eneagono es: "+ df.format(figuraEneagono.getAreaEneagono()));
        figuraEneagono.perimetroEneagono();
        System.out.println("El perimetro del eneagono es: " + df.format(figuraEneagono.getPerimetroEneagono()));*/

       /*
        System.out.println("HEPTAGONO");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        heptagono figuraHeptagono = new heptagono(dato1, dato2);
        figuraHeptagono.areaHeptagono();
        System.out.println("El area del heptagono es: "+ df.format(figuraHeptagono.getAreaHeptagono()));
        figuraHeptagono.perimetroHeptagono();
        System.out.println("El perimetro del heptagono es: " + df.format(figuraHeptagono.getPerimetroHeptagono())); */

        /*
        System.out.println("Hexagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        hexagono figuraHexagono = new hexagono(dato1, dato2);
        figuraHexagono.areaHexagonoo();
        System.out.println("El area del hexagono es: "+ df.format(figuraHexagono.getAreaHexagono()));
        figuraHexagono.perimetroHexagono();
        System.out.println("El perimetro del hexagono es: " + df.format(figuraHexagono.getPerimetroHexagono()));*/

        /*
        System.out.println("Octagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        octagono figuraoctagono = new octagono(dato1, dato2);
        figuraoctagono.areaOctagono();
        System.out.println("El area del Octagono es: "+ df.format(figuraoctagono.getAreaOctagono()));
        figuraoctagono.perimetroOctagono();
        System.out.println("El perimetro del Octagono es: " + df.format(figuraoctagono.getPerimetroOctagono()));*/

        /*
        System.out.println("Pentagono");
        System.out.print("Ingrese el valor del lado: ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del apotema: ");
        dato2 = sc.nextDouble();
        pentagono figuraPentagono = new pentagono(dato1, dato2);
        figuraPentagono.areaPentagono();
        System.out.println("El area del pentagono es: "+ df.format(figuraPentagono.getAreaPentagono()));
        figuraPentagono.perimetroPentagono();
        System.out.println("El perimetro del pentagono es: " + df.format(figuraPentagono.getPerimetroPentagono()));*/

        /*
        System.out.println("Trapecio");
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

        /*
        System.out.println("Triangulo");
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


/*

 */