package Geometria3D;

public class esfera {
    private double radio;
    private double volumen;
    private double areaSuperficial;
    //Constructor
    public esfera(double radio) {
        this.radio = radio;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        areaSuperficial = 4 * Math.PI * Math.pow(this.radio, 2);
    }
    public void calcularVolumen(){
        volumen = (4 * Math.PI * Math.pow(this.radio,3))/3;
    }
    public double getVolumen() {
        return volumen;
    }
    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
