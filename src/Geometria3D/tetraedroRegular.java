package Geometria3D;

public class tetraedroRegular {
    private double lado;
    private double volumen;
    private double areaSuperficial;
    //Constructor
    public tetraedroRegular(double lado) {
        this.lado = lado;
    }
    //Metodos

    public void calcularAreaSuperficial(){
        areaSuperficial = Math.sqrt(3) * Math.pow(this.lado,2);
    }

    public void calcularVolumen(){
        volumen = Math.sqrt(2) * Math.pow(this.lado,3)/12;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
