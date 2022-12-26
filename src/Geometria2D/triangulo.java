package Geometria2D;

public class triangulo extends Figuras2D {
    private double lado1, lado2, lado3, base, altura;

    public triangulo(double lado1, double lado2, double lado3, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = ((this.base * this.altura)/2);
    }

    protected void calcularPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }

}
