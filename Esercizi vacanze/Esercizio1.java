import java.util.Scanner;

public class Esercizio1 {
    public static int[][] creaMatrice(int n, int m){
        int[][] matrice = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrice[i][j] = (int)(Math.random() * 100);
            }
        }
        return matrice;
    }

    public static void traspostaMatrice(int[][] matrice){
        int n = matrice.length;
        int m = matrice[0].length;
        int[][] trasposta = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                trasposta[j][i] = matrice[i][j];
            }
        }
        stampaMatrice(trasposta);
    }

    public static void scambiaRighe(int[][] matrice, int r1, int r2){
        int[] temp = matrice[r1];
        matrice[r1] = matrice[r2];
        matrice[r2] = temp;
    }

    public static void scambiaColonne(int[][] matrice, int c1, int c2){
        for(int i = 0; i < matrice.length; i++){
            int temp = matrice[i][c1];
            matrice[i][c1] = matrice[i][c2];
            matrice[i][c2] = temp;
        }
    }

    public static void sommaRighe(int[][] matrice){
        for (int i = 0; i < matrice.length; i++) {
            int somma = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[i][j];
            }
            System.out.println("La somma della riga " + i + " è: " + somma);
        }
    }

    public static void sommaColonne(int[][] matrice){
        for (int j = 0; j < matrice[0].length; j++) {
            int somma = 0;
            for (int i = 0; i < matrice.length; i++) {
                somma += matrice[i][j];
            }
            System.out.println("La somma della colonna " + j + " è: " + somma);
        }
    }
    
    public static void stampaMatrice(int[][] matrice){
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Inserisci il numero di righe della matrice: ");
        int n = kbd.nextInt();
        System.out.print("Inserisci il numero di colonne della matrice: ");
        int m = kbd.nextInt();
        int[][] matrice = creaMatrice(n, m);
        System.out.println("Matrice generata:");
        stampaMatrice(matrice);

        boolean ciclo = true;

        while(ciclo){
            System.out.println("1. Trasposta\n2. ScambiaRighe\n3. ScambiaColonne\n4. SommaRighe\n5. SommaColonne\n6. Esci");
            int cosa = kbd.nextInt();
            switch (cosa) {
                case 1:
                    traspostaMatrice(matrice);
                    break;
                case 2:
                    System.out.println("Inserisci la prima riga da scambiare (0 - "+ (n - 1) + "):");
                    int r1 = kbd.nextInt();
                    System.out.println("Inserisci la seconda riga da scambiare (0 - "+ (n - 1) + "):");
                    int r2 = kbd.nextInt();
                    scambiaRighe(matrice, r1, r2);
                    stampaMatrice(matrice);
                    break;
                case 3:
                    System.out.println("Inserisci la prima colonna da scambiare (0 - "+ (m - 1) + "):");
                    int c1 = kbd.nextInt();
                    System.out.println("Inserisci la seconda colonna da scambiare (0 - "+ (m - 1) + "):");
                    int c2 = kbd.nextInt();
                    scambiaColonne(matrice, c1, c2);
                    stampaMatrice(matrice);
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