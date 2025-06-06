import java.sql.SQLOutput;

/**
 * Übung: FakultaetsRechner
 * Erstellt: November 2024
 * Überarbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung wird die Fakultät einer gegebenen Zahl n rekursiv berechnet.
 * Für ungültige Eingaben (n < 0) wird als Fehlerwert -1 zurückgegeben.
 * Die main()-Methode testet die Berechnung für mehrere aufeinanderfolgende Zahlenwerte.
 *
 * Lernziele:
 * - Rekursive Methoden verstehen und anwenden
 * - Bedingte Rückgaben und einfache Fehlerbehandlung ohne Exceptions
 * - Verwendung einer for-Schleife zur Wiederholung von Testfällen
 * - Einfache Konsolenausgabe mit System.out.println
 *
 * Eigene Erweiterungsideen:
 * - Einführung eines Eingabewerts über Konsole (Scanner)
 * - Umstellung auf Exception-basierte Fehlerbehandlung
 * - Unit-Tests mit JUnit
 */


public class FakultaetsRechner {

    /**
     * Berechnet die Fakultät einer nichtnegativen ganzen Zahl n rekursiv.
     * @param n Die Zahl, deren Fakultät berechnet werden soll
     * @return Fakultät von n (n!) oder -1 als Fehlerwert bei negativem Parameter
     */
    public static int berechneFakultaet(int n){
        if (n < 0) {
            return -1; // Fehlersignal
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * berechneFakultaet(n - 1);
    }

    /**
     * Hauptmethode zum Testen der Funktion.
     * Gibt die berechneten Ergebnisse für 8 Beispielwerte aus.
     */
    public static void main(String[] args) {
        for (int i = -2; i < 5; i++) {
            int ergebnis = berechneFakultaet(i);

            if (ergebnis == -1){
                System.out.println("Ungültige Eingabe: negative Zahl " + i);
            } else {
                System.out.println(i + "! = " + ergebnis);
            }
        }
    }
}

