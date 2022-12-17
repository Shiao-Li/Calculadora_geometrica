package Geometria2D;
public class circulo {
    private double radio, areaCirculo, perimetroCirculo;
    public circulo(double radio) {
        this.radio = radio;
    }

    //metodos
    public void areaCirculo(){
        areaCirculo = Math.PI * (Math.pow(this.radio, 2));
    }
    public void perimetroCirculo(){
        perimetroCirculo = 2 * Math.PI * this.radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public double getPerimetroCirculo() {
        return perimetroCirculo;
    }
}
