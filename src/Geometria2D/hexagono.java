package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hexagono {
    private double lado, apotema, areaHexagono, perimetroHexagono;

    public hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void areaHexagonoo(){
        areaHexagono= (3*this.apotema*this.lado);
    }
    public void perimetroHexagono(){
        perimetroHexagono = (6*this.lado);
    }

    public double getAreaHexagono() {
        return areaHexagono;
    }

    public double getPerimetroHexagono() {
        return perimetroHexagono;
    }
}
