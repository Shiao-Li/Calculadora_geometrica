package Geometria3D;
import java.util.Scanner;

public class ortoedro {
    private double lado1;
    private double lado2;
    private double lado3;
    private double areaSuperficial;
    private double volumen;
    //Constructor
    public ortoedro(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = 2 * (this.lado1 * this.lado2 + this.lado1 * this.lado3 + this.lado2 * this.lado3);
    }
    public void calcularVolumen(){
        volumen = this.lado1 * this.lado2 * this.lado3;
    }
    public double getAreaSuperficial() {
        return areaSuperficial;
    }
    public double getVolumen() {
        return volumen;
    }
}
