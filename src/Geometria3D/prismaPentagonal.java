package Geometria3D;
public class prismaPentagonal {
    private double lado;
    private double altura;
    private double apotema;

    private double volumen;
    private double areaSuperficial;
    //Constructor
    public prismaPentagonal(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    //Metodos
    public void calcularAreaSuperficial(){
        apotema = this.lado/(2 * Math.tan(36 * Math.PI/180));
        areaSuperficial = 5 * this.lado * (this.altura + apotema);
    }
    public void calcularVolumen(){
        volumen = (5 * this.lado * apotema)/2 * this.altura;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
