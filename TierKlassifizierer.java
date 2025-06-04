/**
 * Übung: TierKlassifizierer
 * Erstellt: November 2024
 *
 * Beschreibung:
 * In dieser Übung werden tierbezogene Informationen über die Konsole abgefragt.
 * Es findet eine Klassifikation nach Lebensdauer und Flugfähigkeit statt.
 * Das Ergebnis wird ausgegeben.
 *
 * Lernziele:
 * - Verwendung des `Scanner`-Objekts zur Benutzereingabe
 * - Arbeiten mit primitiven Datentypen (`int`, `String`)
 * - Vergleich von Strings mit `.equalsIgnoreCase()`
 * - Kontrollstrukturen mit `if`, `else if`, `else`
 * - Strukturierte Konsolenausgabe
 *
 * Eigene Erweiterungsideen:
 * - ungültige Eingaben abfangen und Möglichkeit zur Neueingabe
 * - Auslagerung der Klassifikationen in eigene Methoden
 */


import java.util.Scanner;

 public class TierKlassifizierer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Begrüßung und Abfrage der Eingaben (Name, Lebensdauer, Flugfähigkeit)
        System.out.println("________________________________________");
        System.out.println("Willkommen! Klassifizieren wir Tierchen!");
        System.out.println("________________________________________");
        System.out.println("Name des Tieres:");
        String tierName = scanner.next();
        
        System.out.println("Durchschnittliche Lebensdauer:");
        int lebensdauer = scanner.nextInt();
        
        System.out.println("Kann das Tier fliegen? (ja/nein)");
        String flugFaehigkeit = scanner.next();

        //Klassifikation und Ausgabe
        System.out.println("_______________________");
        System.out.println("Klassifizierung von '" + tierName + "':");

        if(lebensdauer <= 2){
            System.out.println("Das Tier ist kurzlebig.");
        } else if(lebensdauer <= 10){
            System.out.println("Das Tier ist mittellebig.");
        } else {
            System.out.println("Das Tier ist langlebig.");
        }

        //einfache Eingabeprüfung für die Flugfähigkeit
        if(flugFaehigkeit.equalsIgnoreCase("ja")){
            System.out.println("Das Tier ist flugfähig.");
        } else if (flugFaehigkeit.equalsIgnoreCase("nein")) {
            System.out.println("Das Tier ist nicht flugfähig.");
        } else {
            System.out.println("[Die Eingabe zur Flugfähigkeit konnte nicht ausgewertet werden.]");
        }
        System.out.println("_______________________");

        scanner.close();
    }
 }
