package Geometria3D;

public class troncoCono {
    private double radioMenor;
    private double radioMayor;
    private double altura;
    private double generatriz;
    private double volumen;
    private double areaSuperficial;

    //Constructor
    public troncoCono(double radioMenor, double radioMayor, double altura) {
        this.radioMenor = radioMenor;
        this.radioMayor = radioMayor;
        this.altura = altura;
    }
    //Metodos
    public void calcularAreaSuperficial(){
        generatriz = Math.sqrt(Math.pow(this.altura,2) + Math.pow(this.radioMayor - this.radioMenor,2));
        areaSuperficial = Math.PI * (generatriz * (this.radioMenor + this.radioMayor) + Math.pow(this.radioMenor,2))
                + Math.pow(this.radioMayor,2);
    }
    public void calcularVolumen(){
        volumen = Math.PI * this.altura * (Math.pow(this.radioMayor,2) + Math.pow(this.radioMenor,2) +
                this.radioMayor*this.radioMenor)/3;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getAreaSuperficial() {
        return areaSuperficial;
    }
}
