package Esercizi9Gen;

public class Quadrato extends Rettangolo {
    protected int lunghezzaLato;
    public Quadrato(Punto puntoA, int lunghezzaLato) {
        super(puntoA, lunghezzaLato, lunghezzaLato);
    }

    public int getLunghezzaLato() {
        return lunghezzaLato;
    }
}
