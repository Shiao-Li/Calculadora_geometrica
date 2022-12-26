package Geometria2D;

public class cuadrado extends Figuras2D {
    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea(){
        this.area = Math.pow(this.lado, 2);
    }
    protected void calcularPerimetro(){
        this.perimetro = 4 * this.lado;
    }

}
