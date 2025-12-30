import java.util.Scanner;

public class MainEs2 {
    public static Corsa trovaMigliore(Corsa[] sessioni){
        Corsa migliore = sessioni[0];
        for (int i = 1; i < sessioni.length; i++) {
            if (sessioni[i].calcolaPunteggio() > migliore.calcolaPunteggio()) {
                migliore = sessioni[i];
            }
        }
        return migliore;
    }

    public static double kilometriTotaliPercorsi(Corsa[] sessioni){
        double totale = 0;
        for (int i = 0; i < sessioni.length; i++) {
            totale += sessioni[i].getDistanza();
        }
        return totale;
    }

    public static double mediaPunteggio(Corsa[] sessioni){
        double totale = 0;
        for (int i = 0; i < sessioni.length; i++) {
            totale += sessioni[i].calcolaPunteggio();
        }
        return totale / sessioni.length;
    }

    public static Corsa[] filtraUtente(Corsa[] sessioni, String nomeAtleta){
        String[] utenti = utenti(sessioni);
        for (int i = 0; i < utenti.length; i++) {
            if (utenti[i].equals(nomeAtleta)) {
                break;
            }
            else if (i == utenti.length - 1){
                System.out.println("Atleta " + nomeAtleta + " non trovato nelle corse");
                return new Corsa[0];
            }
        }
        int quant = 0;
        for (int i = 0; i < sessioni.length; i++) {
            if (sessioni[i].getAtleta().equals(nomeAtleta)) {
                quant++;
            }
        }
        Corsa[] sessioniAtleta = new Corsa[quant];
        int j = 0;
        for (int i = 0; i < sessioni.length; i++) {
            if (sessioni[i].getAtleta().equals(nomeAtleta)) {
                sessioniAtleta[j] = sessioni[i];
                j++;
            }
        }
        return sessioniAtleta;
    }

    public static void stampaCorse(Corsa[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static String[] utenti(Corsa[] sessioni){
        int cont = 0;
        for (int i = 0; i < sessioni.length; i++) {
            boolean presente = false;
            for (int j = 0; j < i; j++) {
                if (sessioni[i].getAtleta().equals(sessioni[j].getAtleta())){
                    presente = true;
                    break;
                }
            }
            if (!presente){
                cont++;
            }
        }
        String[] nomi = new String[cont];
        for (int i = 0; i < sessioni.length; i++) {
            if (i != 0){
                boolean presente = false;
                for (int j = 0; j < i; j++) {
                    if (sessioni[i].getAtleta().equals(nomi[j])){
                        presente = true;
                        break;
                    }
                }
                if (!presente){
                    nomi[i] = sessioni[i].getAtleta();
                }
            } else {
                nomi[i] = sessioni[i].getAtleta();
            }
        }
        return nomi;
    }

    public static void stampaNomiPiloti(String[] nomi){
        for (int i = 0; i < nomi.length; i++) {
            System.out.println(nomi[i]);
        }
    }

    public static void statistichePiloti(Corsa[] sessioni){
        String[] nomiPiloti = utenti(sessioni);
        for (int i = 0; i < nomiPiloti.length; i++) {
            Corsa[] corsePilota = filtraUtente(sessioni, nomiPiloti[i]);
            double totaleDistanza = kilometriTotaliPercorsi(corsePilota);
            double mediaPunteggio = mediaPunteggio(corsePilota);
            System.out.println("Pilota: " + nomiPiloti[i]);
            System.out.println("Totale distanza: " + totaleDistanza + " km");
            System.out.println("Media punteggio: " + mediaPunteggio);
            System.out.println("-------------------------");
        }
    }

    public static String analizzaProgressi(Corsa[] sessioni, String nomeAtleta){
        Corsa[] corsePilota = filtraUtente(sessioni, nomeAtleta);
        if (corsePilota.length == 0){
            return "Atleta " + nomeAtleta + " non trovato nelle corse";
        }
        else if (corsePilota.length == 1){
            return "Prima sessione registrata per " + nomeAtleta + ". Continua così!";
        }
        double mediaPunti = 0;
        for (int i = 0; i < corsePilota.length - 1; i++) {
            mediaPunti += corsePilota[i].calcolaPunteggio();
        };
        mediaPunti = mediaPunti / (corsePilota.length - 1);
        double ultimoPunteggio = corsePilota[corsePilota.length - 1].calcolaPunteggio();
        if (ultimoPunteggio > mediaPunti){
            return "Ottimo lavoro " + nomeAtleta + "! Sei in miglioramento! (+" + (ultimoPunteggio - mediaPunti) + " punti rispetto alla media)";
        } else if (ultimoPunteggio < mediaPunti){
            return "Continua ad allenarti " + nomeAtleta + "! (-" + (mediaPunti - ultimoPunteggio) + " punti rispetto alla media)";
        } else {
            return nomeAtleta + " ha mantenuto lo stesso ritmo di " + ultimoPunteggio;
        }
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        Corsa[] sessioni = {
            new CorsaMontagna("Max Verstappen", 11.2, 45, 108),
            new CorsaMontagna("Pierre Gasly", 13.8, 52, 103),
            new CorsaPioggia("Charles Leclerc", 23.7, 58, 7),
            new CorsaPioggia("Max Verstappen", 11.6, 42, 3),
            new Corsa("Charles Leclerc", 18.2, 63),
            new Corsa("Pierre Gasly", 16.4, 56)
        };

        for (int i = 0; i < sessioni.length; i++) {
            System.out.println(sessioni[i].toString());
        }

        System.out.println("-------------------------");
        System.out.println("Migliore sessione: " + trovaMigliore(sessioni));
        System.out.println("-------------------------");
        System.out.println("Totale chilometri percorsi: " + kilometriTotaliPercorsi(sessioni));
        System.out.println("-------------------------");
        System.out.println("Media punteggio: " + mediaPunteggio(sessioni));
        System.out.println("-------------------------");
        System.out.print("Di che pilota vuoi vedere le sessioni? ");
        String atleta = kbd.nextLine();
        stampaCorse(filtraUtente(sessioni, atleta));
        System.out.println("-------------------------");
        stampaNomiPiloti(utenti(sessioni));
        System.out.println("-------------------------");
        statistichePiloti(sessioni);
        System.out.print("Di che pilota vuoi analizzare i progressi? ");
        atleta = kbd.nextLine();
        System.out.println(analizzaProgressi(sessioni, atleta));
        System.out.println("-------------------------");
        kbd.close();
    }
}