package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class eneagono {
    private double lado, apotema, areaEneagono, perimetroEneagono;

    public eneagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void areaEneagono(){
        areaEneagono = (5*this.apotema*this.lado);
    }
    public void perimetroEneagono(){
        perimetroEneagono = (9*this.lado);
    }

    public double getAreaEneagono() {
        return areaEneagono;
    }

    public double getPerimetroEneagono() {
        return perimetroEneagono;
    }
}
