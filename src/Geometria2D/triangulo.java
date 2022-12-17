package Geometria2D;

public class triangulo {
    private double lado1, lado2, lado3, base, altura, areaTriangulo, perimetroTriangulo;

    public triangulo(double lado1, double lado2, double lado3, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    public void areaTriangulo(){
        areaTriangulo = ((1/2)*this.base*this.altura);
    }
    public  void  perimetroTriangulo(){
        perimetroTriangulo = this.lado1+this.lado2+this.lado3;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public double getPerimetroTriangulo() {
        return perimetroTriangulo;
    }
}
