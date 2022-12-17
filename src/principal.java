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
                    mostrarMenuFiguras2D();
                    System.out.print("Elija una opción: ");
                    opcionMenu = sc.next().toUpperCase();
                    opcionSalir = true;
                    switch (opcionMenu){
                        case "A":
                            capturarDatos1("radio");
                            circulo figuraCirculo = new circulo(dato1);
                            figuraCirculo.areaCirculo();
                            figuraCirculo.perimetroCirculo();
                            imprimirResultados2D(figuraCirculo.getAreaCirculo(), figuraCirculo.getPerimetroCirculo());
                            break;
                        case "B":
                            capturarDatos1("lado");
                            cuadrado figuraCuadrado = new cuadrado(dato1);
                            figuraCuadrado.areaCuadrado();
                            figuraCuadrado.perimetroCuadrado();
                            imprimirResultados2D(figuraCuadrado.getAreaCuadrado(), figuraCuadrado.getPerimetroCuadrado());
                            break;
                        case "C":
                            capturarDatos2("lado", "apotema");
                            decagono figuraDecagono = new decagono(dato1, dato2);
                            figuraDecagono.areaDecagono();
                            figuraDecagono.perimetroDecagano();
                            imprimirResultados2D(figuraDecagono.getAreaDecagono(), figuraDecagono.getPerimetroDecagono() );
                            break;
                        case "D":
                            capturarDatos2("lado", "apotema");
                            eneagono figuraEneagono = new eneagono(dato1, dato2);
                            figuraEneagono.areaEneagono();
                            figuraEneagono.perimetroEneagono();
                            imprimirResultados2D(figuraEneagono.getAreaEneagono(), figuraEneagono.getPerimetroEneagono());
                            break;
                        case "E":
                            capturarDatos2("lado", "apotema");
                            heptagono figuraHeptagono = new heptagono(dato1,dato2);
                            figuraHeptagono.areaHeptagono();
                            figuraHeptagono.perimetroHeptagono();
                            imprimirResultados2D(figuraHeptagono.getAreaHeptagono(), figuraHeptagono.getPerimetroHeptagono());
                            break;
                        case "F":
                            capturarDatos2("lado", "apotema");
                            hexagono figuraHexagono = new hexagono(dato1, dato2);
                            figuraHexagono.areaHexagonoo();
                            figuraHexagono.perimetroHexagono();
                            imprimirResultados2D(figuraHexagono.getAreaHexagono(), figuraHexagono.getPerimetroHexagono());
                            break;
                        case "G":
                            capturarDatos2("lado", "apotema");
                            octagono figuraoctagono = new octagono(dato1, dato2);
                            figuraoctagono.areaOctagono();
                            figuraoctagono.perimetroOctagono();
                            imprimirResultados2D(figuraoctagono.getAreaOctagono(), figuraoctagono.getPerimetroOctagono());
                            break;
                        case "H":
                            capturarDatos2("lado", "apotema");
                            pentagono figuraPentagono = new pentagono(dato1, dato2);
                            figuraPentagono.areaPentagono();
                            figuraPentagono.perimetroPentagono();
                            imprimirResultados2D(figuraPentagono.getAreaPentagono(), figuraPentagono.getPerimetroPentagono());
                            break;
                        case "I":
                            capturarDatos4("lado", "base mayor","base menor", "altura");
                            trapecio figuraTrapecio = new trapecio(dato1,dato2,dato3, dato4);
                            figuraTrapecio.areaTrapecio();
                            figuraTrapecio.perimetroTrAapecio();
                            imprimirResultados2D(figuraTrapecio.getAreaTrapecio(), figuraTrapecio.getPerimetroTrapecio());
                            break;
                        case "J":
                            capturarDatos5("lado (a)","lado (b)","lado (c)","base","altura");
                            triangulo figuraTriangulo = new triangulo(dato1, dato2, dato3,dato4, dato5);
                            figuraTriangulo.areaTriangulo();
                            figuraTriangulo.perimetroTriangulo();
                            imprimirResultados2D(figuraTriangulo.getAreaTriangulo(), figuraTriangulo.getPerimetroTriangulo());
                            break;
                        case "K":
                            opcionSalir = false;
                            break;

                        default:
                            System.out.println("\nOPCION INGRESADA NO VALIDA");
                            break;
                    }
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
    private static void capturarDatos4(String palabra1, String palabra2, String palabra3, String palabra4){
        System.out.print("Ingrese el valor del dato (" + palabra1 + "): ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra2 + "): ");
        dato2 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra3 + "): ");
        dato3 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra4 + "): ");
        dato3 = sc.nextDouble();
    }
    private static void capturarDatos5(String palabra1, String palabra2, String palabra3, String palabra4, String palabra5){
        System.out.print("Ingrese el valor del dato (" + palabra1 + "): ");
        dato1 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra2 + "): ");
        dato2 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra3 + "): ");
        dato3 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra4 + "): ");
        dato4 = sc.nextDouble();
        System.out.print("Ingrese el valor del dato (" + palabra5 + "): ");
        dato5 = sc.nextDouble();
    }
    private static void imprimirResultados(double valor1, double valor2){
        System.out.println("\nResultados:");
        System.out.println("Área superficial: " + df.format(valor1));
        System.out.println("Volúmen: " + df.format(valor2));
    }
    private static void imprimirResultados2D(double valor1, double valor2){
        System.out.println("\nResultados:");
        System.out.println("Área: " + df.format(valor1));
        System.out.println("Perimetro: " + df.format(valor2));
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
    private static void mostrarMenuFiguras2D(){
        System.out.println("\n\t*** MENU FIGURAS 2D ***");
        System.out.println("A. Circulo");
        System.out.println("B. Cuadrado");
        System.out.println("C. Decagono");
        System.out.println("D. Eneagono");
        System.out.println("E. Heptagono");
        System.out.println("F. Hexagono");
        System.out.println("G. Octagono");
        System.out.println("H. Pentagono");
        System.out.println("I. Trapecio");
        System.out.println("J. Tiangulo");
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