package Geometria2D;
public class circulo extends Figuras2D{
    private double radio;
    public circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    //metodos
    @Override
    protected void calcularArea(){
        this.area = Math.PI * (Math.pow(this.radio, 2));
    }
    protected void calcularPerimetro(){
        perimetro = 2 * Math.PI * this.radio;
    }
}
