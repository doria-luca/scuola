import java.util.Scanner;

public class MainEs1 extends Metodi {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Inserisci il numero di righe della matrice: ");
        int n = kbd.nextInt();
        System.out.print("Inserisci il numero di colonne della matrice: ");
        int m = kbd.nextInt();
        int[][] matrice = creaMatrice(n, m);
        System.out.println("Matrice generata:");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        boolean ciclo = true;

        while(ciclo){
            System.out.println("1. Trasposta\n2. ScambiaRighe\n3. ScambiaColonne\n4. SommaRighe\n5. SommaColonne\n6. Esci");
            int cosa = kbd.nextInt();
            switch (cosa) {
                case 1:
                    traspostaMatrice(matrice);
                    for (int i = 0; i < matrice.length; i++) {
                        for (int j = 0; j < matrice[i].length; j++) {
                            System.out.print(matrice[i][j] + "\t");
                            }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Inserisci la prima riga da scambiare (0 - "+ (n - 1) + "):");
                    int r1 = kbd.nextInt();
                    System.out.println("Inserisci la seconda riga da scambiare (0 - "+ (n - 1) + "):");
                    int r2 = kbd.nextInt();
                    scambiaRighe(matrice, r1, r2);
                    for (int i = 0; i < matrice.length; i++) {
                        for (int j = 0; j < matrice[i].length; j++) {
                            System.out.print(matrice[i][j] + "\t");
                            }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Inserisci la prima colonna da scambiare (0 - "+ (m - 1) + "):");
                    int c1 = kbd.nextInt();
                    System.out.println("Inserisci la seconda colonna da scambiare (0 - "+ (m - 1) + "):");
                    int c2 = kbd.nextInt();
                    scambiaColonne(matrice, c1, c2);
                    for (int i = 0; i < matrice.length; i++) {
                        for (int j = 0; j < matrice[i].length; j++) {
                            System.out.print(matrice[i][j] + "\t");
                            }
                        System.out.println();
                    }
                    break;
                case 4:
                    sommaRighe(matrice);
                    break;
                case 5:
                    sommaColonne(matrice);
                    break;
                case 6:
                    System.out.println("Uscire");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Scelta non valida, riprovare!");
                    break;
            }
        }
        kbd.close();
    }
}
