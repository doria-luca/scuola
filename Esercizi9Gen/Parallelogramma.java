package Esercizi9Gen;

public class Parallelogramma extends Quadrilatero {
    public Parallelogramma(Punto puntoA, int altezzaAdiacenti, int lunghezzaAdiacenti, int angolo) {
        super(puntoA, puntoA.trasla(Direzione.DESTRA, lunghezzaAdiacenti), puntoA.trasla(Direzione.SINISTRA, lunghezzaAdiacenti).calcolaCoordinate(altezzaAdiacenti, angolo), puntoA.trasla(Direzione.DESTRA, lunghezzaAdiacenti));
    }
}