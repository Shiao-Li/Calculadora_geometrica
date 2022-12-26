package Geometria2D;

public class trapecio extends Figuras2D {
    private double lado, baseMayor, baseMenor, altura;

    public trapecio(double lado, double baseMayor, double baseMenor, double altura) {
        this.lado = lado;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = ((this.baseMayor + this.baseMenor) / 2) * this.altura;
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = this.baseMayor + this.baseMenor + this.lado + this.lado;
    }


}
