package Geometria2D;

public class trapecio {
    private double lado,baseMayor, baseMenor, altura,  areaTrapecio, perimetroTrapecio;

    public trapecio(double lado, double baseMayor, double baseMenor, double altura) {
        this.lado = lado;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public void areaTrapecio(){
        areaTrapecio = ((this.baseMayor+this.baseMenor)/2)*this.altura;
    }

    public void perimetroTrAapecio(){
        perimetroTrapecio = this.baseMayor+this.baseMenor+this.lado+this.lado;
    }

    public double getAreaTrapecio() {
        return areaTrapecio;
    }

    public double getPerimetroTrapecio() {
        return perimetroTrapecio;
    }
}
