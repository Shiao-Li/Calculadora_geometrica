package Geometria2D;

public class octagono extends Figuras2D {
    private double lado, apotema;

    public octagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = 4 * this.apotema * this.lado;
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = (8 * this.lado);
    }


}
