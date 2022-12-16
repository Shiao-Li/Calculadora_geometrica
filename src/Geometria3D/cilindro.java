package Geometria3D;

import java.util.InputMismatchException;
import java.util.Scanner;
public class cilindro {
    private Scanner sc = new Scanner(System.in);
    private double radio;
    private double altura;
    private double volumen;
    private double areaSuperficial;
    //Constructores

    public cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = 2 * Math.PI * this.radio * (this.altura + this.radio);
    }

    public void calcularVolumen(){
        volumen = Math.PI * Math.pow(this.radio, 2) * this.altura;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
