package Esercizi9Gen;

public class Rombo extends Parallelogramma {
    protected int lunghezzaLato;
    protected int angolo;
    protected int lunghezzaDiagonali;;
    public Rombo(Punto puntoCentro, int lunghezzaLato, int angolo) {
        super(puntoCentro, lunghezzaLato, lunghezzaLato, angolo);
    }

    public Rombo(Punto puntoCentro, int lunghezzaDiagonali) {
        super(puntoCentro, (int) Math.sqrt(Math.pow(lunghezzaDiagonali / 2, 2) * 2), (int) Math.sqrt(Math.pow(lunghezzaDiagonali / 2, 2) * 2), 45);
    }

    public int getLunghezzaLato() {
        return lunghezzaLato;
    }
    
    public int getAngolo() {
        return angolo;
    }

    public int getLunghezzaDiagonali() {
        return lunghezzaDiagonali;
    }
}