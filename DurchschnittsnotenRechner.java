/**
 * Übung: DurchschnittsnotenRechner
 * Erstellt: November 2024
 *
 * Beschreibung:
 * In dieser Übung wird aus der Anzahl der Schüler:innen und der Durchschnittsnote
 * die Gesamtanzahl der Notenpunkte berechnet.
 *
 * Lernziele:
 * - Deklaration und Initialisierung einfacher Variablen
 * - Arithmetische Operatoren (*, +=)
 * - Einfache Ausgabe mit System.out.println
 *
 * Eigene Erweiterungsideen:
 * - Eingabe von Schülerzahl und Notenschnitt per Konsole
 * - Berechnung der Notenpunkte innerhalb einer Funktion
 */

public class DurchschnittsnotenRechner {
    public static void main(String[] args){
        int anzahlSchueler = 28;
        anzahlSchueler += 2;

        double durchschnittsnote = 2.7;
        double gesamtNotenpunkte = anzahlSchueler*durchschnittsnote;

        System.out.println(anzahlSchueler + " Schüler:innen");
        System.out.println(gesamtNotenpunkte + " Notenpunkte");
    }
}
