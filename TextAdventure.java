/**
 * Übung: TextAdventure
 * Erstellt: November 2024
 * Überarbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung wird ein einfaches, konsolenbasiertes Text-Adventure simuliert.
 * Der Spieler durchläuft mehrere Räume und muss jeweils die richtige Entscheidung treffen,
 * um in den nächsten Raum zu gelangen. Das Spiel endet, wenn Raum 5 erreicht ist und kann
 * anschließend auf Wunsch wiederholt werden.
 *
 * Lernziele:
 * - Anwendung von Kontrollstrukturen (switch-case, while, for, do-while)
 * - Einfache Benutzereingabe über Scanner
 * - Strukturierung eines Spiels mit fortschreitender Spiellogik
 *
 * Eigene Erweiterungsideen:
 * - variieren, welche Raum-Entscheidung weiterführt
 * - Auslagerung der Raum-Logik in eigene Methoden
 * - Eingabe-Validierung und Fehlerbehandlung mit try-catch
 * - Ausbau der Story, u.a. mit ASCII-Art oder kleinen Rätseln
 */

import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String raum0 = "Es ist finster!";
        String raum1 = "Die Wände bewegen sich auf dich zu!";
        String raum2 = "Der Boden ist Lava!";
        String raum3 = "Du riechst giftige Gase!";
        String raum4 = "Du kannst die rettende Außenwelt schon hören!";
        String raum5 = "Geschafft! Du bist gerettet!";
        String antwortWeiterspielen;

        System.out.println("WILLKOMMEN IM TEXT-ADVENTURE!");
        System.out.println("____________________________________________________");

        //do-while-Schleife: Spielwiederholungen steuern
        do{
            //for-Schleife: ein Durchlauf pro Raum im Spiel
            for(int raum = 0; raum <= 5; raum++){
                boolean durchgespielt = false;

                //Ausgabe der Raumbeschreibung
                System.out.println("Du befindest dich jetzt in Raum " + raum + ".");
                switch(raum){
                    case 0: System.out.println(raum0);
                        break;
                    case 1: System.out.println(raum1);
                        break;
                    case 2: System.out.println(raum2);
                        break;
                    case 3: System.out.println(raum3);
                        break;
                    case 4: System.out.println(raum4);
                        break;
                    case 5: System.out.println(raum5);
                        durchgespielt = true;
                        break;
                }

                //while-Schleife: Lösungsweg erfragen
                while(!durchgespielt){
                    System.out.println("___");
                    System.out.println("Wie willst du dich entscheiden, um weiterzukommen?");
                    System.out.println("1 = links gehen, 2 = rechts gehen, 3 = geradeaus gehen");
                    int entscheidung = scanner.nextInt();

                    //switch-case: Entscheidung des Spielers bewerten
                    switch(entscheidung){
                        case 1 : //richtige Wahl: Schleife beenden = nächster Raum
                            durchgespielt = true;
                            System.out.println("Gute Wahl! Du gelangst in den nächsten Raum!");
                            System.out.println("____________________________________________");
                            break;
                        case 2 : //falsche Wahl: erneut nach Lösungsweg fragen
                            System.out.println("Das bringt dich hier nicht weiter!");
                            break;
                        case 3 : //falsche Wahl: erneut nach Lösungsweg fragen
                            System.out.println("Überlege dir etwas besseres!");
                            break;
                        default: //ungültige Wahl: erneut nach Lösungsweg fragen
                            System.out.println("Diese Option hast du hier nicht!");
                            break;
                    }
                }
            }

            //Ende der Spielrunde
            System.out.println("________________________________");
            System.out.println("________________________________");
            System.out.println("Möchtest du noch einmal spielen?");
            antwortWeiterspielen = scanner.next();

        } while(antwortWeiterspielen.equalsIgnoreCase("ja"));

        //Ende des Spiels
        System.out.println("Danke fürs Spielen");
        scanner.close();
    }
}
