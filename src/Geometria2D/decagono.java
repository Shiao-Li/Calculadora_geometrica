package Geometria2D;

public class decagono extends Figuras2D {
    private double lado, apotema;

    public decagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = (5*this.apotema*this.lado);
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = (10*this.lado);
    }

}
