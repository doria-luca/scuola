package Esercizi9Gen;

public class Parallelogramma extends Quadrilatero {
    protected int lunghezza;
    protected int altezza;
    protected int angolo;
    public Parallelogramma(Punto puntoA, int lunghezza, int altezza, int angolo) {
        super(puntoA, new Punto(puntoA.getX() + lunghezza, puntoA.getY()), calcolaPuntoC(puntoA, altezza, lunghezza, angolo), calcolaPuntoD(puntoA, altezza, angolo));
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getAngolo() {
        return angolo;
    }

    private static Punto calcolaPuntoC(Punto puntoA, int altezza, int lunghezza, int angolo) {
        Punto puntoD = calcolaPuntoD(puntoA, altezza, angolo);
        return new Punto(puntoD.getX() + lunghezza, puntoD.getY());
    }

    private static Punto calcolaPuntoD(Punto puntoA, int altezza, int angolo) {
        int deltaX = (int) Math.round(altezza / Math.tan(Math.toRadians(angolo)));
        return new Punto(puntoA.getX() + deltaX, puntoA.getY() + altezza);
    }
}