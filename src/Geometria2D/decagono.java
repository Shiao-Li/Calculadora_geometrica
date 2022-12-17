package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class decagono {
    private double lado, apotema, areaDecagono, perimetroDecagono;

    public decagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    public void areaDecagono(){
        areaDecagono = (5*this.apotema*this.lado);
    }
    public void perimetroDecagano(){
        perimetroDecagono = (10*this.lado);
    }

    public double getAreaDecagono() {
        return areaDecagono;
    }

    public double getPerimetroDecagono() {
        return perimetroDecagono;
    }
}
