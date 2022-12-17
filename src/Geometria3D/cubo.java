package Geometria3D;
public class cubo {
    private double lado;
    private double volumen;
    private double areaSuperficial;
    //Constructor
    public cubo(double lado) {
        this.lado = lado;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = 6 * Math.pow(this.lado, 2);
    }

    public void calcularVolumen(){
        volumen = Math.pow(this.lado,3);
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
