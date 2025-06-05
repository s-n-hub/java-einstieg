/**
 * Übung: KreisflaechenRechner
 * Erstellt: November 2024
 * Überarbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung wird der Flächeninhalt eines Kreises auf Basis eines gegebenen Radius berechnet.
 * Die Berechnung erfolgt mit der mathematischen Formel A = π * r² unter Verwendung von Math.PI.
 * Die Methode wird zweimal aufgerufen, und die Ergebnisse werden ausgegeben.
 *
 * Lernziele:
 * - Definition und Aufruf von Methoden mit Parameter und Rückgabewert
 * - Verwendung der Konstanten Math.PI
 * - Einfache mathematische Berechnungen und Ausgabe mit System.out.println
 *
 * Eigene Erweiterungsideen:
 * - Eingabe des Radius über die Konsole (z.B. mit Scanner)
 * - Fehlerbehandlung bei ungültigen Eingaben (z.B. negativer Radius)
 * - Ergänzung um weitere geometrische Formen
 * - Einsatz von JavaDoc zur Dokumentation einer Methode
 */

public class KreisflaechenRechner {

    /**
     * Berechnet die Fläche eines Kreises anhand des Radius.
     * @param radius Der Radius des Kreises
     * @return Die Kreisfläche
     */
    public static double berechneKreisflaeche(double radius){
        return Math.PI * radius * radius;
    }

    /**
     * Hauptmethode zum Testen der Kreisflächenberechnung.
     * Gibt die berechneten Flächen für zwei feste Radien aus.
     */
    public static void main(String[] args){
        double radius1 = 5;
        double radius2 = 7.5;

        double kreisflaeche1 = berechneKreisflaeche(radius1);
        double kreisflaeche2 = berechneKreisflaeche(radius2);

        System.out.println("Fläche bei Radius " + radius1 + ": " + kreisflaeche1);
        System.out.println("Fläche bei Radius " + radius2 + ": " + kreisflaeche2);
    }
}
