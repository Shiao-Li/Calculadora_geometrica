package Geometria2D;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cuadrado {
    private double lado, areaCuadrado, perimetroCuadrado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public void areaCuadrado(){
        areaCuadrado = Math.pow(this.lado, 2);
    }
    public void perimetroCuadrado(){
        perimetroCuadrado = 4 * this.lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public double getPerimetroCuadrado() {
        return perimetroCuadrado;
    }
}
