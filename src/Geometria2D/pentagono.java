package Geometria2D;

public class pentagono extends Figuras2D {
    private double lado, apotema;

    public pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = (5 * this.lado * this.apotema) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = (5 * this.lado);
    }


}
