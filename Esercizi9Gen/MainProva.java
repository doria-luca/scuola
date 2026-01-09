package Esercizi9Gen;

public class MainProva {
    public static void main(String[] args) {
        Punto p1 = new Punto(11, 7);
        System.out.println(p1.toString());
        p1.trasla(Direzione.SU, 3);
        System.out.println(p1.toString());
        p1.trasla(Direzione.GIU, 4);
        System.out.println(p1.toString());
        p1.trasla(Direzione.DESTRA, 5);
        System.out.println(p1.toString());
        p1.trasla(Direzione.SINISTRA, 6);
        System.out.println(p1.toString());
    }
}
