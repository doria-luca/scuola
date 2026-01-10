package Esercizi9Gen;

public class Main {
    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Quadrilatero(new Punto(0,0), new Punto(4,0), new Punto(4,3), new Punto(0,3));
        Parallelogramma parallelogramma = new Parallelogramma(new Punto(0,0), 4, 3, 1);
        Quadrato quadrato = new Quadrato(new Punto(0,0), 4);
        Rettangolo rettangolo = new Rettangolo(new Punto(0,0), 4, 3);
        Rombo rombo = new Rombo(new Punto(0,0), 4, 3);
        Rombo romboDiagonali = new Rombo(new Punto(0,0), 5);
        Trapezio trapezioOffset = new Trapezio(new Punto(0,0), 4, 3, 2, 1);  
        Trapezio trapezio = new Trapezio(new Punto(0,0), 4, 3, 2); 

        // Coordinate
        System.out.println(quadrilatero);
        System.out.println(parallelogramma);
        System.out.println(quadrato);
        System.out.println(rettangolo);
        System.out.println(rombo);
        System.out.println(romboDiagonali);
        System.out.println(trapezioOffset);
        System.out.println(trapezio);

        // Perimetri
        System.out.println(quadrilatero.getPerimetro());
        System.out.println(parallelogramma.getPerimetro());
        System.out.println(quadrato.getPerimetro());
        System.out.println(rettangolo.getPerimetro());
        System.out.println(rombo.getPerimetro());
        System.out.println(romboDiagonali.getPerimetro());
        System.out.println(trapezioOffset.getPerimetro());
        System.out.println(trapezio.getPerimetro());

        // Traslazioni
        quadrilatero.trasla(Direzione.SU, 2);
        parallelogramma.trasla(Direzione.SU, 2);
        quadrato.trasla(Direzione.SU, 2);
        rettangolo.trasla(Direzione.SU, 2);
        rombo.trasla(Direzione.SU, 2);
        romboDiagonali.trasla(Direzione.SU, 2);
        trapezioOffset.trasla(Direzione.SU, 2);
        trapezio.trasla(Direzione.SU, 2);

        // Nuove coordinate
        System.out.println(quadrilatero);
        System.out.println(parallelogramma);
        System.out.println(quadrato);
        System.out.println(rettangolo);
        System.out.println(rombo);
        System.out.println(romboDiagonali);
        System.out.println(trapezioOffset);
        System.out.println(trapezio);

        // Nuovi perimetri
        System.out.println(quadrilatero.getPerimetro());
        System.out.println(parallelogramma.getPerimetro());
        System.out.println(quadrato.getPerimetro());
        System.out.println(rettangolo.getPerimetro());
        System.out.println(rombo.getPerimetro());
        System.out.println(romboDiagonali.getPerimetro());
        System.out.println(trapezioOffset.getPerimetro());
        System.out.println(trapezio.getPerimetro());

        // Polimorfismo
        Quadrilatero[] quadrilateri = {
            quadrilatero,
            parallelogramma,
            quadrato,
            rettangolo,
            rombo,
            romboDiagonali,
            trapezioOffset,
            trapezio
        };
        for (int i = 0; i < quadrilateri.length; i++) {
            System.out.println(quadrilateri[i].getPerimetro());
            quadrilateri[i].trasla(Direzione.DESTRA, 3);
            System.out.println(quadrilateri[i]);
        }

        // Bonus
        
    }
}
