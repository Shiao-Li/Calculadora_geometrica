package Geometria2D;

public class hexagono extends Figuras2D {
    private double lado, apotema;

    public hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = (3 * this.apotema * this.lado);
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = (6 * this.lado);
    }

}
