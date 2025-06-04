/**
 * Übung: ZweiZahlenRechner
 * Erstellt: November 2024
 *
 * Beschreibung:
 * In dieser Übung werden zwei ganze Zahlen per Konsole eingegeben und
 * anschließend die Grundrechenarten darauf angewendet. Die Ergebnisse werden
 * auf der Konsole ausgegeben.
 *
 * Lernziele:
 * - Umgang mit dem Scanner zur Benutzereingabe
 * - Deklaration und Verwendung von Variablen
 * - einfache arithmetische Operationen (+, -, *, /)
 * - Ein- und Ausgabe mit System.out.println
 * - einfache if-else-Verzweigung zur Fehlervermeidung
 *
 * Eigene Erweiterungsideen:
 * - eigene Methoden für die Berechnungen erstellen
 * - Eingabeprüfung für nicht-numerische Inputs integrieren
 * - Auswahl der Rechenoperationen in einem Konsolen-Menü
 */

import java.util.Scanner;

public class ZweiZahlenRechner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int summe;
        int diff;
        int prod;
        double quot;

        //Eingabeaufforderung für zwei ganze Zahlen
        System.out.println("__________________________________________________");
        System.out.println("Willkommen zur Demonstration der Grundrechenarten!");
        System.out.println("__________________________________________________");
        System.out.println("Bitte geben Sie eine ganze Zahl ein:");
        a = scanner.nextInt();

        System.out.println("Bitte geben Sie eine weitere ganze Zahl ein:");
        b = scanner.nextInt();

        summe = a + b;
        diff = a - b;
        prod = a * b;

        // Division durch 0 ausschließen
        if (b != 0) {
            quot = (double) a / b;
        } else {
            quot = Double.NaN;
        }

        System.out.println("___________");
        System.out.println("Rechnungen:");
        System.out.println(a + " + " + b + " = " + summe);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + prod);

        // Divisionsergebnis oder Fehlermeldung ausgeben
        if (b != 0) {
             System.out.println(a + " : " + b + " = " + quot);
        } else {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
        }

        scanner.close();
    }
}
