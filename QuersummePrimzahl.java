/**
 * Übung: QuersummePrimzahl
 * Erstellt: November 2024
 * Überarbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung werden zwei Analysen für ganze Zahlen umgesetzt:
 * die Berechnung der Quersumme und die Prüfung, ob es sich um eine Primzahl
 * handelt. Die Analysen werden über eine zentrale Methode aufgerufen, die anhand
 * eines String-Parameters entscheidet, welche Funktion ausgeführt wird.
 *
 * Lernziele:
 * - Anwendung von Kontrollstrukturen (if, while, for, switch)
 * - Modulare Methodenstruktur
 * - Umgang mit Zeichenketten und Eingabevalidierung
 * - Grundlagen mathematischer Verfahren (Primzahl, Ziffernsumme)
 *
 * Eigene Erweiterungsideen:
 * - Effizientere Primzahlprüfung mit Quadratwurzelgrenze
 * - JUnit-Tests zur methodischen Absicherung
 * - GUI oder Konsoleneingabe zur interaktiven Anwendung
 */

public class QuersummePrimzahl {

    /**
     * Berechnet die Quersumme einer Ganzzahl.
     * @param ganzzahl Die Eingabezahl (positiv oder negativ)
     * @return Die Quersumme als Summe der einzelnen Ziffern
     */
    public static int berechneQuersumme(int ganzzahl){
        int quersumme = 0;
        int hilfszahl = Math.abs(ganzzahl);  // negatives Vorzeichen entfernen

        while(hilfszahl > 0){
            quersumme += hilfszahl % 10;    // letzte Ziffer zur Quersumme addieren
            hilfszahl /= 10;                // letzte Ziffer entfernen
        }

        return quersumme;
    }

    /**
     * Prüft, ob eine Zahl eine Primzahl ist
     * @param ganzzahl Die zu prüfende Zahl.
     * @return Boolean (true = Primzahl, false = keine Primzahl)
     */
    public static boolean istPrimzahl(int ganzzahl) {
        // keine Primzahlen per Definition:
        if (ganzzahl <= 1) {
            return false;
        }

        // Prüfung der übrigen Zahlen:
        for (int i = (ganzzahl - 1); i > 1; i--) {
            if (ganzzahl % i == 0) { // Teiler gefunden, keine Primzahl
                return false;
            }
        }
        return true;
    }

    /**
     * Führt die Analyse einer Ganzzahl durch: entweder Quersumme oder Primzahlprüfung.
     *
     * @param ganzzahl Die zu analysierende Zahl.
     * @param aufgabe Analyseoption: "quersumme" ruft berechneQuersumme auf,
     *                "primzahl" ruft istPrimzahl auf.
     * @return Ein Text mit dem Analyseergebnis oder eine Fehlermeldung bei ungültigem Parameter.
     */
    public static String analysiereZahl(int ganzzahl, String aufgabe){
        String ergebnis;

        switch(aufgabe.toLowerCase()){
            case "quersumme":
                ergebnis = "Die Quersumme von " + ganzzahl + " ist " + berechneQuersumme(ganzzahl) + ".";
                break;
            case "primzahl":
                boolean istPrimzahl = istPrimzahl(ganzzahl);
                if(istPrimzahl){
                    ergebnis = ganzzahl + " ist eine Primzahl.";
                }
                else{
                    ergebnis = ganzzahl + " ist keine Primzahl.";
                }
                break;
            default:
                ergebnis = "Ungültige Eingabe. Bitte 'quersumme' oder 'primzahl' als zweiten Parameter übergeben.";
                break;
        }
        return ergebnis;
    }

    /**
     * Hauptmethode zum Testen der Funktionen.
     * Gibt die berechneten Ergebnisse für 8 Parameter-Variationen aus.
     */
    public static void main(String[] args) {
        // Aufruf der Primzahl-Funktion
        System.out.println(analysiereZahl(136, "primzahl"));
        System.out.println(analysiereZahl(73, "primzahl"));
        System.out.println(analysiereZahl(-17, "primzahl"));
        System.out.println(analysiereZahl(17, "Primzahl"));

        // Aufruf der Quersummen-Funktion
        System.out.println(analysiereZahl(7398, "quersumme"));
        System.out.println(analysiereZahl(136, "quersumme"));
        System.out.println(analysiereZahl(-17, "quersumme"));
        System.out.println(analysiereZahl(13652, "Quersumme"));
    }
}
