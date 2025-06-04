/**
 * Übung: SchleifenDemo
 * Erstellt: November 2024
 * Überarbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung werden drei verschiedene Schleifentypen demonstriert:
 * - while-Schleife: Ausgabe der Zahlen 1 bis 10
 * - do-while-Schleife: Benutzereingabe eines „Zauberworts“
 * - for-Schleife: Rückwärtszählen von 10 bis 1
 *
 * Lernziele:
 * - Verständnis unterschiedlicher Schleifenarten (while, do-while, for)
 * - Verwendung von Kontrollstrukturen zur Steuerung des Programmablaufs
 * - Einfache Benutzereingabe mit Scanner und Vergleich von Strings
 *
 * Eigene Erweiterungsideen:
 * - Auslagerung der einzelnen Schleifen in separate Methoden
 * - Ausgabe-Verzögerung mit Thread.sleep(), um den Zahlenlauf sichtbar zu machen
 */


import java.util.Scanner;

 class SchleifenDemo{
    public static void main(String[] args){
        // Ausgabe der Zahlen von 1 bis 10 mit einer while-Schleife
        int i = 1;

        System.out.println("___________");
        System.out.println("Zählen wir!");
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("___________");

        // do-while-Schleife, die durch eine Benutzereingabe beendet wird
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        do {
            System.out.println("Bitte (<-) geben Sie das Zauberwort ein!");
            eingabe = scanner.next();
        } while (!eingabe.equalsIgnoreCase("bitte"));
        System.out.println("Danke!");
        scanner.close();

        // Ausgabe der Zahlen von 10 bis 1 mit einer for-Schleife
        System.out.println("___________");
        System.out.println("Countdown!");

        for(int j = 10; j > 0; j--){
            System.out.println(j);
        }
        System.out.println("___________");
    }
 }