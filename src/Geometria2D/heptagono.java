package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class heptagono {
    private double lado, apotema, areaHeptagono, perimetroHeptagono;

    public heptagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void areaHeptagono(){
        areaHeptagono= (7*this.apotema*this.lado)/2;
    }
    public void perimetroHeptagono(){
        perimetroHeptagono = (7*this.lado);
    }

    public double getAreaHeptagono() {
        return areaHeptagono;
    }

    public double getPerimetroHeptagono() {
        return perimetroHeptagono;
    }
}
