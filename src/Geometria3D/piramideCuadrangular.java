package Geometria3D;

public class piramideCuadrangular {
    private double lado;
    private double altura;
    private double volumen;
    private double areaSuperficial;
    //Constructor
    public piramideCuadrangular(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = this.lado * (this.lado + Math.sqrt(4 * Math.pow(this.altura,2) + Math.pow(this.lado,2)));
    }
    public void calcularVolumen(){
        volumen = (Math.pow(this.lado,2) * this.altura)/3;
    }
    public double getVolumen() {
        return volumen;
    }
    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
