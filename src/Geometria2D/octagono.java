package Geometria2D;

public class octagono {
    private double lado, apotema, areaOctagono, perimetroOctagono;

    public octagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void areaOctagono(){
        areaOctagono= 4*this.apotema*this.lado;
    }
    public void perimetroOctagono(){
        perimetroOctagono = (8*this.lado);
    }

    public double getAreaOctagono() {
        return areaOctagono;
    }

    public double getPerimetroOctagono() {
        return perimetroOctagono;
    }
}
