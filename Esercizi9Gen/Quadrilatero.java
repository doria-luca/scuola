package Esercizi9Gen;

public class Quadrilatero {
    protected Punto puntoA;
    protected Punto puntoB;
    protected Punto puntoC;
    protected Punto puntoD;
    public Quadrilatero(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }
    public Punto getPuntoA() {
        return puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public Punto getPuntoC() {
        return puntoC;
    }

    public Punto getPuntoD() {
        return puntoD;
    }
    
    public void trasla(Direzione direzione, int distanza){
        puntoA.trasla(direzione, distanza);
        puntoB.trasla(direzione, distanza);
        puntoC.trasla(direzione, distanza);
        puntoD.trasla(direzione, distanza);
    }

    public double getPerimetro(){
        return puntoA.distanza(puntoB) + puntoB.distanza(puntoC) + puntoC.distanza(puntoD) + puntoD.distanza(puntoA);
    }
    
    @Override
    public String toString(){
        return "[A: " + puntoA + " - B: " + puntoB + " - C: " + puntoC + " - D: " + puntoD + "]";
    }
}
