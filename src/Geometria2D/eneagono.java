package Geometria2D;

public class eneagono extends Figuras2D {
    private double lado, apotema;

    public eneagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = (5 * this.apotema * this.lado);
    }

    protected void calcularPerimetro() {
        this.perimetro = (9 * this.lado);
    }

}
