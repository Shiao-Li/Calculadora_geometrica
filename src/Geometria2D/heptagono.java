package Geometria2D;

public class heptagono extends Figuras2D {
    private double lado, apotema;

    public heptagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = (7 * this.apotema * this.lado) / 2;
    }

    protected void calcularPerimetro() {
        this.perimetro = (7 * this.lado);
    }

}
