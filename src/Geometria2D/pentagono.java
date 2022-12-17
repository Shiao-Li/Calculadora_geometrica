package Geometria2D;

public class pentagono {
    private double lado, apotema, areaPentagono, perimetroPentagono;

    public pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    public void areaPentagono(){
        areaPentagono= (5*this.lado*this.apotema)/2;
    }
    public void perimetroPentagono(){
        perimetroPentagono = (5*this.lado);
    }

    public double getAreaPentagono() {
        return areaPentagono;
    }

    public double getPerimetroPentagono() {
        return perimetroPentagono;
    }
}
