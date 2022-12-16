package Geometria3D;
public class cono {
    private double radio;
    private double altura;
    private double generatriz;
    private double areaSuperficial;
    private double volumen;
    //Constructor
    public cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        generatriz = Math.sqrt(Math.pow(this.altura,2) + Math.pow(this.radio,2));
        areaSuperficial = Math.PI * this.radio * (this.radio + generatriz);
    }

    public void calcularVolumen(){
        volumen = (Math.PI * Math.pow(this.radio,2) * this.altura)/3;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }

    public double getVolumen() {
        return volumen;
    }
}
