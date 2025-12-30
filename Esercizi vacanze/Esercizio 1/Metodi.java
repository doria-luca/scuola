public class Metodi {
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
    
}