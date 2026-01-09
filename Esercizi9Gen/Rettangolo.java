package Esercizi9Gen;

public class Rettangolo extends Quadrilatero{

    public Rettangolo(Punto puntoA, int larghezza, int altezza) {
        super(puntoA, puntoA.trasla(Direzione.DESTRA, larghezza), puntoA.trasla(Direzione.SU, altezza), puntoA.trasla(Direzione.SINISTRA, larghezza));
    }
    
    public double getArea(){
        return puntoA.distanza(puntoB) * puntoB.distanza(puntoC);
    }

    @Override
    public String toString(){
        return "Rettangolo: " + super.toString();
    }
}
